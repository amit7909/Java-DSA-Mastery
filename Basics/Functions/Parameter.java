// Here we are taking Input from users and print the sum of given Number
import java.util.*;
public class Parameter {
    //Method - 01
        public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        calculatesum();//This is a kind of function & Method which is aleady Pre-Defined.
    }
}
