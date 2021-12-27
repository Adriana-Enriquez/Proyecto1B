import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class PruebaProyecto {

    @Test
    public void create_proyect_from_manejadorProyecto_when_agregarProyecto(){

        ManejadorProyecto manejador = new ManejadorProyecto();
        ArrayList<Proyecto> proyectos= manejador.getProyectos();
        String tema = "tema";

        assertNotNull(proyectos);
        assertTrue(proyectos.size() == 0);
        Proyecto proyecto1 = new Proyecto(tema);
        manejador.agregarProyecto(proyecto1);

        assertNotNull(proyectos);
        assertTrue(proyectos.size() == 1);

        assertTrue(proyectos.get(0).getTema().equals(tema));

    }

    @Test
    public void delete_proyect_from_manejadorProyecto_when_eliminarProyecto(){

        ManejadorProyecto manejador = new ManejadorProyecto();
        manejador.agregarProyecto( new Proyecto("tema"));
        assertEquals(manejador.getProyectos().size(), 1);

        Proyecto proyectoAEliminar =  manejador.getProyectos().get(0);
        Proyecto proyectoEliminado = manejador.eliminarProyecto(0);
        assertEquals(proyectoAEliminar, proyectoEliminado);

        assertEquals(manejador.getProyectos().size(), 0);

    }

}
