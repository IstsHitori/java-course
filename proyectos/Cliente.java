package proyectos;

public class Cliente{
    private String nombre_cliente;
    private String apellido_cliente;
    private long telefono_cliente;

    private String ID;

    public Cliente(){

    }
    public Cliente(String nombre_cliente, String apellido_cliente, long telefono_cliente,String ID){
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.ID = ID;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public long getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(long telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override

    public String toString(){
        return "ID:" + ID + "\nNombre:" + nombre_cliente + "\nApellido:" + apellido_cliente + "\nNumero telefonico:" + telefono_cliente + "\n<<---------------->>";
    }
}
