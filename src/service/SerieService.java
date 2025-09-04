package service;

import model.Serie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerieService implements CrudService{

    private Map<String, Serie> series = new HashMap<>();

    @Override
    public void adicionar(Serie serie) {
        String titulo = serie.getTitulo().toLowerCase();
        series.put(titulo, serie);
    }

    @Override
    public Serie buscar(String titulo){
        return series.get(titulo.toLowerCase());
    }

    @Override
    public List<Serie> listar() {
        return series.values().stream().toList();
    }

    @Override
    public void atualizar(Serie serie) {
        String chave = serie.getTitulo().toLowerCase();
        Serie serieAtual = series.get(chave);
        serieAtual.setTemporadas(serie.getTemporadas());
    }

    @Override
    public void excluir(String titulo) {
        String chave = titulo.toLowerCase();
        series.remove(chave);
    }

    @Override
    public boolean existe(String titulo) {
        return series.containsKey(titulo);
    }

}
