# Sandbox project

Project to test Bazel with Scala in IntelliJ and BSP

# Run

1. Set in IntelliJ registry
`bazel.auto.import.disabled	true`

2. Launch project
```shell
cs launch org.jetbrains.bsp:bazel-bsp:3.1.0 -M org.jetbrains.bsp.bazel.install.Install -- -t //...

idea .
```

### Notes

Created based on https://virtuslab.com/blog/introduction-to-bazel-for-scala-developers/
