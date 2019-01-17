import java.util.Scanner;

public class NumberFibonachi {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        Scanner scn = new Scanner(System.in);
        int max_num  = scn.nextInt();
         for (int i = 0; i <max_num; i++) {
             c = a + b;
             a = b;
             b = c;
             System.out.print(c + " ");


        }
    }
}
