package quicksort;

//divide and conquer algo.
//avg case : O(nlogn) , worst : O(n*n)
//used for primitives in java
public class QuickSort {

    private int[] arr;
    public QuickSort(int arr[]){
        this.arr = arr;
    }

    private void swap(int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int low , int high){
        //this methd will return the final position of the pivot
        int pivot = (low+high)/2;

        int i = low;
        swap(pivot , high);

        for(int j=low;j<high;j++){
            if(arr[j]<=arr[high]){
                swap(i,j);
                i++;
            }
        }

        swap(i,high);

    return i;

    }

    private void quicksort(int low , int high){

        if(low>=high){
            //base condition
            return;
        }

        int pivot = partition(low , high);
        quicksort(low , pivot-1);
        quicksort(pivot+1 , high);

    }

    public void sort(){
        quicksort(0 , this.arr.length-1);
    }

    public void show(){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
