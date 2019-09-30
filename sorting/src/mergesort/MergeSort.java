package mergesort;

public class MergeSort {

    private int[] arr;
    private int[] tempArr;
    public MergeSort(int arr[]){
        this.arr = arr;
        tempArr = new int[arr.length];
    }

    public void mergeSort(int low , int high){

        if(low>=high){
            return;
        }
        int middle = (low+high)/2;

        mergeSort(low , middle);
        mergeSort(middle+1 , high);
        merge(low , middle , high);

    }

    private void merge(int low , int middle , int high){

        for(int x =low;x<=high;x++)
            tempArr[x] = arr[x];


        int i = low;
        int j = middle + 1;
        int k = low;
        //logical separation of the array.Maintained by i and j pointers. k used for the final array.
        while((i<=middle) && (j<=high)){
            if(tempArr[i]<tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while (i<=middle){
            arr[k]=tempArr[i];
            k++;
            i++;
        }
        while (j<=high){
            arr[k] = tempArr[j];
            k++;
            j++;
        }

    }

    public void show(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
