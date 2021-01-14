public class S3 {
    public static void main(String[] args) {
        int a[] = {3,2,1,5,6,4};
        int ans = quickSort(a,0,a.length-1,2);
        System.out.println(ans);
    }

    public static int quickSort(int []a,int p,int r,int k){
        if(p<=r){
            int q = partition(a,p,r);
            int left = q-p+1;
            if(left == k){
                return a[q];
            }
            if(left<k){
                return quickSort(a,q+1,r,k-left);
            }
            if(left>k){
                return quickSort(a,p,q-1,k);
            }
            return -1;
        }
        return -1;
    }

    public static int partition(int []a,int p,int r){
        int x = a[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(a[j]>x){
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
