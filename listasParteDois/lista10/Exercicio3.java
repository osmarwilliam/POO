public class Exercicio3 {

    public static void main(String[] args) {
        /*

         * - Thread.sleep(millis): É um método estático que pausa a execução da thread atual (a thread
         *   que chamou o método) por um tempo específico em milissegundos. Durante esse tempo, a thread
         *   não consome CPU. É muito usado para introduzir atrasos intencionais ou simular processamento,
         *   sem liberar locks adquiridos.
         *
         * - thread.join(): É um método de instância chamado a partir de um objeto Thread específico. Ele faz
         *   com que a thread atual (quem executou a chamada) pause e espere até que a thread alvo termine
         *   sua execução por completo. É o principal mecanismo para sincronizar o término de atividades
         *   de threads, permitindo que uma thread só continue quando outra terminar seu processamento.
         */
    }
}
