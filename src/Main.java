import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Jogador> Jogadores = new ArrayList<>();

    public static void main(String[] args) {

        Jogador jogador = new Jogador("antonio", 16, 0,0);

        Jogadores.add(jogador);

        Jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

    }
}