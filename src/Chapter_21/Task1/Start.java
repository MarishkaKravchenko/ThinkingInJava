package Chapter_21.Task1;

/*
* Output
A is running
C is running
A stopped
C stopped
B is running
B is running
B is running
B stopped
* */
public class Start {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new ClassA());
            Thread thread2 = new Thread(new ClassB());
            Thread thread3 = new Thread(new ClassC());
            thread1.start();
            thread2.start();
            thread3.start();
        }
}
