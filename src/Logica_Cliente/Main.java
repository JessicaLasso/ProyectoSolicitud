/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
import LogicaNegocio.Actividad;
import LogicaNegocio.Solicitud;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jessica andrea lasso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        String nombre, id, descripcion;
        String nombresolicitante, cedula, codigo;
        String codigo_abuscar;
        int opc, num_ac, rta, conteo;

        ArrayList< Actividad> listaactividadglobal = null;
        ArrayList< Solicitud> listasolicitud = new ArrayList<>();

        Actividad activi;
        Solicitud objSolicitud;

        do {
            System.out.println(" 1. REGISTAR SOLICITUDES");
            System.out.println(" 2. LISTAR SOLICITUDES ");
            System.out.println(" 3. BUSCAR SOLICITUDES");
            System.out.println(" 4. SALIR ");

            System.out.println("  DIGITE UNA OPCION");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    ArrayList< Actividad> listaactividadlocal = new ArrayList<>();
                    System.out.println(" DIGITE EL NUNMERO DE ACTIVIDADES ");
                    num_ac = scan.nextInt();

                    for (int i = 0; i < num_ac; i++) {

                    
                    scan.nextLine();

                    // validaciones actividades 
                    System.out.println("  DIGITE EL NOMBRE DE LA ACTIVIDAD ");
                    nombre = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(nombre);

                    while (rta > 0) {
                        System.out.println(" DIGITE EL NOMBRE DE LA ACTIVIDAD ");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                    }

                    conteo = HelperValidacion.ValidarTodo(nombre);

                    while (conteo != 0) {
                        System.out.println(" DIGITE EL NOMBRE DE LA ACTIVIDAD ");
                        nombre = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodo(nombre);

                    }

                    // ID
                    System.out.println("  DIGITE EL ID DE LA ACTIVIDAD ");
                    id = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(id);

                    while (rta > 0) {
                        System.out.println(" DIGITE EL ID DE LA ACTIVIDAD ");
                        id = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(id);

                    }

                    conteo = HelperValidacion.ValidarTodo(id);

                    while (conteo != 0) {
                        System.out.println("DIGITE EL ID DE LA ACTIVIDAD ");
                        id = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodo(id);

                    }
                    // DESCRIPCION
                    System.out.println(" DIGITE LA DESCRIPCION DE LA ACTIVIDAD ");
                    descripcion = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(descripcion);

                    while (rta > 0) {
                        System.out.println(" DIGITE LA DESCRIPCION DEL COMPUTADOR ");
                        descripcion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(descripcion);
                    }

                    conteo = HelperValidacion.ValidarTodo(descripcion);

                    while (conteo != 0) {
                        System.out.println(" DIGITE LA DESCRIPCION DE LA ACTIVIDAD ");
                        descripcion = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodo(descripcion);

                    }

                    activi = new Actividad(nombre, id, descripcion);
                    listaactividadlocal.add(activi);
            }
           // ArrayList<Actividad> listaactividadlocal = null;

            listaactividadglobal = listaactividadlocal;
            listaactividadlocal = null;

            //TO DO SOLICITUD 
            System.out.println(" DIGITE EL NOMBRE DEL SOLICITANTE ");
            nombresolicitante = scan.nextLine();

            rta = HelperValidacion.ValidarVacio(nombresolicitante);

            while (rta > 0) {
                System.out.println(" DIGITE EL NOMBRE DEL SOLICITANTE ");
                nombre = scan.nextLine();
                rta = HelperValidacion.ValidarVacio(nombresolicitante);
            }

            conteo = HelperValidacion.ValidarTodo(nombresolicitante);

            while (conteo != 0) {
                System.out.println("DIGITE EL NOMBRE DEL SOLICITANTE ");
                nombre = scan.nextLine();
                conteo = HelperValidacion.ValidarTodo(nombresolicitante);

            }

            System.out.println(" DIGITE LA CEDULA DEL SOLICITANTE ");
            cedula = scan.nextLine();

            rta = HelperValidacion.ValidarVacio(cedula);

            while (rta > 0) {
                System.out.println("DIGITE CEDULA DEL SOLICITANTE");
                cedula = scan.nextLine();
                rta = HelperValidacion.ValidarVacio(cedula);
            }

            conteo = HelperValidacion.ValidarTodoLetra(cedula);

            while (conteo != 0) {
                System.out.println("DIGITE CEDULA SOLICITANTE");
                cedula = scan.nextLine();
                conteo = HelperValidacion.ValidarTodoLetra(cedula);

            }

            System.out.println(" DIGITE EL CODIGO DEL SOLICITANTE");
            codigo = scan.nextLine();

            rta = HelperValidacion.ValidarVacio(codigo);

            while (rta > 0) {
                System.out.println("DIGITE EL CODIGO DEL SOLICITANTE");
                codigo = scan.nextLine();
                rta = HelperValidacion.ValidarVacio(codigo);
            }

            conteo = HelperValidacion.ValidarTodoLetra(codigo);

            while (conteo != 0) {
                System.out.println("DIGITE EL CODIGO DEL SOLICITANTE");
                cedula = scan.nextLine();
                conteo = HelperValidacion.ValidarTodoLetra(codigo);

            }

         
            rta = HelperValidacion.ValidarTodoSerial(codigo);

            objSolicitud = new Solicitud(nombresolicitante, cedula, codigo, listaactividadglobal);
            listasolicitud.add(objSolicitud);

            break;

          case 2:
                    
                 HelperImpresion.ImprimirInfo(listasolicitud);
                    
                  break;
              
            case 3:
                    scan.nextLine();
                    System.out.println(" DIGITE EL CODIGO A BUSCAR : ");
                    codigo_abuscar = scan.nextLine();
                    HelperImpresion.BuscarPersona( codigo_abuscar,listasolicitud );
                    break;
        
            case 4:
            break;
         }
        
    
    }
    while ( opc != 4);

    
    }

}
