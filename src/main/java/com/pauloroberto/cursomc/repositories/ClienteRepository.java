package com.pauloroberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloroberto.cursomc.domains.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
