package wang.lvshang.thread;

import java.util.LinkedList;
import java.util.Queue;

public class Application2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread( new TaskQueue());
        t.start();
        t.join();
        System.out.println("end");

        //神经
    }
}


class TaskQueue implements Runnable{
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
    }

    public synchronized String getTask() {
        while (queue.isEmpty()) {
        }
        return queue.remove();
    }

    @Override
    public void run(){
        getTask();
        addTask("a");

    }
}
