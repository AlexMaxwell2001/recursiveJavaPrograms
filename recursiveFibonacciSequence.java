public class recursiveFibonacciSequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		int number =Integer.parseInt(input);
		int result = fibonacci(number)
		System.out.print("The " + number + "th fibonacci sequence is " + result);
	}
	public static int fibonacci(int num1)
	{
		if(num1 == 0)
		{
			return 0;
		}
		if(num1 == 1)
		{
			return 1
		}
		else
		{
			return fibonacci(num1-1)+ fibonacci(num1-2);
		}
	}
}