import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {
    private String nombre;
    private String apellidos;
    private Integer edad; 
    private String tipo;
    //private String actDiarias;
    private Integer codEmpleado;
    ArrayList<Empleados> lista_Empleados = new ArrayList<>();
    boolean salir = false;

    public Empleados(){
    }
    public Empleados (String nombre, String apellidos, Integer edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Empleados(String nombre, String apellidos, String tipo, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.tipo = tipo;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getapellidos(){
        return apellidos;
    }
    public void setapellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public Integer getedad(){
        return edad;
    }
    public void setedad(Integer edad){
        this.edad = edad;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //public String getactDiarias(){
    //   return actDiarias;
    //}
    //public void setactDiarias(String actDiarias){
    //  this.actDiarias = actDiarias;
    //}
    public Integer getcodEmpleado(){
        return this.codEmpleado;
    }
    public void setcodEmpleado(Integer codigo){
        this.codEmpleado = codigo;
    }
    public  static void lista_Empleados( ){
        ArrayList<Empleados> lista_Empleados = new ArrayList<>();
        lista_Empleados.add(0, new Empleados("Leonardo ", "Salgado Lara", "Programador", 20));
        lista_Empleados.add(1, new Empleados("Fabían ", "Martínez Salgado", "Programador", 30));
        lista_Empleados.add(2, new Empleados("Ernesto ", "Villa Martínez", "Programador", 40));
        lista_Empleados.add(3, new Empleados("Miranda ", "Sevilla Rico", "Diseñador", 20));
        lista_Empleados.add(4, new Empleados("Laura ", "Salinas Mora", "Diseñador", 25));
        lista_Empleados.add(5, new Empleados("Liliana ", "Lara García", "Diseñador", 30));
        lista_Empleados.add(6, new Empleados("Pedro ", "Camacho Linares", "Diseñador", 42));
        System.out.println("---PROGRAMADORES---");
        System.out.println("Nombre: " +lista_Empleados.get(1).getnombre()+"\nApellidos: "+lista_Empleados.get(0).getapellidos()+"\nTipo: "+lista_Empleados.get(0).getTipo()+"\nEdad: "+lista_Empleados.get(0).getedad());
        System.out.println();
        System.out.println("Nombre: " +lista_Empleados.get(1).getnombre()+"\nApellidos: "+lista_Empleados.get(1).getapellidos()+"\nTipo: "+lista_Empleados.get(1).getTipo()+"\nEdad: "+lista_Empleados.get(1).getedad());
        System.out.println();
        System.out.println("Nombre: " +lista_Empleados.get(2).getnombre()+"\nApellidos: "+lista_Empleados.get(2).getapellidos()+"\nTipo:"+lista_Empleados.get(2).getTipo()+"\nEdad: "+lista_Empleados.get(2).getedad());
        System.out.println();
        System.out.println("---DISEÑADORES---");
        System.out.println("Nombre: "+lista_Empleados.get(3).getnombre()+"\nApellidos: "+lista_Empleados.get(3).getapellidos()+"\nTipo: "+lista_Empleados.get(3).getTipo()+"\nEdad: "+lista_Empleados.get(3).getedad());
        System.out.println();
        System.out.println("Nombre: "+lista_Empleados.get(4).getnombre()+"\nApellidos: "+lista_Empleados.get(4).getapellidos()+"\nTipo: "+lista_Empleados.get(4).getTipo()+"\nEdad: "+lista_Empleados.get(4).getedad());
        System.out.println();
        System.out.println("Nombre: "+lista_Empleados.get(5).getnombre()+"\nApellidos: "+lista_Empleados.get(5).getapellidos()+"\nTipo: "+lista_Empleados.get(5).getTipo()+"\nEdad: "+ lista_Empleados.get(5).getedad());
        System.out.println();
        System.out.println("Nombre: "+lista_Empleados.get(6).getnombre()+"\nApellidos: "+lista_Empleados.get(6).getapellidos()+"\nTipo: "+lista_Empleados.get(6).getTipo()+"\nEdad: "+lista_Empleados.get(6).getedad());
    }
    public  void alta_Empleado(        ArrayList<Empleados> lista_Empleados 
    ){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Para dar de alta al empleado define--");
        System.out.print("Define su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Define sus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Define su tipo: " );
        String tipo = sc.nextLine();
        System.out.print("Define su edad: ");
        Integer edad = sc.nextInt();
        lista_Empleados.add(new Empleados(nombre, apellidos, tipo, edad));
        //alta_Empleado(lista_Empleados);
        //sc.close();
        //menu();
    }
    public void eliminar_Empleado(int eliminar){
        System.out.println("Eliminar s/n ");

    }
    public void consultarProgramador(ArrayList<Empleados> lista_Empleados) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que programador quieres consultar?: ");
        int consultaProgramador = sc.nextInt();
        System.out.println(lista_Empleados.get(consultaProgramador));
    }

    public  void menu(    ArrayList<Empleados> lista_Empleados ){
        while(!salir){
            //Empleados empl1 = new Empleados();
            //PEmrogramadores pro1 = new Programadores();
        Scanner sc = new Scanner(System.in);
        System.out.println("--Define la opcion que gustes--");
        System.out.println("-----MENU-----"+"\n1°- Consulta empleados o solo uno"+"\n2°- Da de alta un nuevo empleado"+"\n3°- Eliminar empleados"+"\n4°- Visualiza el listado de actividades diarias por empleado"+"\n5°- Salir");

        int opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Escogiste la opcion 1");
                System.out.println("1°- Consulta general");
                System.out.println("2°- Consulta un empleado con su id");
                int num1 = sc.nextInt();
                //int num2 = sc.nextInt();
                if(num1==1){
                    lista_Empleados();  
                }
                if(num1 == 2){
                    System.out.println("Coloca el id del empleado que desees consultar ");
                    //op = sc.nextInt();
                    //if(lista_Empleados.get()==op){
                    //}
                }
            break;
            case 2:
                System.out.println("Para dar de alta se necesita: ");
                int empleado1=sc.nextInt();
                sc.nextLine();
                if(empleado1==1){
                    //pro1.consultarProgramador(lista_Empleados);
                    
                    alta_Empleado(lista_Empleados);

                }else if(empleado1 != 1){
                    System.out.println("NO VALIDA");

                }
                //alta_Empleado(lista_Empleados);
                //lista_Empleados.get(7);
                //lista_Empleados.add(new Empleados(nombre, apellidos, tipo, edad));
                //System.out.println("Nombre: "+getnombre() +"\nApellidos: "+getapellidos()+"\nTipo: "+getTipo()+"\nEdad: "+getedad());
                //lista_Empleados.add(7, new Empleados(nombre, apellidos, tipo, edad));
                //alta_Empleado(lista_Empleados);

                //System.out.println("Nombre: "+lista_Empleados.get(7).getnombre()+"\nApellidos: "+lista_Empleados.get(7).getapellidos()+"\nTipo: "+lista_Empleados.get(7).getTipo()+"\nEdad: "+lista_Empleados.get(7).getedad());
                //System.out.printlnlista_Empleados);
                //alta_Empleado(lista_Empleados);
                menu(lista_Empleados);
            break;
            case 3:
                System.out.println("Define el indice a borrar");
            break;
            case 4:
                System.out.println("Visualiza  actividades diarias por empleado ");
            break;
            case 5:
                System.out.println("Salir");
                
                salir=true;
            break;
            }
        }
    }
} 