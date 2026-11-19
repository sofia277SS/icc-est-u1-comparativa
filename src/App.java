import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Generador generador = new Generador();
        Benchmark b = new Benchmark();
        int[] list = generador.generate(100);
        System.out.println("Lista generada: " + java.util.Arrays.toString(list));
        Results benGenList = b.medir(
            () -> generador.generate(100),
            "Generation de Listado",
            "100");
        System.out.println(benGenList);

        // Crear arreglos base
        System.out.println("---------------------------------");
        int[] list1 = generador.generate(10000);
        int[] list2 = generador.generate(50000);
        int[] list3 = generador.generate(100000);

        // Clonar los arreglos para cada metodo de ordenamiento
        int[] list1c1 = list1.clone();
        int[] list2c1 = list2.clone();
        int[] list3c1 = list3.clone();
        int[] list1c2 = list1.clone();
        int[] list2c2 = list2.clone();
        int[] list3c2 = list3.clone();
        int[] list1c3 = list1.clone();
        int[] list2c3 = list2.clone();
        int[] list3c3 = list3.clone();
        int[] list1c4 = list1.clone();
        int[] list2c4 = list2.clone();
        int[] list3c4 = list3.clone();

        // Llamar a la clase de los metodos de ordenamiento
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        //List<List<Integer>> listas = List.of(list1, list2, list3);
        //List<Integer> list2c1 = list2.copyOf(list2, list2.size());

        // Crear una lista para los resultados    
        List<Results> resultados = new ArrayList<>();
        
        // Results de Bubble Sort    
        Results resultaM1S1 = Benchmark.medir(
            () -> metodos.sortBubble(list1c1),
            "Metodo 1 - Sort Bubble",
            "10000");
        resultados.add(resultaM1S1);

        Results resultaM1S2 = Benchmark.medir(
            () -> metodos.sortBubble(list2c1),
            "Metodo 1 - Sort Bubble",
            "50000");
        resultados.add(resultaM1S2);
        
        Results resultaM1S3 = Benchmark.medir(
            () -> metodos.sortBubble(list3c1),
            "Metodo 1 - Sort Bubble",
            "100000");
        resultados.add(resultaM1S3);

        // Results de Quick Sort
        Results resultaM2S1 = Benchmark.medir(
            () -> metodos.quickSort(list1c2),
            "Metodo 2 - Quick Sort",
            "10000");
        resultados.add(resultaM2S1);
        
        Results resultaM2S2 = Benchmark.medir(
            () -> metodos.quickSort(list2c2),
            "Metodo 2 - Quick Sort",
            "50000");
        resultados.add(resultaM2S2);

        Results resultaM2S3 = Benchmark.medir(
            () -> metodos.quickSort(list3c2),
            "Metodo 2 - Quick Sort",
            "100000");
        resultados.add(resultaM2S3);

        // Results de Collections sin lambda
        Results resultaM3S1 = Benchmark.medir(
            () -> metodos.sortCollection(list1c3),
            "Metodo 3 - Collections",
            "10000");
        resultados.add(resultaM3S1);

        Results resultaM3S2 = Benchmark.medir(
            () -> metodos.sortCollection(list2c3),
            "Metodo 3 - Collections",
            "50000");
        resultados.add(resultaM3S2);

        Results resultaM3S3 = Benchmark.medir(
            () -> metodos.sortCollection(list3c3),
            "Metodo 3 - Collections",
            "100000");
        resultados.add(resultaM3S3);

                // Results de Collections.sort (Versión 1 - Orden natural)
        Results resultaM4S1 = Benchmark.medir(
            () -> metodos.sortCollection(list1c3),
            "Metodo 4 - Collections V2",
            "10000");
        resultados.add(resultaM4S1);

        Results resultaM4S2 = Benchmark.medir(
            () -> metodos.sortCollection(list2c3),
            "Metodo 4 - Collections V2",
            "50000");
        resultados.add(resultaM4S2);

        Results resultaM4S3 = Benchmark.medir(
            () -> metodos.sortCollection(list3c3),
            "Metodo 4 - Collections V2",
            "100000");
        resultados.add(resultaM4S3);

        for (Results resultado : resultados) {
            System.out.println(resultado);
        }

    }
}
