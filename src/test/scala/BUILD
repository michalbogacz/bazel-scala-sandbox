load("@rules_scala//scala:scala.bzl", "scala_test")

scala_test(
    name = "tests",
    srcs = glob(["**/*.scala"]),
    deps = [
        "//src/main/scala/lib:greeting",
    ],
)
