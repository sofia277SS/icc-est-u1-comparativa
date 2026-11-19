import java.util.ArrayList;
import java.util.List;

public class Generador {
    //Generar listado de tamaño size
    //Con numeros del 0 al size
    public static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            //Me da error de compilacion si pongo Math.random() porque devuelve un double y la lista es de Integer
            //Para solucionarlo casteo el resultado a int
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }
}
