package TicTacToe;

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
  }

  public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
    if(playingPieces[inputRow][inputCol]!=null){
      return false;
    }
    playingPieces[inputRow][inputCol] = playingPiece;
    return true;
  }
}
