package datos;

/**
 *
 * @author PC-26
 */
public class Dcliente {

    private String nombre;
    private String apellido;
    private char sexo;
    
    DConexion con = new DConexion ();
    
        public Dcliente() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
        public void registrarCliente() throws Exception{
            String sql = "insert into cliente values ('"+this.nombre+"', '"+this.apellido+"', '"+this.sexo+"')";  //('nombre', 'apellido', 'sexo')";
            con.insertDate(sql);
    //System.out.println("Capa datos"+this.nombre+this.apellido+this.sexo);

    }

}
