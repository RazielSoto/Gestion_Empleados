import java.util.ArrayList;
import java.util.Collections;

public class Programadores extends Empleados implements MetodoActDiarias {
    private String herramientaDesarrollo;
    private ArrayList<String> actDiariasProgramador = new ArrayList<>();
    private Integer codProgramador;
    public Programadores(String nombre, String apellidos, Integer edad){
        super(nombre, apellidos, edad);
        setherramientaDesarrollo("Eclipse");
        setcodProgramador(9000);
        actDiariasProgramador.add("-Analisis de requerimientos");
        actDiariasProgramador.add("-Desarrollo de requerimientos");
        actDiariasProgramador.add("-Presentacion pruebas unitarias");
    }
    //public Programadores(String nombre, String apellidos,String tipo, Integer edad) {
    //    super(nombre, apellidos, edad, tipo);
    //}
    public void setherramientaDesarrollo(String herramienta){
        this.herramientaDesarrollo = herramienta;
    }
    public String getherramientaDesarrollo(){
        return this.herramientaDesarrollo;
    }
    public void setcodProgramador(Integer codigo){
        this.codProgramador = codigo;
    }
    public Integer getcodProgramador(){
        return codProgramador;
    }
    @Override
    public void obtenerActividades(){
        System.out.println("\nActividades diarias:");
        Collections.sort(actDiariasProgramador, Collections.reverseOrder());
        for(String otro:actDiariasProgramador){
            System.out.println(otro);
        }
    }
    public void act_Programadores(ArrayList<Empleados> lista_Empleados){
        System.out.println("Nombre: " +lista_Empleados.get(1).getnombre()+"\nApellidos: "+lista_Empleados.get(0).getapellidos()+"\nTipo: "+lista_Empleados.get(0).getTipo()+"\nEdad: "+lista_Empleados.get(0).getedad());
        System.out.println();
        System.out.println("Nombre: " +lista_Empleados.get(1).getnombre()+"\nApellidos: "+lista_Empleados.get(1).getapellidos()+"\nTipo: "+lista_Empleados.get(1).getTipo()+"\nEdad: "+lista_Empleados.get(1).getedad());
        System.out.println();
        System.out.println("Nombre: " +lista_Empleados.get(2).getnombre()+"\nApellidos: "+lista_Empleados.get(2).getapellidos()+"\nTipo:"+lista_Empleados.get(2).getTipo()+"\nEdad: "+lista_Empleados.get(2).getedad());

    }
    /*public String getactDiarias(){actDiarias.add
        ("-Analisis de requerimientos");
        actDiarias.add("-Desarrollo de requerimientos");
        actDiarias.add("-Presentacion pruebas unitarias");
        return actDiarias;
    }*/
    public void leeinfo() {
        System.out.println("Nombre: " + this.getnombre()+ "\nApellidos: " + this.getapellidos() 
        + "\nEdad: " + this.getedad() + "\nHerramienta de diseño: " + getherramientaDesarrollo() 
        + "\nCodigo Diseñador: " + getcodProgramador());
    }
    public void eliminarLetras(){
        String letra =String.join("/n" + actDiariasProgramador);
        String letra1 = letra.substring(1, 25);
        String letra2 = letra.substring(22, 30);
        String letra3 = letra.substring(38, 49);
        System.out.println(letra1 + "/n" + letra2 + "/n" + letra3 + "/n");
    }   
}