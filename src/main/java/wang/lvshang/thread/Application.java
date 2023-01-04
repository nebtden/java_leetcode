package wang.lvshang.thread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Couter.total);
    }
}

class AddThread extends Thread {
    @Override
    public    void run() {

        for (int i = 0; i < 100; i++) {
            try {
                Couter.couter.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

class DecThread extends Thread {
    @Override
    public    void run() {

        for (int i = 0; i < 100; i++) {
            try {
                Couter.couter.reduce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

class  Couter {

    public static Integer total = 0;
    public static Couter couter = new Couter();

    public   synchronized  void add() throws InterruptedException {
        System.out.println("add1");
        Couter.total++;
        System.out.println("add2");
        Thread.sleep(1);
    }

    public   synchronized  void reduce() throws InterruptedException {
        System.out.println("reduce1");
        Couter.total--;
        System.out.println("reduce2");
        Thread.sleep(1);
    }
}
