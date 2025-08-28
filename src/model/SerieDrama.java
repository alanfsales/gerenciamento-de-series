package model;

public class SerieDrama extends Serie{

    public SerieDrama(String titulo, int temporadas) {
        super(titulo, temporadas);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Drama: " + titulo + " (" + temporadas + " temporadas)");
    }

    @Override
    public void reproduzirAbertura() {
        System.out.println("Reproduzindo a abertura emocionante e intensa de " + titulo);
    }
}
