/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofnumbersloop;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class SumOfNumbersLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        System.out.println("Please, enter the value of the first number: ");

        number = input.nextInt();

        while (number != 0) {

            sum += number;

            System.out.println("Please, enter the value of the next number: ");

            number = input.nextInt();

        }

        System.out.println("The sum of numbers: " + sum);
    }

}
