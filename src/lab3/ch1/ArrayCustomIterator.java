package lab3.ch1;

public class ArrayCustomIterator {
    private int[] arr;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    public boolean hasNext(){
        if(arr.length > 0)
            return true;
        else
            return false;
    }

    public int next(){
        int next = arr[0];
        int[] arr1 = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++)
            arr1[i - 1] = arr[i];
        arr = arr1;
        return next;
    }
}
