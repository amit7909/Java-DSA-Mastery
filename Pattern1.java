public class Pattern1 {
    public static void main(String args[]){
        // here we have to understand and make pattern using nested loop's
        //print star using nested loop
        for(int i=1; i<=10; i++){
            //one line 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // print Inverted stars 
        int n=4;
        for(int k=1; k<=n; k++){
            for(int l=1;l<=n-k+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*Half pyramid like 
        1
        12
        123
        123*/
        int w=4;
        for (int Line=1;Line<=w;Line++){
            for(int number=1;number<=Line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
        /*print character pattern
        like 
        A
        BC
        DEF
        GHIJ*/
        int x =4;
        char ch ='A';
        for (int row=1;row<=x;row++){
            for(int chars=1;chars<=row;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        // 4*4 Matrix
        for(int m=0;m<4;m++){
            for(int s=0;s<4;s++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Print Plus Type Pattern
        for(int O=0;O<5;O++){
            for(int P=0;P<5;P++){
                if (O==2 || P==2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int count = 1;
        for(int Q=0;Q<4;Q++){
            for(int R=0;R<=Q;R++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
