package lab1.challange3;

public class challange3 {
    public static int pair_of_2(int[] numbers){
        int c = 0; // variabila c este un contor cu ajutorul careia voi numara nr de perechi valide
        int n;
        n = numbers.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(numbers[i] + numbers[j] == 0){
                    c += 1;
                    for(int k = j; k < n - 1; k++)
                        numbers[k] = numbers[k + 1];
                    n = n - 1;
                    for(int k = i; k < n - 1; k++)
                        numbers[k] = numbers[k + 1];
                    n = n - 1;
                    i = 0;
                    j = 0;
                }
            }
        }
        return c;
    }
}
