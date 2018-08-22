class cool{
	public static void main(String args[]){
		int x,y,a,b;
		a=10;
		b=10;

		x=a++;
		y=++b;

		//new value of a
		System.out.println("a="+a);

		//new value of x
		//x became 10 because value of 'a' assign to x before increment a
		System.out.println("x="+x);

		//new value of b
		System.out.println("b="+b);

		//new value of y
		System.out.println("y="+y);

	}
}