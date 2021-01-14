import java.util.Arrays;
import java.util.Comparator;

public class Offer05 {
    public String replaceSpace(String s) {
        int n = s.length();
        if(n == 0)return s;
        int bn = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == ' '){
                bn++;
            }
        }
        int cl = n + bn*2;
        char[] ans = new char[cl];
        int index = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ' '){
                ans[index++] = '%';
                ans[index++] = '2';
                ans[index++] = '0';
            }else ans[index++] = s.charAt(i);
        }
        return String.valueOf(ans);
    }
}
