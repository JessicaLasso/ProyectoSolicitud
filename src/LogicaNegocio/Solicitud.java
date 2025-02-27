/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.ArrayList;

/**
 *
 * @author jessica andrea lasso
 */
public class Solicitud {
    
    
    public String nombresolicitante , cedula, codigo;

    
    public ArrayList <Actividad> listaactividad;

    public Solicitud() {
    }

    public Solicitud(String nombresolicitante, String cedula, String codigo, ArrayList<Actividad> listaactividad) {
        this.nombresolicitante = nombresolicitante;
        this.cedula = cedula;
        this.codigo = codigo;
        this.listaactividad = listaactividad;
    }

    public String getNombresolicitante() {
        return nombresolicitante;
    }

    public void setNombresolicitante(String nombresolicitante) {
        this.nombresolicitante = nombresolicitante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Actividad> getListaactividad() {
        return listaactividad;
    }

    public void setListaactividad(ArrayList<Actividad> listaactividad) {
        this.listaactividad = listaactividad;
    }
    
   
    
    
    
    
    
}
