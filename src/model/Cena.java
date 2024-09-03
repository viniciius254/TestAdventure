package model;

public class Cena {
    private Integer id_cenas;
    private String nomeTitulo;

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

    @Override
    public String toString() {
        return "Cena{" +
                "id_cenas=" + id_cenas +
                ", nomeTitulo='" + nomeTitulo + '\'' +
                ", descricaoCenas='" + descricaoCenas + '\'' +
                '}';
    }
}
