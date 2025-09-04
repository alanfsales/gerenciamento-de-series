package model;

public class SerieAcao extends Serie{

    public SerieAcao(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ação: " + titulo + " (" + temporadas+ " temporadas)");
    }

}
