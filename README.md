# Stringy - fun with strings!

This repository contains two static Java classes that contain some fun string
functions. The code lives under `src/main/` and the tests are under
`src/test/`. I have supplied some basic tests to demonstrate the API and check
my own work. Your job is to supply a full suite of unit tests that cover
a variety of possible bugs, including error conditions.

Note that the code assumes you have a very recent release of Java. I used
OpenJDK 11. The project uses Gradle, a popular system for automating
development tasks, to run tests. You shouldn't need to install Gradle since the
project includes a Gradle "wrapper". Just run `./gradlew` instead of the normal
`gradle` command and it should work fine (it will install itself the first time
you run it if necessary). If, however, you do wish you install Gradle you can
check the following:

  * Gradle installation instructions:
    <https://docs.gradle.org/current/userguide/installation.html>
  * Community maintained Ubuntu repository (this is what I used instead of the
    instructions above):
    <https://launchpad.net/~cwchien/+archive/ubuntu/gradle>

There are also Gradle plugins to set up the repo to work with [Jetbrains
IntelliJ](https://www.jetbrains.com/idea/) which is closed-source but available
for free and [Eclipse](https://www.eclipse.org/). To set up the project for
IntelliJ run `./gradlew idea`. To set up the project for Eclipse run `./gradlew
eclipse`. Once you've done this you can open the directory as a project in the
IDE you chose.

You may need to run the tests once right away to make Gradle grab all the
dependencies you'll need, such as version 4 of the JUnit library, which
provides a test runner / driver and convenient assertion methods.

## Evaluation

I will execute the script called `runtests.sh` to run your unit tests. I have
populated this file with a command that should be sufficient. However, if you
find that you'd like me to run your tests using a different command, simply
modify the script accordingly. The script will print a link to an HTML file
that is generated each time the tests are run and contains any error messages
or failed test output.

Run the script like this: `./runtests.sh`.

I will make several modifications to the code to introduce bugs in different
functions. Your tests should "catch" these bugs. In other words, if I add a bug
in a given function, one or more of your tests for that function should fail
when I run the tests afterward.
3 stringyTests
