import java.util.Scanner;
class halistone{
	public String halis(int n){
		if(n==1){
			return "1";
		}
		else if(n%2==0){
			return n+" "+halis(n/2);
		}
		else{
			return n+" "+halis(3*n+1);
		}
	}
	public static void main(String args[]){
		Scanner n=new Scanner(System.in);
		System.out.print("Enter Number ");
		int num1=n.nextInt();
		halistone obj=new halistone();

		System.out.print(obj.halis(num1));

	}
}