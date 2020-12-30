import java.util.*;
public class recursiveLongDivision{
	
	public static int decimal(int numerator, int divisor, int n){

	        if (numerator%divisor==0) return 0;

	        if (n==0)return numerator/divisor;

	        return decimal((numerator%divisor)*10, divisor,n-1);
	} 
}