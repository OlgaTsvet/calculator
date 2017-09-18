import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1, number2;
        char operator;
        int failed=0;

        System.out.println("Enter First Number: ");
        number1=input.nextInt();

        System.out.println("Enter Second Number: ");
        number2=input.nextInt();

        System.out.println("Enter the operator: +,-,*,/");
        operator=input.next().charAt(0);

        do
        {
            failed=0;
            switch(operator)
            {

                case '+':
                {
                    add(number1, number2);
                    break;
                }
                case '-':
                {
                    subtract(number1, number2);
                    break;
                }
                case '*':
                {
                    multiply(number1, number2);
                    break;
                }
                case '/':
                {
                    divide(number1, number2);
                    break;
                }
                default:
                {
                    System.out.println("wrong character entered");
                    failed=1;
                }
                if(failed==1)
                {
                    System.out.println("Please enter the operator: +,-,*,/: ");
                    operator=input.next().charAt(0);

                }
            }
        }while(failed==1);
    }

    public static void add(int num1, int num2)
    {
        System.out.println("Sum is: "+(num1+num2));
    }
    public static void subtract(int num1, int num2)
    {
        System.out.println("Difference is: "+(num1-num2));
    }
    public static void multiply(int num1, int num2)
    {
        System.out.println("Product is: "+(num1*num2));
    }
    public static void divide(int num1, int num2)
    {
        System.out.println("Quotient is: "+(num1/num2));
    }

}