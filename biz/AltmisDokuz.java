class AltmisDokuz {
	public static void main(String args[]) throws Exception
	{
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, min, p;
		size = 10;
		p = 0;
		min = a[0];
		
		for (i = 1;i < size; i = i + 1)
			if (a[i] < min){
			min = a[i];
			p = i;
		}
			a[p] = a[0];
			a[0] = min;
		
		for (i = 0;i < size; i = i + 1)
		System.out.println(a[i]);
		
	}
}