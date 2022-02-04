# testing-with-junit

## Assumptions
- Source code cloned from repository (https://github.com/kaygee/testing-with-junit).
- Installed homebrew (http://brew.sh/).
- Installed Java JDK (refer to the `maven.compiler.target` value in the `pom.xml` for the version).
- Installed IntelliJ Community Edition (https://www.jetbrains.com/idea/).

## When you have Homebrew
- `brew install maven`

## When you have IntelliJ
- Select import project
- Select your testing-with-junit folder
- Select import project from external model and select maven

## Surefire Plugin Execution
- `mvn surefire-report:report`
