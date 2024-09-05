package repository;

import model.Cena;
import model.Itens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    public static Itens findItemById(Integer id) {
        return new Itens();
    }

    public static List<Itens> findItensByScene(Cena cena) throws SQLException  {
        Connection connection = Mysql.getConnection();
        String sql = "select * from itens i where cena_Atual = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, cena.getId_cenas());
        ResultSet resultSet = ps.executeQuery();

        List<Itens> item = new ArrayList<>();
        while (resultSet.next()) {
            Itens itens = new Itens();
            itens.setId_itens(resultSet.getInt("id_itens"));
            itens.setNome(resultSet.getString("nome"));

            Integer idCenaAtual = resultSet.getInt("cena_Atual");

            itens.setCena_Atual(idCenaAtual);

            item.add(itens);
        }
        return item;
    }
}
