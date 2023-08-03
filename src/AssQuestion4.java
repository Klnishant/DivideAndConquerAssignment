public class AssQuestion4 {
    public static boolean isPermutationsExists(int[] a,int[] b,int k){
        for (int i = 0; i < a.length; i++) {
            if (a[i]+b[i]>=k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={2,1,3};
        int[] b={7,8,9};
        int k=10;

        if (isPermutationsExists(a,b,k)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
