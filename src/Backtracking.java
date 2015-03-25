
public class Backtracking 
{

	

	
	private boolean isComplete(int[][] grid)
	{
		/*
		 * Checks if we are done.
		 */
		return true;
	}
	
	public boolean isValidHelper(int[][] grid, int row, int col)
	{
		int[] freq = new int[10];
		for(int i = row; i < row + 3; i++)
		{
			for(int j = col; j < col + 3; j++)
			{
				freq[grid[i][j]]++;
			}
		}
		
		int res = freqChecker(freq);
		if(res == 1 || res == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private int freqChecker(int[] freq)
	{
		boolean all = true;
		boolean invalid = false;
		for(int i = 1; i <= 9; i++)
		{
			if(freq[i] > 1)
			{
				invalid = true;
			}
			if(freq[i] != 1)
			{
				all = false;
			}
		}
		if(!invalid && all) return 2;
		else if(!invalid) return 1;
		else return -1;
	}
	
	public boolean isValid(int[][] grid)
	{
		/*
		 * Checks if given grid is consistent with the
		 * sudoku rules.
		 */
		
		int[] rows = new int[]{0, 3, 6};
		int[] cols = new int[]{0, 3, 6};
		
		
		for(int row : rows)
		{
			for(int col : cols)
			{
				if(!isValidHelper(grid, row, col)) 
					return false;
			}
		}
		
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
