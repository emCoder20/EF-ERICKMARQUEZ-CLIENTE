package com.idat.EFERICKMARQUEZCLIENTE.client;

import com.idat.EFERICKMARQUEZCLIENTE.dto.Pizza;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@FeignClient(name="idat-pizza", url="localhost:8084")
public class OpenFeingClient {

    @GetMapping("/pizza/listar")
    public List<Pizza> listarPizzaSeleccionados();

}