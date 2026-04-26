import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size : ");
        n = sc.nextInt();
        int i, j, temp;
        int [] a = new int[n];
        for(i = 0 ; i < n ; i++){
            System.out.print("Enter value for [" + i + "] : ");
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n ; i++){
            System.out.println(a[i] + " ");
        }
        
        for(i = 0 ; i < n ; i++){
            int min = i;
            for(j = i+1 ; j < n; j++){
                if(a[min] > a[j]){
                    temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}
