package Chapter_21.Task1;

class ClassC implements Runnable {
    public ClassC() {
        System.out.println("C constructor");
    }
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("C is running");
            Thread.yield();
        }
        System.out.println("C stopped");
        return;
    }
}
