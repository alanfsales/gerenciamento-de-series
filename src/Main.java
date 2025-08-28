import model.Serie;
import model.SerieComedia;
import model.SerieDrama;

public class Main {

    public static void main(String[] args) {

        Serie serie1 = new Serie("Qualquer Série", 1);
        Serie serie2 = new SerieDrama("Breaking Bad", 5);
        Serie serie3 = new SerieComedia("Friends", 10);

        serie1.exibirInfo();
        serie1.reproduzirAbertura();
        System.out.println("---------------------------------");

        serie2.exibirInfo();
        serie2.reproduzirAbertura();
        System.out.println("---------------------------------");

        serie3.exibirInfo();
        serie3.reproduzirAbertura();
    }
}