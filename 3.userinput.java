import java.util.Scanner;
// import packages
class userinput{
	public static void main(String args[]){

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name=obj.nextLine();

		System.out.print("Enter Age: ");
		int age=obj.nextInt();

		System.out.println("Your Name:"+name);
		System.out.println("Your Age:"+age);
	}
	
}
