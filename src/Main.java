import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Jogador> Jogadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("|              O que Deseja Fazer?                 |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  (1) Criar Jogador                               |");
        System.out.println("|  (2) Jogar                                       |");
        System.out.println("|  (3) Exibir Top 10                               |");
        System.out.println("====================================================");
        System.out.print("Escolha uma opção: ");

        int resposta = scanner.nextInt();

        switch (resposta){
            case 1:
                criarJogador();
                break;
            case 2:
                System.out.println("===========================================");
                System.out.println("|              Quer exibir:               |");
                System.out.println("|-----------------------------------------|");
                System.out.println("| (1) Pedra Papel e Tesoura               |");
                System.out.println("| (2) Adivinhe o numero                   |");
                System.out.println("===========================================");
                System.out.print("Escolha uma opção: ");
                int resposta2 = scanner.nextInt();
                if (resposta2 == 1){
                    Jogo.jogar(criarJogador());
                } else {
                    System.out.println("Digite o numero limite!");
                    int num = scanner.nextInt();
                    Jogo.jogar(criarJogador(), num);
                }
                break;

            case 3:
                exibirTop10();
                break;

        }


    }

    public static void exibirTop10(){
        int posicao = 1;
        for (Jogador jogador : Jogadores){
            System.out.println("Jogador: "+ jogador + " - " + posicao);
            posicao++;
            if (posicao == 11){ // termina o for so com 10
                break;
            }
        }
    }
    public static Jogador criarJogador(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome!: ");
            String nome = scanner.next();
            System.out.print("Digite sua idade!: ");
            int idade = scanner.nextInt();
            Jogador jogador3 = new Jogador("antonio", 2, 0,0);
            Jogadores.add(jogador3);


            for (Jogador jogador1 : Jogadores){
                if (nome.equals(jogador1.getNome())){ // if para checar se o nome ja está cadastrado
                    System.out.println("Esse nome já está em uso. Tente outro!");
                    System.out.print("Novo nome: ");
                }  //se n for ele cria o jogador

                if (!nome.equals(jogador1.getNome())){
                    Jogador jogador = new Jogador(nome, idade, 0,0);
                    Jogadores.add(jogador);
                    Jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
                    return jogador;
                }
            }
        }
    }
}