import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int num=1;

        for (int i = 1; i <= k ; i++  ) {
            num = num*i;
            System.out.println(num);
        }

    }
}
