public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    /* to be implemented in part (a) */
    lights = new boolean[numRows][numCols];
    for (int r = 0; r < numRows; r++){
      for (int c = 0; c < numCols; c++){
        if (Math.random()<=0.4){
        lights[r][c] = true;
          lights[r][c] = false;
    }
  }
  }
  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
      int count = 0;
      for (int i =0; i<col; i++){
        if (lights[row][i] == true)
        count++;
      }
      if (lights[row][col]==true && count%2==0){
        return false;
      }else if (lights[row][col]== false && count%3==0){
      return true;
      }
    return lights[row][col];
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
