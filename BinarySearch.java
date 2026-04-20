import java.util.Scanner;
public class BinarySearch {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Enter the size : ");
        n = sc.nextInt();

        int i, j, temp = 0;
        int [] a = new int[n];
        for(i = 0 ; i < n ; i++){
            System.out.print("Enter Value for a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        for(j = 0 ; j < n ; j++){
            System.out.print(a[j]+" ");
           
        }
        System.out.println();
        //Sorting
        for(i = 0 ; i < n ; i++){
            for(j = i+1 ; j < n ; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ater Sorting the Array : ");
        for(j = 0 ; j < n ; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        //BinarySearch
        System.out.print("Enter the value to search : ");
        int find = sc.nextInt();
        int b = 0, e = n-1, mid;
        int flag = 0;
        while(b <= e){
            mid = (b + e)/2;
            if(a[mid] == find){
                flag = 1;
                break;
            }
            else if(a[mid] > find){
                e = (mid - 1);
            }
            else{
                b = (mid + 1);
            }
        }
        if(flag == 0){
            System.out.print(find + " is Not found!");
        }
        else{
            System.out.print(find + " is found!");
        }
    }
}
