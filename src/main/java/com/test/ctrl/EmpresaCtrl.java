package com.test.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Empresa;
import com.test.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaCtrl {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public List<Empresa> obtenerEmpresas() {
		List<Empresa> lista = empresaService.obtenerEmpresas(); 
		return lista;
	}

	@GetMapping("/{id}")
	public Empresa obtenerEmpresaId(@PathVariable("id") long id) {
		return empresaService.obtenerEmpresaId(id);
	}

	@PostMapping
	public Empresa crearEmpresa(@RequestBody Empresa empresa) {
		Empresa empresaGuardada = empresaService.crearEmpresa(empresa);
		return empresaGuardada;
	}
	
	@PutMapping("/{id}")
	public Empresa editarEmpresa(@RequestBody Empresa empresa, @PathVariable("id") long id) {
		Empresa empresaGuardada = empresaService.editarEmpresa(empresa, id);
		return empresaGuardada;
	}

	@DeleteMapping("/{id}")
	public void eliminarEmpresa(@PathVariable("id") long id) {
		empresaService.eliminarEmpresa(id);
	}

}
