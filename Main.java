import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will compute largest, smallest and average");
        double largest =0;
        double minimum = 3;
        double average = 0;
        System.out.println("please enter a number");
        double input = keyboard.nextDouble();
        int counter = 0;
        double sum = 0;
        while (input >= 0)
        {
            if(input > largest)
                largest = input;
            else if(input < minimum)
                minimum = input;
            sum = sum + input;
            counter++;
            System.out.println("please enter a number again or negative to end ");
            input = keyboard.nextDouble();


        }

        System.out.println("the max is: " + largest);
        System.out.println("the smallest is: " + minimum);
        System.out.println("the average is: " + sum/counter);
    }
}
