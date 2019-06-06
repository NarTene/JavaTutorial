package Thread.typeOf_threads;

public class MultiThreadWithLoop {
    public static void main(String[] args) {
        int n = 8; //creating number of thread

        for (int i = 0; i < n; i++){
            MultiThread_Demo demo = new MultiThread_Demo();
            demo.start();

            Thread obj = new Thread(new MultiThread_Runnabe());
            obj.start();
        }
    }

}


class MultiThread_Demo extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("thread" + Thread.currentThread().getId() + "running");
        }catch (Exception e){
            System.out.println(" Thread Exception");
        }
    }
}

class MultiThread_Runnabe implements Runnable {
    @Override
    public void run(){
        try {
            System.out.println("thread" + Thread.currentThread().getId() + "running");
        }catch (Exception e){
            System.out.println(" Thread Exception");
        }
    }

}