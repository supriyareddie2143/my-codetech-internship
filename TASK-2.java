import java.util.Scanner;
public class Calculator
{
    
public static void main(String args[]){
    Double num1,num2,result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num1");
    num1=sc.nextDouble();
    System.out.println("Enter num2");
    num2=sc.nextDouble();
    System.out.println("Enter Operator");
    char operator=sc.next().charAt(0);
    switch(operator)
    {
        case'+':
        result=num1+num2;
        break;
        case'-':
        result=num1-num2;
        break;
        case'*':
        result=num1*num2;
        break;
        case'/':
        result=num1/num2;
        break;
        default:
        System.out.println("Entered Operator is wrong");
        return;
    }
    System.out.println(num1+"     "+operator+"    "+num2+ " :Result is:  " +result);
    }
}