import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MetodosOrdenamiento {
    
    public void sortBubble(int[] array) {
        for(int i = 0; i < array.length; i++){
            boolean swap = false;
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }


    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partición para QuickSort
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public void sortCollection(int[] array) {
        List<Integer> lista = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(lista);
    }

    public void sortCollectionsV2(int[] array) {
        List<Integer> lista = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(lista, (a, b) -> a.compareTo(b));
    }

}
