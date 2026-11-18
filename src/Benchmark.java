public class Benchmark {
    
    public static Results medir(Runnable accion, String nombre, String sample) {
        // System.out.println("Function: " + nombre);
        // Tiempo actual
        long tA = System.nanoTime();
        // accion
        accion.run();
        // Tiempo final
        long tF = System.nanoTime();

        Results results = new Results(nombre, (tF - tA), sample);
        // retornar el tiempo de duracion
        return results;
    }
}
