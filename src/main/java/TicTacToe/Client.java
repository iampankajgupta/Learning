package TicTacToe;

public class Client {
  public static void main(String[] args) {
    Game game = new Game();
    String winner = game.startGame();
    System.out.println("The WInner is : "+winner);

  }
}
