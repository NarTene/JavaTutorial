package Thread.typeOf_threads;

public class ThirdJoinDemoTwo {
    public static void main(String[] args) {
        Thread first = new Thread(new TryThreadJoin("A", "a", 200 ) );
        Thread secound = new Thread(new TryThreadJoin("B", "b", 400));
        Thread three = new Thread(new TryThreadJoin("C", "c", 600));
        first.start();
        secound.start();
        three.start();

        try{
            first.join();
            secound.join();
            three.join();
        }catch(InterruptedException e){
            System.out.println("Thread exceptions");
        }
    }

}


class TryThreadJoin extends Thread{
    private String firtName;
    private String secoundName;
    private long aWhile;
    private long total;

    public TryThreadJoin(String firstName, String secondName, long aWhile){
        this.firtName = firstName;
        this.secoundName = secondName;
        this.aWhile = aWhile;

    }

    @Override
    public void run(){
        try {
            while (total < 1000 ){
                System.out.print(firtName);
                Thread.sleep(aWhile);
                total += aWhile;
                System.out.println(secoundName + "\n");
            }

        }catch (InterruptedException e){

            System.out.println(firtName + secoundName + e);
        }
        System.out.println(secoundName + "Thread Stopped");
    }

}