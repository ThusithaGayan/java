import java.util.Scanner;
class calculater{
	public static void main(String args[]){
		int first_number,second_number;
		String operater;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter operater:");
		operater=obj.nextLine();

		System.out.print("Enter first_number: ");
		first_number=obj.nextInt();

		System.out.print("Enter second_number: ");
		second_number=obj.nextInt();

		

		if(operater.equals("+")){
			System.out.println("Answer:"+(first_number+second_number));
		}
		else if(operater.equals("-")){
			System.out.println("Answer:"+(first_number-second_number));
		}
		else if(operater.equals("*")){
			System.out.println("Answer:"+(first_number*second_number));
		}
		else if(operater.equals("/")){
			System.out.println("Answer:"+(first_number/second_number));
		}
		else{
			System.out.println("Invalid operater");
		}
		




	}
}