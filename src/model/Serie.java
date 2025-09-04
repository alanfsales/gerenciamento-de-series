package model;

import java.util.Objects;

public class Serie {

    protected String titulo;
    protected int temporadas;

    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void exibirDetalhes() {
        System.out.println("Serie: " + titulo + " (" + getTemporadas() + " temporadas)");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }
}
