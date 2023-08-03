public class SortArrayInIncreasingOrder {
    
    public static int[] SwapAndSort(int[] arr){
        int lowerIndex=-1;
        int higherIndex=-1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                lowerIndex=i;
                break;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                higherIndex=i;
            }
        }

        int temp=arr[lowerIndex];
        arr[lowerIndex]=arr[higherIndex];
        arr[higherIndex]=temp;

        return arr;

    }

    public static void main(String[] args) {
        int[] arr= {3,8,6,7,5,9,10};
        System.out.println("Array before swaping and sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after swap and sort:");
        arr=SwapAndSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
