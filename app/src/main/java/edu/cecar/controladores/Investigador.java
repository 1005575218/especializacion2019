/**

    Clase: Investigador.java

    Version: 0.1

    Fecha Creaci�n: 12/02/2019

    Ultima Fecha de Modificaci�n: 

    Copyright: Jhon Jaime Mendez
*/

package edu.cecar.controladores;

/**
  Esta clase modela los datos de un Investigador
*/

public class Investigador {

    private String nombres;
    private String nacionalidad;
    private String sexo;
    private String lineaInvestigacion;
    private boolean categorizado;


    public Investigador(String nombres, String nacionalidad, String sexo, String lineaInvestigacion, boolean categorizado) {
        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.lineaInvestigacion = lineaInvestigacion;
        this.categorizado = categorizado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    public void setLineaInvestigacion(String lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
    }

    public boolean isCategorizado() {
        return categorizado;
    }

    public void setCategorizado(boolean categorizado) {
        this.categorizado = categorizado;
    }
}
