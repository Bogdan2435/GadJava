package lab1.challange4;

public class Challange4 {

    public static void remove_pos(int[] array, int pos){
        for(int i = pos; i < array.length - 1; i++)
            array[i] = array[i + 1];
    }

    public static int pair_if_3(int[] numbers){
        int c = 0;
        int n = numbers.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i; j < n - 1; j++){
                for(int k = j; k < n; k++)
                    if(numbers[i] + numbers[j] + numbers[k] == 0){
                        c += 1;
                        remove_pos(numbers, k);
                        n -= 1;
                        remove_pos(numbers, j);
                        n -= 1;
                        remove_pos(numbers, i);
                        n -= 1;
                        i = 0;
                        j = 0;
                    }
            }
        }
        return c;
    }
}
