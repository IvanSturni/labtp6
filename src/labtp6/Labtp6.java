package labtp6;

/**
 *
 * @author Leandro Sturniolo
 */
public class Labtp6 {

    public static void main(String[] args) {
        Cliente juan = new Cliente("juan","perez", "32399933", "san luis", "colón 954");
        Cliente roberto = new Cliente("roberto","perez", "84000022", "merlo", "colón 954");
        Cliente fernando = new Cliente("fernando","olmedo", "19872883", "san luis", "rivadavia 1024");
        Cliente pablo = new Cliente("pablo","barros", "93288393", "merlo", "buenos aires 1024");
        Cliente bruno = new Cliente("bruno","pucci", "57893242", "juana koslay", "san martin 1024");
        
        DirectorioTelefonico dir = new DirectorioTelefonico();
        
        // Agregar clientes
        dir.agregarCliente("2664454545", juan);
        dir.agregarCliente("2664593030", roberto);
        dir.agregarCliente("2664523451", fernando);
        
        // Buscar el cliente por número de teléfono, intentar agregar a alguien al mísmo número de teléfono
        System.out.println("\n// Buscar el cliente por número de teléfono, intentar agregar otro cliente a un teléfono ya usado");
        System.out.println(dir.buscarCliente("2664593031"));
        dir.agregarCliente("2664593031", pablo);
        System.out.println(dir.buscarCliente("2664593031"));
        
        // Buscando todos los teléfonos de un cliente por apellido y por ciudad
        System.out.println("\n// Buscando todos los teléfonos de un cliente por apellido y por ciudad");
        System.out.println("Buscando teléfonos de clientes con apellido 'olmedo': " + dir.buscarTelefono("olmedo"));
        System.out.println("Buscando teléfonos de clientes con apellido 'perez': " + dir.buscarTelefono("perez"));
        System.out.println("Buscando clientes con residencia en 'san luis': " + dir.buscarClientes("san luis"));
        System.out.println("Buscando clientes con residencia en la misma ciudad que Pablo: " + dir.buscarClientes(pablo.getCiudad()));
        
        // Borrar todos los números de un dni
        System.out.println("\n// Borrar todos los números de un dni");
        dir.agregarCliente("2664599856", bruno);
        dir.agregarCliente("2664599857", bruno);
        System.out.println(dir.buscarTelefono(bruno.getApellido()));
        dir.borrarCliente(bruno.getDni());
        System.out.println(dir.buscarTelefono(bruno.getApellido()));
    }
}
