
public class Backtracking 
{

	
	public int evaluate(int[][] grid)
	{
		/*
		 * Returns 1 if we are done,
		 * 0 if it is a valid Sudoku board
		 * -1 if we violated some condition.
		 */
		
		int rowCheck = rowChecker(grid);
		int colChecker = colChecker(grid);
		int boxChecker = boxChecker(grid);
		if(rowCheck == 1 && colChecker == 1 && boxChecker ==1)
			return 1;
		else if(rowCheck == -1 || colChecker == -1 || boxChecker == -1)
			return -1;
		else 
			return 0;
	}
	
	private int rowChecker(int[][] grid)
	{
		int[] res = new int[9];
		for(int i = 0; i < 9; i++) res[i] = rowCheckHelper(grid, i);
	
		boolean all = true;
		boolean fault = false;
		
		for(int f : res)
		{
			if(f == -1) fault = true;
			if(f == 0) all = false;
			
		}
		
		if(!fault && all) return 1;
		else if(!fault) return 0;
		else return -1;
	}
	
	private int rowCheckHelper(int[][] grid, int row)
	{
		int[] freq = new int[10];
		for(int i = 0; i < 9; i++)
		{
			freq[grid[row][i]]++;
		}
		return freqChecker(freq);
	}
	
	private int colCheckHelper(int[][] grid, int col)
	{
		int[] freq = new int[10];
		for(int i = 0; i < 9; i++)
		{
			freq[grid[i][col]]++;
		}
		return freqChecker(freq);
	}
	
	private int colChecker(int[][] grid)
	{
		
		int[] res = new int[9];
		for(int i = 0; i < 9; i++) res[i] = colCheckHelper(grid, i);
		boolean all = true;
		boolean fault = false;
		
		for(int f : res)
		{
			if(f == -1)
			{
				fault = true;
			}
			if(f == 0) all = false;
		}

		if(!fault && all) return 1;
		else if(!fault) return 0;
		else return -1;
	}
	
	private int boxChecker(int[][] grid)
	{
		int[] rows = new int[]{0, 3, 6};
		int[] cols = new int[]{0, 3, 6};
		
		int[] res = new int[9];
		int ptr = 0;
		for(int row : rows)
		{
			for(int col : cols)
			{
				res[ptr++] = boxCheckHelper(grid, row, col);
			}
		}
		
		boolean all = true;
		boolean fault = false;
		
		for(int f : res)
		{
			if(f == -1) fault = true;
			if(f == 0) all = false;
			
		}

		if(!fault && all) return 1;
		else if(!fault) return 0;
		else return -1;
	}
	
	public int boxCheckHelper(int[][] grid, int row, int col)
	{
		int[] freq = new int[10];
		for(int i = row; i < row + 3; i++)
		{
			for(int j = col; j < col + 3; j++)
			{
				freq[grid[i][j]]++;
			}
		}
		
		return freqChecker(freq);
		
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
		if(!invalid && all) return 1;
		else if(!invalid) return 0;
		else return -1;
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
