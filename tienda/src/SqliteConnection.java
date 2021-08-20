package src;

import java.sql.ResultSet;

import src.modelo.ClienteDAO;

public class SqliteConnection {

    public void ejecutarSentencia(String sentencia) {
    }

    public ResultSet ejecutarConsulta(String string) {
        return null;
    }

    public String listarProductosCliente(String idenCliente) {
        ClienteDAO cli1 = new ClienteDAO();
        String productos = cli1.listarProductosPorCliente(idenCliente, this);
        return productos;
    }

}
