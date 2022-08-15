package com.app.model;

public class Producto {
	 
	public Producto() {
		this.codigo = ++ultimoCodigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	private int codigo;
	private String nombre;
	private float precio;
	private static int ultimoCodigo;
}
