import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    @Test
    void mediaCasoConjuntoVacio() {
        Collection<Float> datos = new LinkedList<>();
        assertEquals(0, Estadistica.media(datos));
    }

    @Test
    void mediaCasoConjuntoUnElemento() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        assertEquals(1, Estadistica.media(datos));
    }

    @Test
    void mediaCasoConjuntoSumaCero() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        datos.add(-1f);
        assertEquals(0, Estadistica.media(datos));
    }

    @Test
    void mediaCasoGenerico(){
        Collection<Float> datos = new LinkedList<>();
        for (float i = 0; i<10; i++) datos.add(i);
        assertEquals( 4.5f,Estadistica.media(datos));
    }


    @Test
    void varianzaCasoConjuntoVacio() {
        Collection<Float> datos = new LinkedList<>();
        assertEquals(0, Estadistica.varianza(datos));
    }

    @Test
    void varianzaCasoConjuntoUnElemento() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        assertEquals(0, Estadistica.varianza(datos));
    }

    @Test
    void varianzaCasoConjuntoSumaCero() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        datos.add(-1f);
        assertEquals(1, Estadistica.varianza(datos));
    }

    @Test
    void varianzaCasoGenerico(){
        Collection<Float> datos = new LinkedList<>();
        for (float i = 0; i<10; i++) datos.add(i);
        assertEquals( 8.25f,Estadistica.varianza(datos)); /* CALCULAR */
    }

    @Test
    void desvestCasoConjuntoVacio() {
        Collection<Float> datos = new LinkedList<>();
        assertEquals(0, Estadistica.desviacionEstandar(datos));
    }

    @Test
    void desvestCasoConjuntoUnElemento() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        assertEquals(0, Estadistica.desviacionEstandar(datos));
    }

    @Test
    void desvestCasoConjuntoSumaCero() {
        Collection<Float> datos = new LinkedList<>();
        datos.add(1f);
        datos.add(-1f);
        assertEquals(1, Estadistica.desviacionEstandar(datos));
    }

    @Test
    void desvestCasoGenerico(){
        Collection<Float> datos = new LinkedList<>();
        for (float i = 0; i<10; i++) datos.add(i);
        assertEquals( 2.8722813233,Estadistica.desviacionEstandar(datos), 0.00001);
    }


}