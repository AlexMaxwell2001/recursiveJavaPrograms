import java.util.*;
public class recursiveAmountOfSpecifiedCharacter{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input1= sc.nextLine();
		String lowercaseInput= input1.toLowerCase();
		char input2= sc.next().charAt(0);
		int num1=0;
		int result= find(lowercaseInput, input2, num1);
		System.out.println("There is " + result  + " " + input2 + "'s in the string.");
	}
	public static int find(String s1, char specified , int counter)
	{
	    if(s1.length() ==0)
	    {
	        return counter;
	    }else{
	        if(s1.charAt(0) == specified)
	        {
	            return find(s1.substring(1) , specified , counter+1);
	        }else{
	            return find(s1.substring(1) , specified , counter);
	        }
	    }
	}
}