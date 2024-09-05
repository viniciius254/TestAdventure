package repository;

import model.Cena;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CenaDAO {
    public static Cena findCenaById(Integer id) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM cenas WHERE id_cenas = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Cena cena = new Cena();
            cena.setId_cenas(rs.getInt("id_cenas"));
            cena.setDescricaoCenas(rs.getNString("descricaoCenas"));
            //cena.setItens();//
        }
        return new Cena();
    }
        public static void insertCena(Cena cena) throws SQLException {
        Connection connection = Mysql.getConnection();
        String insert = "INSERT INTO cenas(descricaoCenas) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(insert);
        ps.setString(1, cena.getDescricaoCenas());
        ps.execute();
        }
}
