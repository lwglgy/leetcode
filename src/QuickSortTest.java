public class QuickSortTest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,99,8,7};
        quicksort(arr,0,arr.length-1);
        for(int x:arr) System.out.println(x);
    }

    public static void quicksort(int[]arr, int p,int r){
        if(p<r){
            int q = partition(arr,p,r);
            partition(arr,p,q-1);
            partition(arr,q+1,r);
        }
    }

    private static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] < x) {
                i = i + 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[r] = arr[i + 1];
        arr[i + 1] = x;
        return i + 1;
    }

}
