public class Exercicio2 {
    public static void main(String[] args) {
        /*
         * EXERCÍCIO 2:
         * Para que serve o modificador synchronized? Em que situações ele deve ser usado?
         * Por que não usar em todos os métodos do programa?
         *
         * RESPOSTA:
         * O modificador 'synchronized' serve para controlar o acesso concorrente a um bloco de código
         * ou método por múltiplas threads. Ele garante que apenas uma thread possa executar aquele
         * bloco ou método por vez (exclusão mútua), evitando condições de corrida e inconsistência de dados.
         *
         * Ele deve ser usado em situações onde múltiplas threads precisam acessar (ler e, principalmente, 
         * modificar) um recurso compartilhado (como variáveis de instância, coleções ou arquivos) 
         * simultaneamente, e a não sincronização dessas operações poderia levar a resultados incorretos.
         *
         * Não se deve usar 'synchronized' em todos os métodos porque ele introduz um custo computacional
         * de performance (overhead para adquirir e liberar os locks) e pode causar contenção (threads ficam
         * bloqueadas esperando outras terminarem de liberar o lock). Isso reduz consideravelmente o 
         * paralelismo do programa e, se usado incorretamente em múltiplos locks, pode causar deadlocks.
         */
         System.out.println("A resposta do exercício 2 está nos comentários deste arquivo.");
    }
}
