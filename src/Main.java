import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Jogador> Jogadores = new ArrayList<>();

    public static void main(String[] args) {
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
                    break;
                }
            }
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
}