import java.util.Scanner;

public class Exercicio1 {

    static class ContadorPrimosThread extends Thread {

        private int inicio;
        private int fim;
        private int contagem;

        public ContadorPrimosThread(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
            this.contagem = 0;
        }

        private boolean isPrimo(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        @Override
        public void run() {
            for (int i = inicio; i <= fim; i++) {
                if (isPrimo(i)) {
                    contagem++;
                }
            }
        }

        public int getContagem() {
            return contagem;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número 'n': ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println(
                "Por favor, informe um número positivo ou zero."
            );
            return;
        }

        // dividindo o esforco em duas threads
        int metade = n / 2;
        ContadorPrimosThread thread1 = new ContadorPrimosThread(0, metade);
        ContadorPrimosThread thread2 = new ContadorPrimosThread(metade + 1, n);

        // inicia a execucao das threads em paralelo
        thread1.start();
        thread2.start();

        try {
            // a thread principal (main) espera as duas threads terminarem
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Erro ao esperar as threads: " + e.getMessage());
        }

        // obtem o resultado de cada thread e soma
        int totalPrimos = thread1.getContagem() + thread2.getContagem();
        System.out.println(
            "Quantidade de números primos entre 0 e " + n + ": " + totalPrimos
        );
    }
}
