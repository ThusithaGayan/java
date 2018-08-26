class d{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			System.out.println(i);
			if(i==3){
				return;
			}
		}
		//terminates the method (function). Jumps to the place immediately after the function call
		System.out.println("exist");
	}
}