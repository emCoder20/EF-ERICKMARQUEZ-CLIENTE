package com.idat.EFERICKMARQUEZCLIENTE.dto;

import lombok.Data;

@Data
public class ClienteDto {

    private Integer idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String nroCelular;
    private String direccion;
}
