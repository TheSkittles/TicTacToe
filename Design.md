# Design report

We were quite unsure of how to start this project which resulted in some code being produced without really having a solid plan.

Here is a class diagram of the code that resulted from this phase.

<img src="http://yuml.me/diagram/scruffy;dir:LR/class/[TicTacToe%7C-repo;-game%7Cmain]-1..*%3E[Game%7C-board%7CgetBoard();getPlayer();getWinner();mark()],%20[Game]++-1%3E[Board%7C%7Cmark();getCellValue();findWinner()]" />

An improved version with added support for database repository
<img src="http://yuml.me/diagram/scruffy;dir:LR/class/[TicTacToe%7C-repo;-game%7Cmain]-1..*%3E[Game%7C-board%7CgetBoard();getPlayer();getWinner();mark()],%20[Game]++-1%3E[Board%7C%7Cmark();getCellValue();findWinner()],%20[TicTacToe]-%3E[Repository%7C-db%7CsaveScore()]" />
