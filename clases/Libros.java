package clases;

public class Libros{
    private int ID;
    private String name;
    private String editorial;
    private String autor;
    private int numPaginas;
    private String categoria_libro;

    //Constructir
    public Libros(int pid, String pname, String peditory, String pautor, int pnum_paginas){
        ID = pid;
        name =  pname;
        editorial = peditory;
        autor = pautor;
        numPaginas = pnum_paginas;
    }
    //El get returna un valor
    public int getID() {
        return ID;
    }
    //El set no returna valor pero recibe el tipo de dato con el nombre del dato
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String salidaString(){
        return "El libro con ID " +ID+ " lleva como nombre " +name+ " y tiene " +numPaginas+ " de paginas.<";
    }
}
