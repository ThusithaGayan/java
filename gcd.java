import java.util.Scanner;
class gcd{
	public int cgcd(int x, int y){
		if(y==0){
			return x;
		}
		else if(x>=y){
			return cgcd(y,x%y);
		}
		else{
			return cgcd(y,x);
		}
	}
	public static void main(String args[]){
		int number1,number2;

		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number1: ");
		number1=obj.nextInt();

		System.out.print("Enter number2: ");
		number2=obj.nextInt();

		gcd o=new gcd();

		System.out.println("GCD is "+o.cgcd(number1,number2));


	}
}