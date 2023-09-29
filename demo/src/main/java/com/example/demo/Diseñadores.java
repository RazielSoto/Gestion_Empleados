package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Diseñadores extends Empleados implements MetodoActDiarias {
    private String herramientaDeDiseño;
    private ArrayList<String>actDiariasDeEmpleado = new ArrayList<>();
    private Integer codDiseñador;

    public  Diseñadores(String nombre, String apellidos, Integer edad){
        super(nombre, apellidos, edad);
        setcodDiseñador(8000);
        setHerramientaDeDiseño("Photoshop");
        actDiariasDeEmpleado.add("-Reuniones de avance");
        actDiariasDeEmpleado.add("-Precaucion ajustes de diseño");
        actDiariasDeEmpleado.add("-Elaboracion de diseño para paginas web");
        if(edad <=25){
            actDiariasDeEmpleado.add("Revison de diseñador SR");
        }else{
            actDiariasDeEmpleado.add("Apoyo a diseñador JR");
        }
    }
    public String getherramientaDeDiseño(){
        return herramientaDeDiseño;
    }
    public Integer getcodDiseñador(){
        return codDiseñador;
    }
    public void setHerramientaDeDiseño(String herramientaDeDiseño){
        this.herramientaDeDiseño = herramientaDeDiseño;
    }
    public void setcodDiseñador(Integer codDiseñador){
        this.codDiseñador = codDiseñador;
    }
    @Override
    public void obtenerActividades(){
        System.out.println("\nActividades diarias:");
        Collections.sort(actDiariasDeEmpleado);
        for(String abc:actDiariasDeEmpleado){
            System.out.println(abc);
        }
    }
    public void leeinfo() {
        System.out.println("Nombre: " + this.getnombre()+ "\nApellidos: " + this.getapellidos() 
        + "\nEdad: " + this.getedad() + "\nHerramienta de diseño: " + getherramientaDeDiseño() 
        + "\nCodigo Diseñador: " + getcodDiseñador());
    }
        
        //for(int i=0; i < programador.length; i++){
        //    System.out.println("INDICE: "+ i +" "+ programador[i]);
    }