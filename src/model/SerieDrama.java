package model;

public class SerieDrama extends Serie{

    public SerieDrama(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Drama: " + titulo + " (" + temporadas + " temporadas)");
    }

}
