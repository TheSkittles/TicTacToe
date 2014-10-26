# Design report

We were quite unsure of how to start this project which resulted in some code being produced without really having a solid plan.

Here is a class diagram of the code that resulted from this phase.

[ClassDiagram1]: http://yuml.me/diagram/scruffy;dir:LR/class/[TicTacToe|-repo;-game|main]-1..*>[Game|-board|getBoard();getPlayer();getWinner();mark()], [Game]++-1>[Board||mark();getCellValue();findWinner()], [TicTacToe]->[Repository|-db|saveScore()] "Class diagram 1"
