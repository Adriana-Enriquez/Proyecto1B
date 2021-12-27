import java.util.Scanner;

public class Menu {
    public static void menuPrincicpal() {
        ManejadorProyecto manejador = new ManejadorProyecto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Agregue un proyecto para empezar \nIngrese un tema para el proyecto: ");
        String tema = sc.next();
        manejador.agregarProyecto(new Proyecto(tema));
        System.out.println("Cantidad de proyectos: " + manejador.getProyectos().size());
        System.out.println("Eliminando proyecto....");
        manejador.eliminarProyecto(0);
        System.out.println("Cantidad de proyectos: " + manejador.getProyectos().size());

    }
}
