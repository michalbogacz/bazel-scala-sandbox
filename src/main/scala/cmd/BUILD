load("@rules_scala//scala:scala.bzl", "scala_binary")
load("@rules_oci//oci:defs.bzl", "oci_image", "oci_load")
load("@rules_pkg//:pkg.bzl", "pkg_tar")

scala_binary(
    name = "runner",
    srcs = ["Runner.scala"],
    main_class = "cmd.Runner",
    deps = ["//src/main/scala/lib:greeting"],
)

pkg_tar(
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
