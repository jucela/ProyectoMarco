package com.example.jlavado.proyectomarco.Modelo;

public class MarcoCampos {
    private int id;
    private int variable;
    private int posicion;

    public MarcoCampos(int id, int variable, int posicion) {
        this.id = id;
        this.variable = variable;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


}
