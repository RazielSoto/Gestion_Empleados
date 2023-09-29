package com.example.demo;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;
//import.org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//ArrayList<Empleados> lista_Empleados = new ArrayList<>();
		/*Programadores programadores = new Programadores("RAZIEL", "SOTO HERNANDEZ", null, 21);
        System.out.println("<------------------------>");
        programadores.leeinfo();
        programadores.obtenerActividades();
        
        //programadores.eliminarLetras();
        System.out.println("<------------------------>");
        //Programadores programadores2 = new Programadores(null, null, null);
        //programadores2.eliminarLetras();
        Diseñadores diseñadores = new Diseñadores("Damaris", "Soto Jaime", 30);
        diseñadores.leeinfo();
        diseñadores.obtenerActividades();
        System.out.println("<------------------------>");
        */
        ArrayList<Empleados> lista_Empleados = new ArrayList<>();
		JSONArray lista
        lista_Empleados.add( new Empleados("Leonardo ", "Salgado Lara", "Programador", 20));
        lista_Empleados.add(new Empleados("Fabían ", "Martínez Salgado", "Programador", 30));
        lista_Empleados.add( new Empleados("Ernesto ", "Villa Martínez", "Programador", 40));
        lista_Empleados.add(new Empleados("Miranda ", "Sevilla Rico", "Diseñador", 20));
        lista_Empleados.add(new Empleados("Laura ", "Salinas Mora", "Diseñador", 25));
        lista_Empleados.add( new Empleados("Liliana ", "Lara García", "Diseñador", 30));
        lista_Empleados.add( new Empleados("Pedro ", "Camacho Linares", "Diseñador", 42));
        //Empleados e1 = new Empleados();
        //e1.alta_Empleado(lista_Empleados);
        //e1.menu(lista_Empleados);
        //Empleados.lista_Empleados();
        //Empleados.menu();
        //Empleados.alta_Empleado();
        JSONArray jsonArray = new JSONArray(lista_Empleados.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);
		//System.out.println(jsonObject);

	}

}
