package com.software.clientes.DAO;

import java.util.List;

public interface DAOCliente {
    public List<Cliente> listar();

    public void eliminar();

    public String buscar(String buscar);

    public void escribir(Cliente cliente,boolean anexar);

    public void crear();

    public String borrarCliente(String cliente,List<Cliente> clientes);
}
