import java.util.*;
public class recursiveUniqueCharacters{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tracker=0;
		String input= sc.nextLine();
		String lowercaseInput = input.toLowerCase();
		int result = uniquechars(lowercaseInput, tracker);
		System.out.println("There is " + result +" unique characters in this string");
	}
	public static int uniquechars(String s1, int tracker)
	{
		if(s1.length() == 0)
		{
			return tracker;
		}
		else
		{
			if(!comparison(s1.charAt(0),s1.substring(1)))
			{
			    return uniquechars(s1.substring(1), tracker+1);
			}else{
			    return uniquechars(s1.substring(1), tracker);
			}
			
		}
	}
	public static boolean comparison(char firstChar, String restOfString)
	{
	    if(restOfString.length() == 0)
	    {
	        return false;
	    }
	    else{
	        if(firstChar == restOfString.charAt(0)){
	            return true;
	        }else{
	            return comparison(firstChar,restOfString.substring(1));
	        }
	    }
	}
}