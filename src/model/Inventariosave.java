package model;

public class Inventariosave {
    private Integer id_inventory;

    public Integer getId_inventory() {
        return id_inventory;
    }

    public void setId_inventory(Integer id_inventory) {
        this.id_inventory = id_inventory;
    }

    public Itens getId_itens() {
        return id_itens;
    }

    public void setId_itens(Itens id_itens) {
        this.id_itens = id_itens;
    }

    private Itens id_itens;

    @Override
    public String toString() {
        return "Inventariosave{" +
                "id_inventory=" + id_inventory +
                ", id_itens=" + id_itens +
                '}';
    }
}
