import java.util.ArrayList;
import java.util.List;
public class Jogador {

    private static String nome;
    private static int idade;
    private static int pontuacao;
    private static int numeroTentativas;

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
        Jogador.nome = nome;
    }

    public  void setIdade(int idade) {
        Jogador.idade = idade;
    }

    public  void setPontuacao(int pontuacao) {
        Jogador.pontuacao = pontuacao;
    }

    public  void setNumeroTentativas(int numeroTentativas) {
        Jogador.numeroTentativas = numeroTentativas;
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
}
