public class App {
    public static void main (String[] args) throws Exception {
        System.out.println("Bienvenido al Cine");
        
        Cliente clienteUno = new Cliente();
        clienteUno.setCedula("32862030");
        clienteUno.setNombre("EDITH");
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos dias");
        float costo = clienteUno.calcularCosto(8000);
        clienteUno.mostrarDatos();

        System.out.println();
        System.out.println("Cedula: " + clienteUno.getCedula() + "\nNombre: "+clienteUno.getNombre()+ "\nID: " + clienteUno.getId()+ "\nCosto tiquete: "+ costo);

        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("1919778");
        clienteDos.setNombre("MARCOS");
        clienteDos.setNumeroTarjeta(100);
        float costoDos = clienteDos.calcularCosto(8000);

        System.out.println("Cedula: " + clienteDos.getCedula() + "\nNombre: "+clienteDos.getNombre()+ "\nNumero de Tarjeta: " + clienteDos.getNumeroTarjeta()+ "\nCosto tiquete: "+ costoDos);
        // Prueba de contenedores

            System.out.println();
            Prueba pruebaContenedor = new Prueba();
            pruebaContenedor.generarLista();

    }
}
