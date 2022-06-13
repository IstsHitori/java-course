package proyectos;

public class Cliente{
    private String nombre_cliente;
    private String apellido_cliente;
    private long telefono_cliente;

    public Cliente(){

    }
    public Cliente(String nombre_cliente, String apellido_cliente, long telefono_cliente){
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
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

    @Override

    public String toString(){
        return "Datos del cliente:\n" + "Nombre:" + nombre_cliente + "Apellido:" + apellido_cliente + "Numero telefonico:" + telefono_cliente;
    }
}
