public class GameLogic {


  /**
   * 
   * @return returns true if the move in input is valid
   */
  public static boolean isValidXMove()
  {
    return Board.xMove >= 0 && Board.xMove < 4;
  }


  /**
   * 
   * @return returns true if the move in input is valid
   */
  public static boolean isValidYMove()
  {
    return Board.yMove >= 0 && Board.yMove < 4;
  }

  /**
   * The function checks if the current move goes in a cell that is 
   * already full
   * 
   
   * @return returns true if the move in input is valid
   */
  public static boolean isAFreeCell()
  {
    return Board.isEmpty[Board.yMove][Board.xMove];
  }

}
