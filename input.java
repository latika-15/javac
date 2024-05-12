
import java.util.Scanner;
public class input
{
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
System.out.println("Enter the msg:");
String msg=sc.nextLine();
System.out.println("the message is:"+ msg);

System.out.println("ENTER A NO.: ");
int a=sc.nextInt();
System.out.println("value of a is: "+a);

System.out.println("enter a float and double value: ");
float b=sc.nextFloat();
double c=sc.nextDouble();
System.out.println("value of float is:"+b+"and value of double is:"+c);


    }
}