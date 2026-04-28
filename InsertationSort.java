import java.util.Scanner;

public class InsertationSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int [] a = new int[n];

        int i, j, temp;
        for(i = 0 ; i < n ; i++){
            System.out.print("Enter Value in a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array :");
            //Printing The Array
            for(i = 0 ; i < n ; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        //Insertation Sort
        for(i = 1 ; i < n ; i++){
            temp = a[i];
            j = i-1;

            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        //Printing Result 
        System.out.println("Sorted Array : ");
        for(i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }  
    }
}
