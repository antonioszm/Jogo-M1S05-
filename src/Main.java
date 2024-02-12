import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Jogador> Jogadores = new ArrayList<>();


    public static void main(String[] args) {
        Jogador jogador = new Jogador("JogadorN-1", 12,0,0);
        Jogadores.add(jogador);
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
                criarJogador();
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
                    Jogo.jogar(pegarJogador());
                    encaceramento();
                } else {
                    System.out.println("Digite o numero limite!");
                    int num = scanner.nextInt();
                    Jogo.jogar(pegarJogador(), num);
                    encaceramento();
                }
                break;
            }
        }


    }


    public static Jogador criarJogador(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome!: ");
            String nome = scanner.next();
            System.out.print("Digite sua idade!: ");
            int idade = scanner.nextInt();


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
        return null;
    }
    public static Jogador pegarJogador(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da sua conta!: ");
        String nome = scanner.next();
        for (Jogador jogador1 : Jogadores){
            if (!(nome.equals(jogador1.getNome()))){
                System.out.println("Não cadastrado!");
                System.out.println("Crie um!");
                criarJogador();
            }
            if (nome.equals(jogador1.getNome())){ // if para checar se o nome ja está cadastrado
                return jogador1;
            }
        }
        return null;
    }
    public static void exibirTop10(){
        int posicao = 1;
        for (Jogador jogador : Jogadores){
            System.out.println("Jogador: "+ jogador.getNome() + " - " + posicao+"°");
            posicao++;
            if (posicao == 11){ // termina o for so com 10
                break;
            }
        }
    }
    public static void exibirLista(){
        int posicao = 1;
        for (int i = 0; i < Jogadores.size(); i++){
            Jogador jogador = Jogadores.get(i);
            System.out.println("Jogador: "+ jogador.getNome() + " - " + posicao+"°");
            posicao++;
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
                exibirTop10();
                break;
            case 2:
                exibirLista();
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
                    Jogo.jogar(pegarJogador());
                    encaceramento();
                } else {
                    System.out.println("Digite o numero limite!");
                    int num = scanner.nextInt();
                    pegarJogador();
                    Jogo.jogar(pegarJogador(), num);
                    encaceramento();
                }
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
