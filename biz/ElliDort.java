class ElliDort {
	public static void main(String args[]) throws Exception
	{ 
		int a[]  = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, temp;
		size = 10;
		
		temp = a[0];

		for (i = 1; i < size ; i = i + 1) 
			a[i - 1] = a[i];
			a[size - 1] = temp;
		
		for (i = 0; i < size; i = i + 1)
			System.out.println(a[i]);

		}
}