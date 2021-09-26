//Program to Print Multiplication Table for Any Number

package codeloops;
import java.util.Scanner;

public class CodeLoops 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Program to Print Multiplication Table for Any Number");
        System.out.println("Enter the Number : ");
        
        int input = scan.nextInt();
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(input + "X" + i + "=" + i*input);
        }
    }
    
}
