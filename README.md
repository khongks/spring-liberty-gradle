## Development

1. Create Liberty server.
   ```
   ./gradlew clean libertyCreate -Dtemplate=springBoot3
   ```

2. To run in Dev mode.
   ```
   ./gradlew libertyDev
   ```

3. To run in container support mode
   ```
   ./gradlew libertyDevc
   ```

3. Build the war file and run on Liberty server.
   ```
   ./gradlew build libertyRun
   ```

4. Test using browser.
   ```
   http://localhost:9080/test-gradle
   ```
   
## Build Docker image

1. Build image using podman.
   ```
   podman build -t spring-liberty-gradle:1.0-SNAPSHOT .
   ```

2. Run container.
   ```
   podman run -p 9080:9080 -p 9443:9443 -it spring-liberty-gradle:1.0-SNAPSHOT
   ```

## Reference

- https://openliberty.io/blog/2024/05/01/spring-boot-3.html