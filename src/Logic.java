import java.util.Scanner;

public class Logic {

  public boolean isValidXMove(Scanner in)
  {
    return GetMoves.getX(in) > 0 && GetMoves.getX(in) < 4;
  }

  public boolean isValidYMove(Scanner in)
  {
    return GetMoves.getY(in) > 0 && GetMoves.getY(in) < 4;
  }

  public boolean hasTheRightsToBeMoved(Scanner in)
  {
    return Board.isEmpty[GetMoves.getX(in)][GetMoves.getY(in)];
  }
}
