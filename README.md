# intellij-chill-pill
Gives IntelliJ a chill pill

# Build
`./gradlew shadowjar`

# Use
Add to IntelliJ .vmoptions:
`-javaagent:/path/to/the/chill/pill/jar`

If something blows up, remove that line from the .vmoptions file and create a PR to fix the issue.
