import java.util.Scanner;

class BinarySearch{
    int searchingElement(int a[], int find){
       int b = 0, e = a.length - 1, mid;
       int flag = 0;
       while(b <= e){
        mid = (b + e) / 2;
        if(a[mid] == find){
            return mid;
        }
        else if(a[mid] > find){
            e = mid - 1;
        }
        else{
            b = mid + 1;
        }
       }
       return -1;
    }
}
public class BSUsingObj {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array size : ");
        n = sc.nextInt();
        int[] a = new int[n]; //a[n]
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Value in a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter value to search : ");
        int search = sc.nextInt();
        BinarySearch obj = new BinarySearch();
        int result = obj.searchingElement(a, search);
        if(result != 1){
            System.out.print("Element is found! at " + result);
        }
        else{
            System.out.print("Element not found!" + result);
        }
    }
}
