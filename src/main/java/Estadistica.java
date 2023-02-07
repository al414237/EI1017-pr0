import java.util.Collection;
import java.util.Set;

public final class Estadistica {
    public static float media(Collection<Float> datos){
        if (datos.isEmpty()) return 0;
        int n = datos.size();
        float sumatorio = 0;

        for (float xi: datos){
            sumatorio += xi;
        }

        return sumatorio/n;
    }

    public static float varianza(Collection<Float> datos){
        if (datos.isEmpty()) return 0;
        int n = datos.size();
        float sumatorio = 0;
        float media = media(datos);

        for (float xi: datos){
            sumatorio += Math.pow(xi - media, 2);
        }

        return sumatorio/n;
    }

    public static float desviacionEstandar(Collection<Float> datos){
        return (float) Math.sqrt(varianza(datos));
    }

}
