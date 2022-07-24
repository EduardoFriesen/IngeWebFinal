package ar.edu.iua;

import ar.edu.iua.Excepciones.modeloEx.BuscarPlanEx;
import ar.edu.iua.Excepciones.modeloEx.CrearPlanEx;
import ar.edu.iua.Excepciones.modeloEx.ModificarPlanEx;
import ar.edu.iua.Excepciones.web_services_ex.serverEx;
import ar.edu.iua.util.Ejecutador;

public class Main {

    public static void main(String[] args) throws CrearPlanEx, BuscarPlanEx, ModificarPlanEx, serverEx {
        System.out.println("Comienzo de main\n\n");

        Ejecutador ejecutador = new Ejecutador();
        ejecutador.ejecutar();
        
        System.out.println("\n\nFin de main");
    }

}