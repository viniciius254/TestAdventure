package model;

import java.util.List;

public class Cena {
    private Integer id_cenas;
    private String nomeTitulo;
    private List<Itens> itens;

    public Integer getId_cenas() {
        return id_cenas;
    }

    public void setId_cenas(Integer id_cenas) {
        this.id_cenas = id_cenas;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getDescricaoCenas() {
        return descricaoCenas;
    }

    public void setDescricaoCenas(String descricaoCenas) {
        this.descricaoCenas = descricaoCenas;
    }

    private String descricaoCenas;

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Cena{" +
                "id_cenas=" + id_cenas +
                ", nomeTitulo='" + nomeTitulo + '\'' +
                ", descricaoCenas='" + descricaoCenas + '\'' +
                '}';
    }
}
