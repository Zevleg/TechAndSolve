package com.solve.prueba.model.dto;

import java.io.Serializable;

public class RespuestaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private String descripcion;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
