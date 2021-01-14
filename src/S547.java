import java.util.HashSet;

public class S547 {
    int [] father;

    public int findCircleNum(int[][] M) {
        int m = M.length;
        if (M.length == 0)
            return 0;
        father = new int[m];
        for(int x=0;x<m;x++){
            father[x] = x;
        }
        for (int x=0;x<m;x++){
            for(int y = x+1;y<m;y++){
                if(M[x][y] == 1){
                    int fx = find(x);
                    int fy = find(y);
                    if(fx>fy) {
                        father[fx] = fy;
                        father[x] = fy;
                    }else {
                        father[fy] = fx;
                        father[x] = fx;
                    }

                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x=0;x<m;x++){
            father[x] = find(x);
            set.add(father[x]);
        }
        return set.size();

    }

    public int find(int x){
        while(father[x] != father[father[x]]){
            father[x] = father[father[x]];
        }
        return father[x];
    }

}
