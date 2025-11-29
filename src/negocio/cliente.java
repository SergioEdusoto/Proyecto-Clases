package negocio;

public class cliente {

    datos.Dcliente cliente = new datos.Dcliente();

    public cliente() {
    }

    public void registrarCliente(String nombre, String apellido, char sexo) throws Exception {
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setSexo(sexo);
        cliente.registrarCliente();
        
        System.out.println("datos" + nombre + apellido + sexo);
    }
}
