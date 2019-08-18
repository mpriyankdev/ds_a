package bubblesort;

public class BubbleSort {

    private Integer arr[];

    public BubbleSort(Integer arr[]){

        this.arr = arr;

    }

    public void sort(){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length -1 -i;j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr , j, j+1);
                }
                print();
            }
            System.out.println();

        }


    }

    private void swap(Integer arr[] , int i_index , int j_index ){
        int temp;
        temp = arr[i_index];
        arr[i_index] = arr[j_index];
        arr[j_index] = temp;
    }



    public void print(){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("] ");
    }


}
