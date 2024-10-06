# Sandbox project

Scala project build by Bazel

## Dependencies
After changing dependencies, make sure to run
```bash
bazel run @unpinned_maven//:pin
```

## Docker image

Build image
```bash
bazel run //src/main/scala/cmd:local_image
```

Run image
```bash
docker run --rm runner:latest
```