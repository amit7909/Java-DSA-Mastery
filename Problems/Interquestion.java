package Problems;

import java.util.Scanner;

public class Interquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //01. To check the number is Even or odd 
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is odd");
        }


        // 02. To Swap two numbers witout using third variable 
        System.out.println("Enter a first a:");
        int a = sc.nextInt();

        System.out.println("Enter a secound b");
        int b = sc.nextInt();

        System.out.println("Before swapping a:" +a+ "b is :"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping a:" +a+ "b is :"+b);




    }
}
