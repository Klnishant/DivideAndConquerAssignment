public class seggerateNumWithRetainOrder {

    public static void segrretion(int[] arr){
        int negIndex=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[negIndex];
                arr[negIndex]=temp;

                negIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        System.out.println("Array before seggeration:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        segrretion(arr);
        System.out.println("Array after seggeration:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
