import java.util.*;
public class recursiveTriangleNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		int result = triangle(number);
		System.out.print("The " + number + "th triangle number is " + result);
	}
	public static int triangle(int num1)
	{
		if(num1==0)
		{	
			return 0;
		}else{
			return triangle(num1-1) + num1;
		}
	}
}