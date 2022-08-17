package com.idat.EFERICKMARQUEZCLIENTE.service;

import com.idat.EFERICKMARQUEZCLIENTE.client.OpenFeingClient;
import com.idat.EFERICKMARQUEZCLIENTE.dto.Pizza;
import com.idat.EFERICKMARQUEZCLIENTE.model.Cliente;
import com.idat.EFERICKMARQUEZCLIENTE.model.ClienteDetalle;
import com.idat.EFERICKMARQUEZCLIENTE.model.ClientePizzaFK;
import com.idat.EFERICKMARQUEZCLIENTE.repository.ClienteDetalleRepository;
import com.idat.EFERICKMARQUEZCLIENTE.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteDetalleRepository detalleRepository;

    @Autowired
    private OpenFeingClient feingClient;

    @Override
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @Override
    public Cliente listarPorId(Integer idCliente) {
        return repository.findById(idCliente).orElse(null);
    }

    @Override
    public void guardar(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public void eliminar(Integer idCliente) {
        repository.deleteById(idCliente);
    }

    @Override
    public void actualizar(Cliente cliente) {
        repository.saveAndFlush(cliente);
    }

    @Override
    public void asignarPizzaCliente() {
        List<Pizza> listado = feingClient.listarPizzaSeleccionados();
        ClientePizzaFK fk = null;
        ClienteDetalle detalle = null;

        for (Pizza pizza: listado) {
            fk = new ClientePizzaFK();
            fk.setIdPizza(pizza.getIdPizza());
            fk.setIdCliente(1);

            detalle = new ClienteDetalle();
            detalle.setFk(fk);
            detalleRepository.save(detalle);
        }
    }
}

