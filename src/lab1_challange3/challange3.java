package lab1_challange3;

public class challange3 {
    public static int pair_of_2(int[] numbers){
        int c = 0; // variabila c este un contor cu ajutorul careia voi numara nr de perechi valide
        int n;
        n = numbers.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j <= n; j++){
                if(i + j == 0){
                    c += 1;
                    for(int k = j; k < --n; k++)
                        numbers[k] = numbers[k + 1];
                    for(int k = i; k < --n; k++)
                        numbers[k] = numbers[k + 1];
                    i = 0;
                    j = 0;
                }
            }
        }
        return c;
    }
}
