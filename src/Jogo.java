import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private static Jogador melhorJogador;
    private static int numeroJogadas;

    public static void jogar(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre, Pedra, Papel e Tesoura!");
        String resposta = scanner.next();
        Random random = new Random();
        int escolhaDaMaquina = random.nextInt(1, 3);
        switch (escolhaDaMaquina) {
            case 1:
                System.out.println("Você ganhou!!!!!");
                jogador.addPontos(1);
                jogador.adicionarTentativas(1);
                numeroJogadas++;
                break;
            case 2:
                System.out.println("Você perdeu...");
                jogador.removerPontos(1);
                jogador.adicionarTentativas(1);
                numeroJogadas++;
                break;
            case 3:
                System.out.println("Empate!");
                jogador.adicionarTentativas(1);
                numeroJogadas++;
                break;
        }
    }

    public static void jogar(Jogador jogador, int num) {
        Scanner scanner = new Scanner(System.in);
        int numero = new Random().nextInt(0, num);
        int numeroDigitado;
        do {

            System.out.print("Tente adivinhar: ");
            numeroDigitado = scanner.nextInt();
            if (numeroDigitado > numero) {
                System.out.println("O numero é menor");
            } else if (numeroDigitado < numero) {
                System.out.println("numero é maior");
            }
        } while (numero != numeroDigitado);
        System.out.println("Errou");
        int tentativasRestantes = 10;

        while (tentativasRestantes > 0) {
            System.out.println("Tentativas restantes: " + tentativasRestantes);

            boolean acertou = false;
            if (numeroDigitado == numero) {
                acertou = true;
                jogador.addPontos(1);
                break;
            }
            if (!acertou) {
                tentativasRestantes--;
                jogador.removerPontos(1);
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            }
        }
    }
}