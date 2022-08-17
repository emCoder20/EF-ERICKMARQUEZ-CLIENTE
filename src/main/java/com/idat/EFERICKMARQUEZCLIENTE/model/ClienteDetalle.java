package com.idat.EFERICKMARQUEZCLIENTE.model;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "clientePizza")
public class ClienteDetalle {

    @EmbeddedId
    private ClientePizzaFK fk = new ClientePizzaFK();
}
