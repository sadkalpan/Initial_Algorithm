class OtuzAlti {
	public static void main(String args[]) throws Exception
	{
		int i, sum, size, avg;
		sum = 0;
		size = 10;
		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};
		
		for (i = 0; i < size; i = i + 1)
		sum = sum + a[i];

		avg = sum / size;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}