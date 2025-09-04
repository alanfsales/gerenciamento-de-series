package service;

import model.Serie;

import java.util.List;

public interface CrudService {

    void adicionar(Serie serie);
    Serie buscar(String titulo);
    List<Serie> listar();
    void atualizar(Serie serie);
    void excluir(String titulo);
    boolean existe(String titulo);

}
