public class ThreadTest extends Thread{

    private int ticket = 1000;

    public void run(){
        for(int i =0;i<1000;i++){

                if(this.ticket>0){

//                        Thread.sleep(1);
                        System.out.println(Thread.currentThread().getName()+"卖票---->"+(this.ticket--));


                }

        }
    }

    public static void main(String[] arg){
        ThreadTest t1 = new ThreadTest();
        new Thread(t1,"线程1").start();
        new Thread(t1,"线程2").start();
        new Thread(t1,"线程3").start();
    }
}