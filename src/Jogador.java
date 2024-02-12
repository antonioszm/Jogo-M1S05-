import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Jogador {

    private  String nome;
    private  int idade;
    private  int pontuacao;
    private  int numeroTentativas;

    public static List<Jogador> Jogadores = new ArrayList<>();


    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public  String getNome() {
        return nome;
    }

    public  int getIdade() {
        return idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public  int getNumeroTentativas() {
        return numeroTentativas;
    }

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public  void setIdade(int idade) {
        this.idade = idade;
    }

    public  void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public  void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public  void addPontos(int pontos){
        pontuacao += pontos;
    }

    public  void removerPontos(int pontos){
        pontuacao -= pontos;
    }

    public  void adicionarTentativas(int tentativas){
        numeroTentativas += tentativas;
    }

    public static void criarJogador(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome!: ");
        String nome = scanner.next();
        System.out.print("Digite sua idade!: ");
        int idade = scanner.nextInt();
        boolean estaEmUso;

        do {
            estaEmUso = false;

            for (Jogador jogador : Jogadores) {
                if (nome.equals(jogador.getNome())) {
                    estaEmUso = true;
                    System.out.println("Esse nome já está em uso. Tente outro!");
                    System.out.print("Novo nome: ");
                    nome = scanner.next();
                    break;
                }
            }
            if (!estaEmUso){
                Jogador novoJogador = new Jogador(nome, idade, 0,0); //ESTA SOBRESCREVENDO
                Jogadores.add(novoJogador);
                Jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
            }

        } while (estaEmUso);


    }
    public static Jogador pegarJogador(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da sua conta!: ");
        String nome = scanner.next();
        boolean estaCadastrado;
        do {
            estaCadastrado = false;

            for (Jogador jogador : Jogadores) {
                if (nome.equals(jogador.getNome())) {
                    return jogador;
                }
            }
            if (!estaCadastrado){
                System.out.println("Não cadastrado!");
                System.out.println("Crie um!");
                System.out.print("Digite seu nome!: ");
                nome = scanner.next();
                System.out.print("Digite sua idade!: ");
                int idade = scanner.nextInt();
                boolean estaEmUso;

                do {
                    estaEmUso = false;

                    for (Jogador jogador : Jogadores) {
                        if (nome.equals(jogador.getNome())) {
                            estaEmUso = true;
                            System.out.println("Esse nome já está em uso. Tente outro!");
                            System.out.print("Novo nome: ");
                            nome = scanner.next();
                            break;
                        }
                    }


                } while (estaEmUso);

                Jogador novoJogador = new Jogador(nome, idade, 0,0); //ESTA SOBRESCREVENDO
                Jogadores.add(novoJogador);
                Jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
                return novoJogador;
            }

        } while (estaCadastrado);
        return null;
    }
    public static void exibirTop10(){
        int posicao = 1;
        for (int i =0; i < Jogadores.size(); i++){
            String nome = Jogadores.get(i).getNome();
            System.out.println("Jogador: "+nome  + " - " + posicao+"°" );
            posicao++;
            if (posicao == 11){ // termina o for so com 10
                break;
            }
        }
    }
    public static void exibirLista(){
        int posicao = 1;
        for (Jogador jogador : Jogadores){
            System.out.println("Jogador: "+ jogador.getNome() + " - " + posicao+"°");
            posicao++;
        }
    }

}
