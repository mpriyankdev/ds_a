package selectionsort;

public class App {

    private static Integer arr[] = {-1,-10,5,4,3,2,1};

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.sort();
        selectionSort.print();



    }
}
