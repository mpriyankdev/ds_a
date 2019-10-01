package quicksort;

public class App {

    public static void main(String[] args) {
        int arr[] = {10,-20,3,4,7,1,2,12};

        QuickSort quickSort = new QuickSort(arr);
        quickSort.show();
        System.out.println();
        quickSort.sort();
        quickSort.show();

    }
}
