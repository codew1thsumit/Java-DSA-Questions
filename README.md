# Binary Search in Java

## Overview

This program implements the **Binary Search algorithm** to find a given element in a sorted array. Binary Search is an efficient searching technique that works by repeatedly dividing the search range into halves.

---

## Key Idea

Binary Search compares the target value with the **middle element** of the array:

* If equal → element found
* If smaller → search in left half
* If larger → search in right half

---

## Algorithm (Steps)

1. Initialize:

   * `b = 0` (beginning index)
   * `e = n - 1` (ending index)

2. Repeat while `b <= e`:

   * Find middle index: `mid = (b + e) / 2`
   * If `a[mid] == find` → element found
   * If `a[mid] > find` → search left (`e = mid - 1`)
   * Else → search right (`b = mid + 1`)

3. If loop ends → element not found

---

## Code

```java
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};
        int n = a.length;

        System.out.print("Enter the value to search: ");
        int find = sc.nextInt();

        int b = 0, e = n - 1, mid;
        int flag = 0;

        while (b <= e) {
            mid = (b + e) / 2;

            if (a[mid] == find) {
                flag = 1;
                break;
            } 
            else if (a[mid] > find) {
                e = mid - 1;
            } 
            else {
                b = mid + 1;
            }
        }

        if (flag == 0)
            System.out.println(find + " is Not found!");
        else
            System.out.println(find + " is found!");

        sc.close();
    }
}
```

---

## Time Complexity

* **Best Case:** O(1)
* **Average Case:** O(log n)
* **Worst Case:** O(log n)

---

## Space Complexity

* **O(1)** (no extra space used)

---

## Important Notes

* The array **must be sorted** before applying Binary Search
* More efficient than Linear Search for large datasets

---

## Example

Input:

Enter the value to search: 30

Output:
30 is found!

## Conclusion

Binary Search is a fast and efficient algorithm for searching in sorted data, reducing the search space by half in each step.
