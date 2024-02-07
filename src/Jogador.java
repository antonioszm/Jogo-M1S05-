public class Jogador {

    public static String nome;
    public static int idade;
    public static int pontuacao;
    public static int numeroTentativas;

    public static void addPontos(int pontos){
        pontuacao += pontos;
    }

    public static void removerPontos(int pontos){
        pontuacao -= pontos;
    }

    public static void adicionarTentativas(int tentativas){
        numeroTentativas -= tentativas;
    }
}
