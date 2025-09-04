package model;

public class SerieComedia extends Serie{

    public SerieComedia(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Comédia: " + titulo + " (" + getTemporadas() + " temporadas)");
    }
}
