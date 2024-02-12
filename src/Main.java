import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("|              O que Deseja Fazer?                 |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  (1) Criar Jogador                               |");
        System.out.println("|  (2) Jogar                                       |");
        System.out.println("====================================================");
        System.out.print("Escolha uma opção: ");

        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                Jogador.criarJogador();
                break;
            case 2:
                System.out.println("===========================================");
                System.out.println("|              Quer jogar?:               |");
                System.out.println("|-----------------------------------------|");
                System.out.println("| (1) Pedra Papel e Tesoura               |");
                System.out.println("| (2) Adivinhe o numero                   |");
                System.out.println("===========================================");
                System.out.print("Escolha uma opção: ");
                int resposta2 = scanner.nextInt();
                if (resposta2 == 1) {
                    Jogo.jogar(Jogador.pegarJogador());
                    encaceramento();
                } else {
                    System.out.println("Digite o numero limite!");
                    int num = scanner.nextInt();
                    Jogo.jogar(Jogador.pegarJogador(), num);
                    encaceramento();
                }
                break;
            }
        }
    }

    public static void encaceramento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("|              O que Deseja Fazer?                 |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  (1) Ver Top 10                                  |");
        System.out.println("|  (2) Exibir lista completa                       |");
        System.out.println("|  (3) Jogar novamente                             |");
        System.out.println("|  (4) Encerar                                     |");
        System.out.println("====================================================");
        System.out.print("Escolha uma opção: ");

        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                Jogador.exibirTop10();
                break;
            case 2:
                Jogador.exibirLista();
                break;
            case 3:
                System.out.println("===========================================");
                System.out.println("|              Quer jogar?:               |");
                System.out.println("|-----------------------------------------|");
                System.out.println("| (1) Pedra Papel e Tesoura               |");
                System.out.println("| (2) Adivinhe o numero                   |");
                System.out.println("===========================================");
                System.out.print("Escolha uma opção: ");
                int resposta2 = scanner.nextInt();
                if (resposta2 == 1) {
                    Jogo.jogar(Jogador.pegarJogador());
                    encaceramento();
                } else {
                    System.out.println("Digite o numero limite!");
                    int num = scanner.nextInt();
                    Jogador.pegarJogador();
                    Jogo.jogar(Jogador.pegarJogador(), num);
                    encaceramento();
                }
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
