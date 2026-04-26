import java.util.Scanner;
public class InsertationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int i, j, temp;
        for(i = 0 ; i < n ; i++){
            System.out.print("Enter value for [" + i + "] : ");
            a[i] = sc.nextInt();
        }
    }
}
