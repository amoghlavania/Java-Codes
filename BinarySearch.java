import java.util.Scanner;
public class BinarySearch {
    public static int binarySearchIterative(int[] arr, int low, int high, int data) {
        while(low<=high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == data)
            return mid;
            else if(arr[mid] > data)
            high = mid -1;
            else low = mid +1;
        }
        
        return -1;
    }

    public static int binarySearchRecursive(int arr[], int low, int high, int data) {
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int data = sc.nextInt();
        int dataIndex = binarySearchIterative(arr, 0, n - 1, data);
        System.out.println(dataIndex);
        sc.close();
    }
}
