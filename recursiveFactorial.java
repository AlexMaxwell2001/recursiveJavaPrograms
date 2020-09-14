public class recursiveFactorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		int result = factorial(number);
		System.out.print("The factorial of " + number + " is " + result);
	}
	public static int factorial(int num1)
	{
		if(num1<=1)
		{	
			return 1;
		}else{
			return num1 * factorial(num1-1);
		}
	}
}