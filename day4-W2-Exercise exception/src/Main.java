import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("..Question 1..");

        Scanner input = new Scanner(System.in);

            System.out.println("Enter two numbers to apply mathematical operations on it: ");
            System.out.println("First number: ");
        try {
            int num_1 = input.nextInt();
            System.out.println("Second number: ");
            int num_2 = input.nextInt();

            int addition = num_1 + num_2;
            int subtract = num_1 - num_2;
            int multiply = num_1 * num_2;


            int divide = num_1 / num_2;
            int reminder = num_1 % num_2;

            System.out.println(num_1 + " + " + num_2 + " = " + addition);
            System.out.println(num_1 + " - " + num_2 + " = " + subtract);
            System.out.println(num_1 + " * " + num_2 + " = " + multiply);
            System.out.println(num_1 + " / " + num_2 + " = " + divide);
            System.out.println(num_1 + " mod " + num_2 + " = " + reminder);
        }catch (InputMismatchException exception_1) {
            System.out.println("|ENTER NUMBER ONLY|");
        }catch (ArithmeticException e) {
            System.out.println("no number can be divide by zero");
        }


//
//            //Question 2 -----------------------------
//            System.out.println("\n..Question 2..");
//            try {
//            System.out.println("Enter the number to print it's multiplication table up to 10: ");
//            int num = input.nextInt();
//            int result = 1;
//            for (int i = 1; i <= 10; i++) {
//                result = num * i;
//                System.out.println(num + "*" + i + "=" + result);
//            }
//        } catch (InputMismatchException Question_2) {
//            System.out.println("question 2 : please enter numbers only");
//        }




//            //Question 4-------------------------------------------------------
//            System.out.println("\n..Question 4..");
//               try {
//            System.out.println("Enter the count of numbers to see it's average: ");
//            int num_count = input.nextInt();
//            int numbers;
//            double sum = 0;
//            for (int i = 0; i < num_count; i++) {
//
//                System.out.println("Enter an integer: ");
//                numbers = input.nextInt();
//
//                sum = numbers + sum;
//
//            }
//            double avr = sum / num_count;
//
//            System.out.println("The average is: " + avr);
//        }catch (InputMismatchException exception_4) {
//                System.out.println("|ENTER NUMBER ONLY|");}


//
//
//            //Question 5----------------------------------------
//            System.out.println("\n..Question 5..");
//
//           try {
//            System.out.println("Enter three integers so the program will check if the sum of first two integers" +
//                    " equals to the third integer or not");
//
//            System.out.print("Please enter the first number: ");
//            int number_1 = input.nextInt();
//            System.out.print("Please enter the second number: ");
//            int number_2 = input.nextInt();
//            System.out.print("Please enter the third number: ");
//            int number_3 = input.nextInt();
//
//            int sum_$ = number_1 + number_2;
//            if (sum_$ == number_3) {
//                System.out.println("The result is: True");
//            } else {
//                System.out.println("The result is: False");
//            }
//
//        } catch (InputMismatchException exception_5) {
//            System.out.println("|ENTER NUMBER ONLY|");
//        }



//                //Question 6 -----------------------------------------
//                System.out.println("\n..Question 6..");
//                System.out.println("Input a word: ");
//                String word = input.next();
//                StringBuilder str = new StringBuilder(word);
//                StringBuilder str_rev = str.reverse();
//                System.out.println("Reverse word: " + str_rev);



            //Question 7 --------------------------------
            System.out.println("\n..Question 7..");
        try {
            System.out.println("Please enter number and if the number even it will count as a value" +
                    "but if it zero or odd the program will throw an exception: ");
            int num = input.nextInt();

            even_odd(num);
        }catch (InputMismatchException e_1){
            System.out.println("Enter numbers only");
        }catch (Exception e) {
            System.out.println(e.toString());
        }
//
//
//
//                //Question 8 -----------------------------------------
//                System.out.println("\n..Question 8..");
//                try {
//                System.out.println("Enter temperature in Centigrade so the program convert it to Fahrenheit : ");
//                double temp_c = input.nextDouble();
//
//                double temp_f = (temp_c * 1.8) + 32;
//
//                System.out.println("Temperature in Fahrenheit is: " + temp_f);
//            }catch (InputMismatchException exception_7) {
//                System.out.println("|ENTER NUMBER ONLY|");}



//                //Question 9 -----------------------------------------
//                System.out.println("\n..Question 9..");
//
//                System.out.println("Enter string: ");
//                input.nextLine();
//                String str_$ = input.nextLine();
//                System.out.println("Enter number of the string index: ");
//                try {
//                    int num_index = input.nextInt();
//                    str_$.charAt(num_index);
//                    System.out.println(str_$.charAt(num_index));
//                }catch (InputMismatchException exception_8) {
//                    System.out.println("|ENTER NUMBER ONLY|");}




//                        //Question 10 -----------------------------------
//                        System.out.println("\n..Question 10..");
//                        try {
//                        System.out.println("Area and perimeter of a rectangle");
//                        System.out.println("Enter the width");
//                        double width = input.nextDouble();
//                        System.out.println("Enter the height");
//                        double height = input.nextDouble();
//
//                        double area_1 = width * height;
//                        double perimeter_1 = 2 * (width + height);
//
//                        System.out.println("Area = " + width + " * " + height + " = " + area_1);
//                        System.out.println("Perimeter is = " + " 2 * " + "(" + width + "+" + height + ")" + "=" + perimeter_1);
//                    }catch (InputMismatchException exception_9) {
//                        System.out.println("|ENTER NUMBER ONLY|");
//                    }



//                    //Question 11 ------------------------------
//                    System.out.println("\n..Question 11..");
//                    try {
//                    System.out.println("Compare two numbers:");
//
//                    System.out.println("Enter first number");
//                    int num_3 = input.nextInt();
//
//                    System.out.println("Enter second number");
//                    int num_4 = input.nextInt();
//
//
//                    if (num_3 == num_4) {
//                        System.out.println(num_3 + " = " + num_4);
//                    } else {
//                        System.out.println(num_3 + " != " + num_4);
//                    }
//
//                    if (num_3 < num_4) {
//                        System.out.println(num_3 + " < " + num_4);
//                    } else {
//                        System.out.println(num_3 + " > " + num_4);
//                    }
//                    if (num_3 <= num_4) {
//                        System.out.println(num_3 + " <= " + num_4);
//                    } else {
//                        System.out.println(num_3 + " >= " + num_4);
//                    }
//
//                }catch (InputMismatchException exception_10) {
//                    System.out.println("|ENTER NUMBER ONLY|");}

            }

    //Question 7 --------------------------------

    public static void even_odd(int num1) throws Exception{

        if (num1 ==0){
            throw new Exception("invalid zero number");
        } else if (num1 %2 !=0) {
            throw new Exception("odd");
        } else System.out.println("even");
    }

   
}