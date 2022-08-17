package com.idat.EFERICKMARQUEZCLIENTE.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class ClientePizzaFK implements Serializable {

    @Column(name = "idCliente", nullable = false, unique = false)
    private Integer idCliente;

    @Column(name = "idPizza", nullable = false, unique = false)
    private Integer idPizza;
}
