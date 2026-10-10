public class thread {
     
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Глоавный поток завершен");
    }
}




class NewThread extends Thread {
    Thread t;

    NewThread() {
        super("Дочерний поток");
        System.out.println("Дочерний поток " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("дочерний поток прерван!");
        }

        System.out.println("дочерний поток завершена");
    }
}
