import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Board.initializeGameBoard();
    Board.initializePlayers(in);
    Turn.currentTurn = Turn.startingTurn();
    Board.printBoard();

    while (true)
    {
      GetMoves.getX(in);
      GetMoves.getY(in);
      while (!GameLogic.isValidXMove(in) || 
      !GameLogic.isValidYMove(in) || 
      !GameLogic.isAFreeCell(in)) {

        System.out.println("Not a valid move please reinsert:");
        GetMoves.getX(in);
        GetMoves.getY(in);
      }
      Board.updateBoard(in);
      Board.printBoard();
      Turn.changeTurn(Turn.currentTurn);
    }
  }
}

