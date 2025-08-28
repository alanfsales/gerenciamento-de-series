package model;

public class Serie {

    protected String titulo;
    protected int temporadas;

    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }

    public void exibirInfo() {
        System.out.println("Série: " + titulo + " (" + temporadas + " temporadas)");
    }

    public void reproduzirAbertura() {
        System.out.println("Reproduzindo abertura da série " + titulo);
    }
}
