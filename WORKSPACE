load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "bazel_skylib",
    sha256 = "9f38886a40548c6e96c106b752f242130ee11aaa068a56ba7e56f4511f33e4f2",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.6.1/bazel-skylib-1.6.1.tar.gz",
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.6.1/bazel-skylib-1.6.1.tar.gz",
    ],
)

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")
bazel_skylib_workspace()
http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "3b00fa0b243b04565abb17d3839a5f4fa6cc2cac571f6db9f83c1982ba1e19e5",
    strip_prefix = "rules_scala-6.5.0",
    url = "https://github.com/bazelbuild/rules_scala/releases/download/v6.5.0/rules_scala-v6.5.0.tar.gz",
)

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config(scala_version = "2.13.13")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories(
    overriden_artifacts = {
        # Change both the artifact names and sha256s.
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:{}".format("2.13.13"),
            "sha256": "71853291f61bda32786a866533361cae474344f5b2772a379179b02112444ed3",
        },
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:{}".format("2.13.13"),
            "sha256": "c5a14770370e73a69367b131da1533890200b1e2aa70643b73f9ff31ef2e69ec",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:{}".format("2.13.13"),
            "sha256": "6a46ed9b333857e8b5ea668bb254ed8e47dacd1116bf53ade9467aa4ae8f1818",
        },
    },
)

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()

RULES_JVM_EXTERNAL_TAG = "6.1"
RULES_JVM_EXTERNAL_SHA = "08ea921df02ffe9924123b0686dc04fd0ff875710bfadb7ad42badb931b0fd50"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/releases/download/%s/rules_jvm_external-%s.tar.gz" % (RULES_JVM_EXTERNAL_TAG, RULES_JVM_EXTERNAL_TAG)
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")
maven_install(
    artifacts = [
        "org.scala-lang.modules:scala-xml_2.13:1.3.1",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
