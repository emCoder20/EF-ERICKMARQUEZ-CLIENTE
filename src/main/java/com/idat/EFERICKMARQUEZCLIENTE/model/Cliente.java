package com.idat.EFERICKMARQUEZCLIENTE.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String nroCelular;
    private String direccion;
}
