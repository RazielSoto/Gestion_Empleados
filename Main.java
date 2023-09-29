import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;

public class Main {
    public static void main(String[] args){

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
        
        ArrayList<Empleados> lista_Empleados = new ArrayList<>();
        lista_Empleados.add( new Empleados("Leonardo ", "Salgado Lara", "Programador", 20));
        lista_Empleados.add(new Empleados("Fabían ", "Martínez Salgado", "Programador", 30));
        lista_Empleados.add( new Empleados("Ernesto ", "Villa Martínez", "Programador", 40));
        lista_Empleados.add(new Empleados("Miranda ", "Sevilla Rico", "Diseñador", 20));
        lista_Empleados.add(new Empleados("Laura ", "Salinas Mora", "Diseñador", 25));
        lista_Empleados.add( new Empleados("Liliana ", "Lara García", "Diseñador", 30));
        lista_Empleados.add( new Empleados("Pedro ", "Camacho Linares", "Diseñador", 42));
        */
        ArrayList<Empleados> lista_Empleados = new ArrayList<>();

        //Empleados e1 = new Empleados();
        //e1.alta_Empleado(lista_Empleados);
        //e1.menu(lista_Empleados);
        //Empleados.lista_Empleados();
        //Empleados.menu();
        //Empleados.alta_Empleado();
        JSONArray jsonArray = new JSONArray(lista_Empleados.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);



    }
    
}
