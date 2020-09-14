import java.util.*;
public class recursivePalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		String lowercaseInput = input.toLowerCase();
		boolean result = palindrome(lowercaseInput);
		if(result)
		{
		    System.out.println("This is a palindrome");
		}else{
		    System.out.println("This is not a palindrome");
		}
	}
	public static boolean palindrome(String s1)
	{
		if(s1.length() == 0)
		{
			return true;
		}
		else
		{
			if(s1.charAt(0) == s1.charAt(s1.length()-1))
			{
			    return palindrome(s1.substring(1,s1.length()-1));
			}
			else{
			    return false;
			}
		}
	}
}