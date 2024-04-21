# quarkus-grpc
A service that handles User interactions.

# dev notes
project created using

```
quarkus create app wonkymic:quarkus-grpc --gradle
```

The following dependency was added to the `build.gradle`

```
implementation 'io.quarkus:quarkus-grpc'
```

The directory `/src/main/proto` was created. When running a gradle build the related java files will be generated under `build/classes/quarkus-generated-sources/grpc`