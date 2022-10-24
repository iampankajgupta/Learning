package TicTacToe;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Board {
  int size;
  PlayingPiece[][]playingPieces;

  public Board(int size) {
    this.size = size;
    this.playingPieces = new PlayingPiece[size][size];
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public PlayingPiece[][] getPlayingPieces() {
    return playingPieces;
  }

  public void setPlayingPieces(PlayingPiece[][] playingPieces) {
    this.playingPieces = playingPieces;
  }

  public void printBoard() {

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (playingPieces[i][j] != null) {
          System.out.print(playingPieces[i][j].pieceType.name() + "   ");
        } else {
          System.out.print("    ");
        }
        System.out.print(" | ");
      }
      System.out.println();

    }
  }


  public List<Pair<Integer,Integer>> getFreeCells(){
    List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (playingPieces[i][j] == null) {
          Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
          freeCells.add(rowColumn);
        }
      }
    }
    return freeCells;
  }

  public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
    if(playingPieces[inputRow][inputCol]!=null){
      return false;
    }
    playingPieces[inputRow][inputCol] = playingPiece;
    return true;
  }
}
