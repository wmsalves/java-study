package exercicios.lambda;

public class Threads {	public static void main(String[] args) {

    Runnable tarefa1 = new Tarefa1();
    Runnable tarefa2 = new Runnable() {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Executando Tarefa #02");
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable tarefa3 = Threads::executarTarefa3;

    Thread thread1 = new Thread(tarefa1);
    Thread thread2 = new Thread(tarefa2);
    Thread thread3 = new Thread(tarefa3);

    thread1.start();
    thread2.start();
    thread3.start();
}

    static void executarTarefa3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Executando Tarefa #03");
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
