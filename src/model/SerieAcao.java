package model;

public class SerieAcao extends Serie{

    public SerieAcao(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ação: " + titulo + " (" + temporadas + " temporadas)");
    }

    @Override
    public void reproduzirAbertura() {
        System.out.println("Reproduzindo Abertura explosiva e intensa de " + titulo);
    }


}
