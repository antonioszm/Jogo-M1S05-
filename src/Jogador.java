public class Jogador {

    private static String nome;
    private  static int idade;
    private static int pontuacao;
    private static int numeroTentativas;

    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public static String getNome() {
        return nome;
    }

    public static int getIdade() {
        return idade;
    }

    public static int getPontuacao() {
        return pontuacao;
    }

    public static int getNumeroTentativas() {
        return numeroTentativas;
    }

    public static void setNome(String nome) {
        Jogador.nome = nome;
    }

    public static void setIdade(int idade) {
        Jogador.idade = idade;
    }

    public static void setPontuacao(int pontuacao) {
        Jogador.pontuacao = pontuacao;
    }

    public static void setNumeroTentativas(int numeroTentativas) {
        Jogador.numeroTentativas = numeroTentativas;
    }

    public static void addPontos(int pontos){
        pontuacao += pontos;
    }

    public static void removerPontos(int pontos){
        pontuacao -= pontos;
    }

    public static void adicionarTentativas(int tentativas){
        numeroTentativas += tentativas;
    }
}
