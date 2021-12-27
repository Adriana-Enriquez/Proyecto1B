import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManejadorProyecto manejador = new ManejadorProyecto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Agregue un proyecto para empezar \nIngrese un tema para el proyecto: ");
        String tema = sc.next();
        manejador.agregarProyecto(new Proyecto(tema));
        System.out.println("Cantidad de proyectos: " + manejador.getProyectos().size());
    }
}
