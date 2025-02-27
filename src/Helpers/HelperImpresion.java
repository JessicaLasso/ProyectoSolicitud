/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import LogicaNegocio.Solicitud;
import java.util.ArrayList;

/**
 *
 * @author jessica andrea lasso
 */
public class HelperImpresion {
    
    public static void ImprimirInfo(ArrayList< Solicitud> listasolicitud) {

        for (int i = 0; i < listasolicitud.size(); i++) {
            System.out.println(" SOLICITUD " + (i + 1) + "\n");
            System.out.println("El NOMBRE DEL SOLICITANTE ES:" + "\t" + listasolicitud.get(i).getNombresolicitante());
            System.out.println(" LA CEDULA DEL SOLICITANTE ES:" + "\t" + listasolicitud.get(i).getCedula());
            System.out.println("El CODIGO DEL SOLICITANTE ES:" + "\t" + listasolicitud.get(i).getCodigo());
 
            System.out.println("\n");

            for (int j = 0; j < listasolicitud.get(i).getListaactividad().size(); j++) {
                System.out.println(" ACTIVIDAD" + (j + 1));
                System.out.println(" EL NOMBRE DE LA ACTIVIDAD ES :" + "\t" + listasolicitud.get(i).getListaactividad().get(j).getNombre());
                System.out.println(" EL ID DE LA ACTIVIDAD ES :" + "\t" + listasolicitud.get(i).getListaactividad().get(j).getId());
                System.out.println(" LA DESCRIPCION DE LA ACTIVIDAD ES:" + "\t" + listasolicitud.get(i).getListaactividad().get(j).getDescripcion());
               
                System.out.println("\n");
            }
        }

    }

    public static void BuscarPersona(String Id, ArrayList<Solicitud> lista) {
        int band = 0;
        for (int i = 0; i < lista.size(); i++) {
          if (Id.equals(lista.get(i).getCodigo())) {
                band = 1;
                System.out.println("EL NOMBRE DEL SOLICITANTE ES :" + "\t" + lista.get(i).getNombresolicitante());
                System.out.println("El NUMERO DE CEDULA DEL SOLICITANTE ES:" + "\t" + lista.get(i).getCedula());
                System.out.println("El CODIGO DEL SOLICITANTE ES :" + "\t" + lista.get(i).getCodigo());
             
                for (int j = 0; j < lista.get(i).getListaactividad().size(); j++) {
                    System.out.println(" EL NOMBRE DE LA ACTIVIDAD ES :" + "\t" + lista.get(i).getListaactividad().get(j).getNombre());
                    System.out.println(" EL ID DE LA ACTIVIDAD ES:" + "\t" + lista.get(i).getListaactividad().get(j).getId());
                    System.out.println(" LA DESCRIPCION DE LA ACTIVIDAD ES:" + "\t" + lista.get(i).getListaactividad().get(j).getDescripcion());
                    
                }
                
                
          }
                
            }
            if(band == 0){
                System.out.println(" CODIGO NO ENCONTRADO");
            }
        }
    }


    
    
    
    

