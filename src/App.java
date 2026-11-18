import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("NanoTime: " + nanoTime);
        System.out.println("CurrentTimeMillis: " + currentTimeMillis);
    
        Runnable x = () -> {
            System.out.println("Ejecutando tarea 1");
            System.out.println("Ejecutando tarea 2");

        };
        System.out.println("Ejecucion de la funcion Runnable");
        x.run();*/

        Generador generador = new Generador();
        Benchmark b = new Benchmark();
        List<Integer> list = generador.generate(100);
        System.out.println("Lista generada: " + list);
        Results benGenList = b.medir(
            () -> generador.generate(100),
            "Generation de Listado",
            "100");
        System.out.println(benGenList);


    }
}
