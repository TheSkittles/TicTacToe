#Administration manual

This is a administration manual for running and maintaining Tic Tac Toe

Anyone can run the program on the following link:
```sh
http://skittles.herokuapp.com/
```

If an administrator needs to run the program locally he can run the following commands
```sh
wget https://raw.githubusercontent.com/TheSkittles/TicTacToe/master/bin/InstallProgramsAdmin
chmod +x InstallProgramsAdmin
./InstallProgramsAdmin
```

This installs git and gradle and clones the repository to the administrators local computer.

Then he can run the program by entering the following:
```sh
cd TicTacToe
./gradlew run
```

Now the game is up and running and can be played in any browser, on a typical setup at the following url.
```sh
localhost:4567
```

The port that the server listens on can be configured with $PORT environment variable. To make it listen on default HTTP port, issue this command before running the program.
```sh
export PORT=80
```
