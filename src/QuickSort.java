public class QuickSort {
    public static void main(String[] args) {
        int a[] = {6,5,4,2,1,9,8};
        quickSort(a,0,a.length-1);
        for(int x:a) System.out.println(x);
    }

    public static void quickSort(int a[],int p,int r){
        if (p<r){
            int q = partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,r);
        }
    }

    public static int partition(int a[],int p,int r){
        int x = a[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(a[j]<x){
                i = i+1;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = x;
        a[r] = temp;
        return i+1;
    }
}
