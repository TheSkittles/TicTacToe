#Design report

The basic tools we will be using are:

Sublime and Java for designing the program code.

Gradle will be used for automatic building and running unit tests.

Github will be used as Version Control, and our initial step is to create a repository on Github. After each TDD Mantra (Write test,  write code, refactor) we will commit our changes to Github, so that we will have our program deployable for production at all times. For automated continuous integration we will use Travis as our tool.

For templating the java code into our html file we will use Mustache, and by doing that the game can be played in a browser on localhost.

We plan to implement code coverage and code inspection into our code for monitoring, and use Selenium on Heroku for end-to-end tests.

Class setup
---

Our plan for this project was to make the code for the game as simple as possible. Only make a human playable game for a single game at a time. The initial class diagram for the logic of the game follows.

<img src="http://yuml.me/diagram/scruffy;dir:LR/class/[TicTacToe%7C-game%7Cmain]-1%3E[Game%7C-board%7CgetBoard();getPlayer();getWinner();mark()],%20[Game]-1%3E[Board%7C%7Cmark();getCellValue();findWinner()]" />

In addition there are three test classes, using Junit, one for each class. Tests to be written on the fly, before the code that it will test.

This version intended for console application was newer implemented, but rather we changed the main class to TicTacToeWeb which runs a spark based web interface for the application using Mustache for templating as descripbed above.

<img src="http://yuml.me/diagram/scruffy;dir:LR/class/[TicTacToeWeb%7C-game%7Cmain]-1%3E[Game%7C-board%7CgetBoard();getPlayer();getWinner();mark()],%20[Game]-1%3E[Board%7C%7Cmark();getCellValue();findWinner()]" />
