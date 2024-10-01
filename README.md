# Sandbox project

Scala project build by Bazel

## Docker image

Build image
```bash
bazel run //src/main/scala/cmd:local_image
```

Run image
```bash
docker run --rm runner:latest
```