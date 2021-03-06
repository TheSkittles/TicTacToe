
#Development manual

This is a development manual for installing Tic Tac Toe on a Linux machine

##Getting started

To start with you have to sign up on:
```sh
Github.com
Heroku.com
Travis-ci.org
```

Run Automated Installation
````sh
wget https://raw.githubusercontent.com/TheSkittles/TicTacToe/master/bin/InstallPrograms
```
````sh
chmod +x InstallPrograms
./InstallPrograms
```
###Detailed installation

Step By Step instruction (optional):
Check if Java JDK is installed:
```sh
javac -version
```
If you get an error or have an outdated version (Java 8 is required), install Java by entering:
```sh
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
```
Install git on your machine:
```sh
sudo apt-get install git
```
Then clone the project to your machine:
```sh
git clone git@github.com:TheSkittles/TicTacToe.git
```
Install Gradle:
```sh
sudo apt-get install gradle
sudo apt-get update
```
Install Run Selenium functional test
```sh
sudo apt-get install xvfb
```

##Development

Some helper scripts are supplied for convenience

```sh

 bin/board_test      : run unit tests against board class
 bin/game_test       : run unit tests against game class
 bin/build           : build project
 bin/clean           : remove build artifacts
 bin/test            : run all unit tests [and open report in browser on supported OS]
 bin/endtoend_local  : run selenium end to end test locally
 bin/coverage        : create test coverage report [and open in browser on supported OS]

```

Continuous Integration via Travis-CI will run automatically on pushing to git repository. If committing changes not requiring a build of the project please add [skip ci] to commit message to avoid uneeded builds.

The automatic build runs coverage checks and code inspection in the process. Reports from these as well as unit test results are available on github pages for the repository. Links to these reports are found at the bottom of Readme on github.
