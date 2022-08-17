package com.idat.EFERICKMARQUEZCLIENTE.service;

import com.idat.EFERICKMARQUEZCLIENTE.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> listar();
    Cliente porId(Integer idCliente);
    void guardar(Cliente cliente);
    void eliminar(Integer idCliente);
    void actualizar(Cliente cliente);
    void asignarPizzaCliente();
}
