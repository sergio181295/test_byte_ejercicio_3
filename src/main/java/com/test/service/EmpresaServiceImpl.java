package com.test.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Empresa;
import com.test.repository.EmpresaRepo;
import com.test.utils.ErrorBase;

@Service
@Transactional
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	private EmpresaRepo empresaRepo;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Empresa> obtenerEmpresas() {
		try {			
			List<Empresa> lista = empresaRepo.findAll(); 
			return lista;
		} catch (Exception e) {
			throw new ErrorBase(e.getMessage());
		}
	}

	@Override
	public Empresa obtenerEmpresaId(long id) {
		try {
			String sqlString = "SELECT ID FROM EMPRESAS WHERE ID = " + id;
			Query qry = entityManager.createNativeQuery(sqlString);
			if(qry.getResultList().isEmpty()) {				
				throw new ErrorBase("No existe la empresa " + id);
			}
			
			Empresa empresa = empresaRepo.findById(id).get();
			return empresa;
			
		} catch (Exception e) {
			throw new ErrorBase(e.getMessage());
		}
		
	}

	@Override
	public Empresa crearEmpresa(Empresa empresa) {
		try {			
			Empresa empresaGuardada = empresaRepo.save(empresa);
			return empresaGuardada;
		} catch (Exception e) {
			throw new ErrorBase(e.getMessage());
		}
		
	}
	
	@Override
	public Empresa editarEmpresa(Empresa empresa, long id) {
		try {			
			this.obtenerEmpresaId(id);
			Empresa empresaGuardada = empresaRepo.save(empresa);
			return empresaGuardada;
		} catch (Exception e) {
			throw new ErrorBase(e.getMessage());
		}
	}

	@Override
	public void eliminarEmpresa(long id) {
		try {			
			this.obtenerEmpresaId(id);
			empresaRepo.deleteById(id);		
		} catch (Exception e) {
			throw new ErrorBase(e.getMessage());
		}
		
	}

}
