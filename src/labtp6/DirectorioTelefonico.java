package labtp6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class DirectorioTelefonico {
    
    private HashMap<String, Cliente> directorio;

    public DirectorioTelefonico() {
        this.directorio = new HashMap<>();
    }
    
    public void agregarCliente(String num, Cliente cliente) {
        if (this.buscarCliente(num) == null) {
            directorio.put(num, cliente);
            System.out.println("Agregado cliente "+ cliente.getNombre() + ", teléfono "+ num +" con éxito.");
        } else System.out.println("No se pudo agregar el cliente " + cliente.getNombre() + ", el número proveído ya está asignado.");
    }

    public Cliente buscarCliente(String num) {
        return directorio.get(num);
    }

    public ArrayList<String> buscarTelefono(String apellido) {
        ArrayList<String> lista = new ArrayList<>();
        Set keys = directorio.keySet();
        String i;
        
        for (Iterator<String> it = keys.iterator();it.hasNext();) {
            i = it.next();
            if (this.buscarCliente(i).getApellido().equalsIgnoreCase(apellido)) lista.add(i);
        }
        
        return lista;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> lista = new ArrayList<>();
        Set keys = directorio.keySet();
        String i;
        
        for (Iterator<String> it = keys.iterator();it.hasNext();) {
            i = it.next();
            if (this.buscarCliente(i).getCiudad().equalsIgnoreCase(ciudad)) 
                lista.add(this.buscarCliente(i));
        }
        
        return lista;
    }
    
    public ArrayList<String> buscarTelefonosPorDni(String dni) {
        ArrayList<String> lista = new ArrayList<>();
        Set keys = directorio.keySet();
        String i;
        
        for (Iterator<String> it = keys.iterator();it.hasNext();) {
            i = it.next();
            if (this.buscarCliente(i).getDni().equals(dni)) 
                lista.add(i);
        }
        
        return lista;
    }

    public void borrarCliente(String dni) {
        for (String key : this.buscarTelefonosPorDni(dni)) {
            directorio.remove(key);
        }
        System.out.println("Números del cliente con el dni " + dni + " borrados con éxito.");
    }
}
