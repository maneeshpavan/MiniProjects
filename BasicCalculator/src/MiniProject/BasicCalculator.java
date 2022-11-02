package MiniProject;

import java.util.Scanner;

class BasicCalculator {
  public static void main(String[] args) {

    char op;
    Double num1, num2, ans;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /:");
    op = sc.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number:");
    num1 = sc.nextDouble();

    System.out.println("Enter second number:");
    num2 = sc.nextDouble();

    switch (op) {

      // performs addition between numbers
      case '+':
        ans = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + ans);
        break;

      // performs subtraction between numbers
      case '-':
    	ans = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + ans);
        break;

      // performs multiplication between numbers
      case '*':
    	ans = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + ans);
        break;

      // performs division between numbers
      case '/':
    	ans = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + ans);
        break;
          
      default:
        System.out.println("Invalid operator!");
        break;
    }

    sc.close();
  }
}