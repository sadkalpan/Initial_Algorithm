class DoksanSekiz {
	public static void main(String args[])throws Exception
	{
		int m[][] = new int[5][5];
		
		int i, k, row, col, count;
		row = 5;
		col = 5;
		
		for (i = 0; i < row;i = i + 1)
			for (k = 0; k <= i; k = k + 1)
			m[i][k] = i + 1;
		
		for (i = 0; i < row;i = i + 1){
			System.out.println(" ");
			for (k = 0; k < col; k = k + 1)
			System.out.print(m[i][k] + " ");
		}
	}
}