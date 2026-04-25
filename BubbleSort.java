import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size : ");
            n = sc.nextInt();
            int [] a = new int[n];

        int i, j, temp;
        for(i=0;i<n;i++){
            System.out.print("Enter value for [" + i + "] : ");
            a[i] = sc.nextInt();
        }
        // Printing Unsorted Array
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // BubbleSort Equation
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        // After Sorting
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    } 

}