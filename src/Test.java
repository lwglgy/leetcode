import java.util.concurrent.ConcurrentHashMap;

public class Test {
     public void  threadTest(){
         ThreadLocal<String> local = new ThreadLocal<>();
         ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
     }
}
