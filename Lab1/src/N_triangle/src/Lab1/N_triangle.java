package Lab1;
import java.util.Scanner;
public class N_triangle {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("input n: ");
        int n = inp.nextInt();
        for(int i=1; i <= n; i++){
            for(int j=1; j <= 2*n - i; j++){
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            for(int j=1; j <= i-1 ; j++){
                System.out.print("*");
            }
            for(int j=2*n-1; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}