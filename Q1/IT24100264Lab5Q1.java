import java.util.Scanner;
public class IT24100264Lab5Q1{
    public static void main(String[] args){
        Scanner myKey=new Scanner(System.in);
        System.out.print("Enter the first Integer: ");
        int num1=myKey.nextInt();
        System.out.print("Enter the second Integer: ");
        int num2=myKey.nextInt();
        System.out.print("Enter the third Integer: ");
        int num3=myKey.nextInt();
        int smallestNumber=Math.min(num1,Math.min(num2,num3));
        int largestNumber=Math.max(num1,Math.max(num2,num3));
        System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
        System.out.println("The smallest number is :"+smallestNumber);
        System.out.print("The largest number is :"+largestNumber);
        
        
    }
}