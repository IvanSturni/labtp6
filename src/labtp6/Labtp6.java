/*
 */
package labtp6;

/**
 *
 * @author Leandro Sturniolo
 */
public class Labtp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente juan = new Cliente("juan","perez", "32399933", "san luis", "colón 954");
        Cliente roberto = new Cliente("roberto","perez", "84000022", "juana koslay", "colón 954");
        Cliente fernando = new Cliente("fernando","olmedo", "19872883", "san luis", "rivadavia 1024");
        
        DirectorioTelefonico dir = new DirectorioTelefonico();
        
        dir.agregarCliente("2664454545", juan);
        dir.agregarCliente("2664593030", roberto);
        dir.agregarCliente("2664593031", fernando);
        
        //System.out.println(dir.buscarCliente("2664593030"));
        System.out.println("antes de borrar:" +dir.buscarTelefono("perez"));
        //System.out.println(dir.buscarClientes("san luis"));
        dir.borrarCliente("84000022");
        
        System.out.println("despues de borrar" +dir.buscarTelefono("perez"));

        
        
    }
    
}
