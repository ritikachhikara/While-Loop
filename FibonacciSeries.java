
import java.util.Scanner;

class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term upto which you want to print the fibonacci series: ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + "  " + n2 + " ");
        int i = 1;
        while (i <= n - 2) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            i++;
        }
    }

}
