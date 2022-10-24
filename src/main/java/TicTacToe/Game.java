package TicTacToe;

import com.sun.tools.javac.util.Pair;


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
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the Number of Players : ");
    int noOfPlayers = obj.nextInt();
    HashSet<String>symbols = new HashSet<>();
    for(int player = 0;player>noOfPlayers;player++){
      System.out.println("Assign from these to Players [ X ] [ 0 ] [ $ ] ");
      System.out.println("Enter the Player Name");
      String playerName = obj.nextLine();
      System.out.println("Assign the Symbol to Him");
      String symbol = obj.nextLine();
      if(symbols.contains(symbol)){
        while(symbols.contains(symbol)){
          System.out.println("Assign Different symbol Entered Symbol is already Assign to Someone");
          symbol = obj.nextLine();
        }
      }
    }


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

      List<Pair<Integer,Integer>> freeCells = gameBoard.getFreeCells();
      if(freeCells.isEmpty()) {
        noWinner = false;
        continue;
      }

      System.out.print("Player: "+playerTurn.name + " Enter row,column : ");
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

    boolean rowCheck = true;
    boolean colCheck = true;
    boolean diagonalCheck = true;
    boolean antiDiagonalCheck = true;

    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[inputRow][i]==null || gameBoard.playingPieces[inputRow][i].pieceType != playingPiece.pieceType){
        rowCheck = false;
      }
    }

    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[i][inputCol] == null || gameBoard.playingPieces[i][inputCol].pieceType != playingPiece.pieceType){
        colCheck = false;
      }
    }


    for(int i = 0;i< gameBoard.getSize();i++){
      if(gameBoard.playingPieces[i][i]==null || gameBoard.playingPieces[i][i].pieceType != playingPiece.pieceType){
        diagonalCheck = false;
      }
    }


    // checking for antiDiagonal cells

    for(int i = 0,j=gameBoard.getSize()-1;i< gameBoard.getSize();i++,j--){
      if(gameBoard.playingPieces[i][j] ==null || gameBoard.playingPieces[i][j].pieceType != playingPiece.pieceType){
        antiDiagonalCheck = false;
      }
    }
    return rowCheck | colCheck | diagonalCheck | antiDiagonalCheck;
  }
}
