import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        int i, j;
        int flag = 0;
        for(i = 0 ; i < n ; i++){
            System.out.print("Enter value for a [" + i + "] : ");
            a[i] = sc.nextInt();
        }
        for(j = 0 ; j < n ; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
        int find;
        System.out.print("Enter the value to search : ");
        find = sc.nextInt();

        for(i = 0 ; i < n ; i++){
            if(a[i] == find){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.print(find + " is Not Found!");
        }
        else{
            System.out.print(find + " is Found!");
        }
    }
}
