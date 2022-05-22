package clases;

public class Auto {
    private int ID;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private int pasajeros;
    private String tipo_vehiculo;

    //Creando el constructor

    public Auto(int pID, String pPlaca, String pMarca, String pModelo, String pColor, int pPasajeros, String pTipo_vehiculo){
        ID = pID;
        placa = pPlaca;
        marca = pMarca;
        modelo = pModelo;
        color = pColor;
        pasajeros = pPasajeros;
        tipo_vehiculo = pTipo_vehiculo;
    }

    //Creamos los set y get


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }
    //Creamos el metodo toString

    public String SalidaAuto(){
        return "El auto con placa "+placa+ " de color " +color+ " marca "+marca+" puede llevar "+pasajeros+" porque es de tipo " + tipo_vehiculo;
    }
}
