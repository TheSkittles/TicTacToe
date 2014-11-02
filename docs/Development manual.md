
#Development manual

This is a development manual for installing Tic Tac Toe on a Linux machine

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




