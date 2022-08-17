package com.idat.EFERICKMARQUEZCLIENTE.repository;

import com.idat.EFERICKMARQUEZCLIENTE.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
