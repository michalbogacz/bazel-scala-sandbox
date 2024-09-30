load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")
load("@aspect_bazel_lib//lib:tar.bzl", "tar")
load("@rules_oci//oci:defs.bzl", "oci_image", "oci_load")

scala_binary(
    name = "runner",
    srcs = ["Runner.scala"],
    main_class = "cmd.Runner",
    deps = ["//src/main/scala/lib:greeting"],
)

tar(
    name = "layer",
    srcs = [":runner_deploy.jar"],
)

oci_image(
    name = "image",
    base = "@java_temurin",
    entrypoint = [
        "java",
        "-jar",
        "/runner_deploy.jar",
    ],
    tars = [":layer"],
)

oci_load(
    name = "local_image",
    image = ":image",
    repo_tags = ["runner:latest"],
)
