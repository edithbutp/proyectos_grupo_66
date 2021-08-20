package src.controlador;

import src.modelo.ClienteDAO;

public class ControladorCliente {

    public String listarClientes(src.SqliteConnection conexionBD) {
        ClienteDAO cli1 = new ClienteDAO();
        String clientes = cli1.mostrarClientes(conexionBD);
        return clientes;
    }

}
