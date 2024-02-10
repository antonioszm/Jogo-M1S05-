import java.util.Random;
public class Jogo {
    private static Jogador melhorJogador;
    private static int numeroJogadas;

    public static void jogar(Jogador jogador){
        Random random = new Random();
        int escolhaDaMaquina = random.nextInt(1, 3);
        switch (escolhaDaMaquina){
            case 1:
                System.out.println("Você ganhou!!!!!");
                jogador.addPontos(1);
                jogador.adicionarTentativas(1);
                numeroJogadas++;
                break;
            case 2:
                System.out.println("Você perdeu...");
                jogador.removerPontos(1);
                jogador.adicionarTentativas(1);\
                numeroJogadas++;
                break;
            case 3:
                System.out.println("Empate!");
                jogador.adicionarTentativas(1);
                numeroJogadas++;
                break;
        }
    }
}
