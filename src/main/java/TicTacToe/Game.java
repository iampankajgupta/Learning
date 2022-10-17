package TicTacToe;

import java.util.*;

public class Game {
  Deque<Player>players;
  Board gameBoard;

  Game(){
    initialiseGame();
  }

  private void initialiseGame() {
    players = new LinkedList<>();
    gameBoard = new Board(3);
    PieceX crossPiece = new PieceX();
    PieceO zeroPiece = new PieceO();
    Player player1 = new Player("player1",crossPiece);
    Player player2 = new Player("player2",zeroPiece);
    players.add(player1);
    players.add(player2);

  }

  public String startGame(){
    boolean noWinner = true;
    while(noWinner){

      Player playerTurn = players.removeFirst();
      gameBoard.printBoard();

      List<Integer> freeSpaces = new ArrayList<>();
      if(freeSpaces.isEmpty()) {
        noWinner = false;
        continue;
      }

      System.out.println("Player:"+playerTurn.name + "Enter row,column : ");
      Scanner inputScanner = new Scanner(System.in);
      String s = inputScanner.nextLine();
      String[]values = s.split(",");
      int inputRow = Integer.parseInt(values[0]);
      int inputCol = Integer.parseInt(values[1]);

      boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
      if(!pieceAddedSuccessfully){
        System.out.println("Incorrect Position Chosen, try again");
        players.addFirst(playerTurn);
        continue;
      }
      players.addLast(playerTurn);

      boolean winner = isThereWinner(inputRow,inputCol,playerTurn.playingPiece);
      if(winner){
        return playerTurn.name;
      }

    }
    return "tie";
  }

  private boolean isThereWinner(int inputRow, int inputCol, PlayingPiece playingPiece) {
    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[inputRow][i]==null || gameBoard.playingPieces[inputRow][i] != playingPiece){
        return false;
      }
    }

    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[i][inputCol] == null || gameBoard.playingPieces[i][inputCol] != playingPiece){
        return false;
      }
    }


    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[i][inputCol]==null || gameBoard.playingPieces[i][i] != playingPiece){
        return false;
      }
    }


    for(int i = 0,j=gameBoard.getSize()-1;i< gameBoard.getSize();i++,j--){
      if(gameBoard.playingPieces[i][j] ==null || gameBoard.playingPieces[i][j] != playingPiece){
        return false;
      }
    }
    return true;
  }
}
