
public class Backtracking 
{

	
	
	
	private boolean isComplete(int[][] grid)
	{
		/*
		 * Checks if we are done.
		 */
		return true;
	}
	
	private boolean isValid(int[][] grid)
	{
		/*
		 * Checks if given grid is consistent with the
		 * sudoku rules.
		 */
		
		return true;
	}
	
	private Cell nextMove(int[][] grid)
	{
		/*
		 * Returns next cell that should be filled up.
		 */
		
		
		return null;
	}
	
	private class Cell
	{
		/*
		 * Abstraction of a x, y co-ordinate on the grid.
		 */
		public int x, y;
		public Cell(int x, int y) {this.x = x; this.y = y;}
	}
}
