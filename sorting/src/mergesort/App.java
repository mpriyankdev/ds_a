package mergesort;

public class App {

    public static void main(String[] args) {

        int []arr = {-10,20,10,1,5,4,3};

        MergeSort mSort = new MergeSort(arr);
        mSort.mergeSort(0 , arr.length-1);
        mSort.show();

    }
}
