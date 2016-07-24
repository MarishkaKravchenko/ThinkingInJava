package Chapter_21.Task1;

class ClassA implements Runnable {
	public ClassA() {
            System.out.println("A constructor");
        }
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("A is running");
            Thread.yield();
        }
        System.out.println("A stopped");
        return;
    }
}


