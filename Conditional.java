import java.util.*;
public class Conditional {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        boolean sheAgreed = false;
        if(sheAgreed){
            System.out.println("maje hi maje");
        }
        System.out.println("last me toh ghar hi aana hai");
        
       int marks = 75;
       if (marks>=80) {
        System.out.println("A");
       } else if(marks>=70 && marks<80){
        System.out.println("B");
       }
    
        // learning of switch statement 
       int num = 5;
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("not recognise");
                break;
                
        }
        //While loop 
        int counter =  0;
        while (counter<25) {
            System.out.println("Hello Guy's");
            counter++;
        }
        int a = 0;
        while (a<=10) {
           System.out.print(a); 
           a++;
        }
    }    
}    