package com.idat.EFERICKMARQUEZCLIENTE.repository;

import com.idat.EFERICKMARQUEZCLIENTE.model.ClienteDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer> {
}
