package com.example.jlavado.proyectomarco.Modelo;

import java.util.ArrayList;

public class MarcoFiltro {
    private int id;
    private int filtro;
    private int posicion;

    public MarcoFiltro(int id, int filtro, int posicion) {
        this.id = id;
        this.filtro = filtro;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public int getFiltro() {
        return filtro;
    }

    public int getPosicion() {
        return posicion;
    }

//    public String toString(){
//        return posicion+"";
//    }

    public static ArrayList<MarcoFiltro> getConfigFiltro(){
        ArrayList<MarcoFiltro> data=new ArrayList<>();
        data.add(new MarcoFiltro(1,1,1));
        data.add(new MarcoFiltro(2,2,2));
        return data;
    }



}
