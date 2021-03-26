import java.util.Scanner;

public class GameLogic {


  /**
   * 
   * @param in is the input stream
   * @return returns true if the move in input is valid
   */
  public static boolean isValidXMove(Scanner in)
  {
    return Board.xMove >= 0 && Board.xMove < 4;
  }


  /**
   * 
   * @param in is the input stream
   * @return returns true if the move in input is valid
   */
  public static boolean isValidYMove(Scanner in)
  {
    return Board.yMove >= 0 && Board.yMove < 4;
  }

  /**
   * The function checks if the current move goes in a cell that is 
   * already full
   * 
   * @param in is the input stream
   * @return returns true if the move in input is valid
   */
  public static boolean isAFreeCell(Scanner in)
  {
    return Board.isEmpty[Board.yMove][Board.xMove];
  }
}
