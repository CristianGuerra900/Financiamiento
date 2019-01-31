package com.financiacion.model;

public class DataBean {
    private Long id;
    private String nombre;
    private String taza;
    private String montoMaximoDisponible;
    
    private String cuotaMensual;
    private String pagoTotal;

    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTaza() {
		return taza;
	}

	public void setTaza(String taza) {
		this.taza = taza;
	}

	public String getMontoMaximoDisponible() {
		return montoMaximoDisponible;
	}

	public void setMontoMaximoDisponible(String montoMaximoDisponible) {
		this.montoMaximoDisponible = montoMaximoDisponible;
	}

	public String getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(String cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public String getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(String pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	
	
	public String toString() {
        return String.format("id:%s,nombre:%d,taza:%s,montoMaximoDisponible:%s,cuotaMensual:%s,pagoTotal:%s",
        		              id, nombre, taza, montoMaximoDisponible,cuotaMensual,pagoTotal);
    }
}
