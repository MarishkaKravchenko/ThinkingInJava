package Chapter_21.Task1;

class ClassB implements Runnable {
    public ClassB() {
        System.out.println("B constructor");
    }
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("B is running");
            Thread.yield();
        }
        System.out.println("B stopped");
        return;
    }
}
