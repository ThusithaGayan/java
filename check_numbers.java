import java.util.Scanner;
class check_numbers{
	public static void main(String args[]){
		int first_number,second_number;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter first_number:");
		first_number=obj.nextInt();

		System.out.print("Enter second_number:");
		second_number=obj.nextInt();

		if(first_number==second_number){
			System.out.println("Numbers are equal");
		}
		else{
			System.out.println("Numbers are not equal");
		}


	}
}