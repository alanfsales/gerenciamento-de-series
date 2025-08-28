package model;

public class SerieComedia extends Serie{

    public SerieComedia(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Comédia: " + titulo + " (" + temporadas + " temporadas)");
    }

    @Override
    public void reproduzirAbertura() {
        System.out.println("Reproduzindo Abertura divertida e engraçada de " + titulo);
    }
}
