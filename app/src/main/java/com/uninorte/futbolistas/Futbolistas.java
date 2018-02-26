package com.uninorte.futbolistas;

/**
 * Created by Kevin on 26/02/2018.
 */

class Futbolistas {

    String nombre;
    String posicion;
    String apellido;
    String estado;

    public Futbolistas(){
        super();
    }

    public Futbolistas(String name, String ape, String pos, String est){
        super();
        this.nombre=name;
        this.apellido=ape;
        this.posicion=pos;
        this.estado=est;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.posicion+" "+this.estado;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getPosicion(){
        return posicion;
    }
    public String getEstado(){
        return estado;
    }
}
