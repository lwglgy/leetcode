import java.util.LinkedList;

public class Offer13 {

    public int movingCount(int m, int n, int k) {
        int[][] visit = new int[m][n];
        int ans = 0;
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                visit[x][y] = 0;
            }
        }
        LinkedList<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[] {0,0});
        while(!queue.isEmpty()){
            Integer[] temp = queue.pop();
            if(visit[temp[0]][temp[1]] == 1)
                continue;
            visit[temp[0]][temp[1]] = 1;
            if(calcu(temp[0],temp[1])>k)continue;
            ans++;
            if(temp[0]+1<m)queue.add(new Integer[]{temp[0]+1,temp[1]});
            if(temp[1]+1<n)queue.add(new Integer[]{temp[0],temp[1]+1});
        }
        return ans;

    }

    public int calcu(int x,int y){
        int a,b;
        a=0;
        b=0;
        while(x!=0){
            a = a+x%10;
            x = x/10;
        }
        while(y!=0){
            b = b+y%10;
            y = y/10;
        }
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(new Offer13().movingCount(2,3,1));
    }
}
