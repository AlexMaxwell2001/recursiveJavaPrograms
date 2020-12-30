import java.util.*
public class recursiveEquation{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter coefficient for X");
        int coefficientX = sc.nextInt();
        System.out.println("Please enter coefficient for Y");
        int coefficientY = sc.nextInt();
        System.out.println("Please enter coefficient for Z");
        int coefficientZ = sc.nextInt();
        System.out.println("Please enter value for X");
        int valueX = sc.nextInt();
        System.out.println("Please enter value for Y");
        int valueY = sc.nextInt();
        System.out.println("Please enter value for Z");
        int valueZ = sc.nextInt();
        int result= equation(coefficientX, valueX, coefficientY, valueY, coefficientZ, valueZ);
    }
    public static int equation(int coefficientX, int valueX , int coefficientY, int valueY, int coefficientZ, int valueZ)
    {
        if(valueX <=1 || valueY<=1 || valueZ<=1)
        {
            return 1;
        }else{
            return equation((coefficientX*valueX) 
        }
    }
}