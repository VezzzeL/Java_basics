package Lesson_9;

@Repeat(4)
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello!");
    }

    public static void main(String[] strings) {
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor(0);
        myThreadPoolExecutor.execute(new MyRunnable());
    }
}

