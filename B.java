import java.util.Scanner;
class B{
	public static void main(String args[]){
		int marks;
		String pf;

		Scanner obj=new Scanner(System.in);
		System.out.print("Enter marks:");
		marks=obj.nextInt();

		pf=(marks>50)?"Pass":"Fail";

		System.out.println("You are "+pf);
	}
}