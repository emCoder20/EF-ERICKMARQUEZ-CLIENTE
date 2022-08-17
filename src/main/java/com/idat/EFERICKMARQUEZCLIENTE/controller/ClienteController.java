package com.idat.EFERICKMARQUEZCLIENTE.controller;

import com.idat.EFERICKMARQUEZCLIENTE.model.Cliente;
import com.idat.EFERICKMARQUEZCLIENTE.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServ;

    @GetMapping("/listar")
    public @ResponseBody
    ResponseEntity<List<Cliente>>listarPizz(){
        return new ResponseEntity<List<Cliente>>(clienteServ.listar(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{idCliente}")
    public ResponseEntity<Cliente> buscarPizz(@PathVariable Integer idCliente){
        Cliente cli = clienteServ.listarPorId(idCliente);
        if(cli!=null) {
            return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
        }
        return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardarPizz(@RequestBody Cliente pizza){
        clienteServ.guardar(pizza);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PostMapping("actualizar")
    public ResponseEntity<Void> actualizarPizz(@RequestBody Cliente pizza){

        Cliente  cli = clienteServ.listarPorId(pizza.getIdCliente());

        if(cli!=null) {
            clienteServ.actualizar(pizza);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/eliminar/{idCliente}")
    public ResponseEntity<Void> eliminarPizz(@PathVariable Integer idCliente){
        Cliente cli = clienteServ.listarPorId(idCliente);
        if(cli!=null) {
            clienteServ.eliminar(idCliente);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/asignar")
    public @ResponseBody void asignarPizzeria(){
        clienteServ.asignarPizzaCliente();
    }

}

