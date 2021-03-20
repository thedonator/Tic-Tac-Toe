import java.util.Scanner;

public class GetMoves {

  /**
   *
   * @return we return the value in input minus one
   * because the board is defined from 0 to 3, but the
   * user input is defined from 1 to 3
   */
  public static int getX(Scanner in)
  {
    return (in.nextInt() - 1);
  }

  /**
   *
   * @return we return the value in input minus one
   * because the board is defined from 0 to 3, but the
   * user input is defined from 1 to 3
   */
  public static int getY(Scanner in)
  {
    return (in.nextInt() - 1);
  }

}
