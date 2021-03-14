package com.test.service;

import java.util.List;

import com.test.entity.Empresa;

public interface EmpresaService {
	
	public List<Empresa> obtenerEmpresas();
	
	public Empresa obtenerEmpresaId(long id);
	
	public Empresa crearEmpresa(Empresa empresa);
	
	public Empresa editarEmpresa(Empresa empresa, long id);
		
	public void eliminarEmpresa(long id);
}
