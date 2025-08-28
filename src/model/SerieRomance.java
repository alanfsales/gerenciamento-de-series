package model;

public class SerieRomance extends Serie{

    public SerieRomance(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Romance: " + titulo + " (" + temporadas + " temporadas)");
    }

    @Override
    public void reproduzirAbertura() {
        System.out.println("Reproduzindo Abertura apaixonante e tocante de " + titulo);
    }
}
