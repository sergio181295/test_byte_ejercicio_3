package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Empresa;

public interface EmpresaRepo extends JpaRepository<Empresa, Long>{
}
