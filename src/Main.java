/*
   THIS IS MY FIRST MINI PRACTICE MINI PROJECT
   THIS PROGRAM CALCULATES COMPOUND INTEREST
   I MADE IT TO PRACTICE USER INPUTS AND MATH
   VERSION 2: FORMATTED OUTPUT WITH INTEREST EARNED
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("WELCOME TO THE COMPOUND INTEREST CALCULATOR");
        System.out.println("-------------------------------------------");

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Compound interest
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        double interestEarned = amount - principal;

        System.out.println();
        System.out.printf("Final amount after %d years: $%.2f%n", years, amount);
        System.out.printf("Total interest earned: $%.2f%n", interestEarned);
        System.out.println("-------------------------------------------");
        System.out.println("Thank you for using our calculator!");
        System.out.println("-------------------------------------------");

        // Signature
        System.out.println("\u001B[33mMade by CodingNORVIN\u001B[0m");

        // ASCII art in yellow
        System.out.println("\u001B[33m"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@%..*@@@@@@+.#@@@@#=:....:=%@@@@#..:::::-*@@+.=@@@@@@@@=.#@@-.%@@@:.+@@@@@@#.=@@@@@@@@@@@@\n"
                + "@@@@@@@@@@%   =@@@@@+ *@@@- :*%%%%+. =@@@* -@@%%#- -@@. *@@@@@@* :@@@. #@@@   -@@@@@# -@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -= -@@@@+ *@@: +@@@+#@@@- -@@* -@@@@@@  %@# .@@@@@@. %@@@. #@@@ :+ :%@@@# =@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -@+ .%@@+ *@* :@@%* :#@@@. %@* -@@@@%- -@@@= -@@@@- *@@@@. #@@@ :@* .#@@# =@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -@@#  *@+ *@+ -@*=   .=#@: #@*  ::...-*@@@@@: *@@* -@@@@@. #@@@ :@@#. *@# =@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -@@@%. *+ *@# .@@@%.=@@@%  %@* -%%* .%@@@@@@% .@@..%@@@@@. #@@@ :@@@%: =# =@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -@@@@@- . *@@= :%@@#@@@#. *@@* -@@@#  #@@@@@@+ -- *@@@@@@. #@@@ :@@@@@= . =@@@@@@@@@@@@\n"
                + "@@@@@@@@@@% -@@@@@@=  *@@@*. -+**+: :#@@@* -@@@@#. *@@@@@@:  -@@@@@@@. #@@@ .@@@@@@+  -@@@@@@@@@@@@\n"
                + "@@@@@@@@@@%=*@@@@@@@*=#@@@@@#=----+#@@@@@%=*@@@@@%==@@@@@@%==@@@@@@@@+=%@@@=+@@@@@@@#=*@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "\u001B[0m");

        scanner.close();
    }
}
