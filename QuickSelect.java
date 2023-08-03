import java.util.Random;
import java.util.Scanner;

public class QuickSelect {
    public static int QuickSelection(int[] arr,int k){
        int left = 0;
        int right = arr.length - 1;
        Random random = new Random();

        while (left <= right) {
            int pivotIndex = partition(arr, left, right, random);
            if (pivotIndex == arr.length - k) {
                return arr[pivotIndex];
            } else if (pivotIndex < arr.length - k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    private static int partition(int[] nums, int left, int right, Random random) {
        int pivotIndex = random.nextInt(right - left + 1) + left;
        int pivotValue = nums[pivotIndex];

        swap(nums, pivotIndex, right);

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }

        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k for finding kth largest element:");
        int k=sc.nextInt();

        if (k>n){
            System.out.println("K is out of bound");
        }
        else System.out.println("Kth largest element:"+ QuickSelection(arr,k));
    }
}
