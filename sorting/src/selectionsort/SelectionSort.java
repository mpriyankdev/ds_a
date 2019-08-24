package selectionsort;

/*
* faster for smaller sub-arrays
* TC : O(n*n)
* makes less writes to the memory ,
* */

public class SelectionSort {

    private Integer arr[];

    public SelectionSort(Integer arr[]){
        this.arr = arr;
    }

    public void sort(){

        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[j+1]){
                    index = j;
                }
            }
            if(index!=i){
                swap(arr ,  index , i);
            }

        }

    }

    private void swap(Integer arr[] , int i_index , int j_index ){
        int temp;
        temp = arr[i_index];
        arr[i_index] = arr[j_index];
        arr[j_index] = temp;
    }

    public void print(){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
