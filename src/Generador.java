import java.util.ArrayList;
import java.util.List;

public class Generador {
    //Generar listado de tamaño size
    //Con numeros del 0 al size
    public static List<Integer> generate(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            //Me da error de compilacion si pongo Math.random() porque devuelve un double y la lista es de Integer
            //Para solucionarlo casteo el resultado a int
            list.add((int) (Math.random() * size));
        }
        return list;
    }
}
