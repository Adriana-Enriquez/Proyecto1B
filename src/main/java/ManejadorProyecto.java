import java.util.ArrayList;

public class ManejadorProyecto {
    private ArrayList<Proyecto> proyectos;

    public ManejadorProyecto() {
        this.proyectos = new ArrayList<>();
    }

    public ManejadorProyecto(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void agregarProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
    }

    public Proyecto eliminarProyecto(int indice){ return proyectos.remove(indice);}

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }
}
