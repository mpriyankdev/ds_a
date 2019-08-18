package bubblesort;

public class App {

    private static Integer arr[] = {-1,-10,5,4,3,2,1};

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
        //bubbleSort.print();
    }


}
