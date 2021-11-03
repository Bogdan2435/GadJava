package lab1_challange2;

public class challange2 {

    public static String compute(int number){
        String s = "";

        if(number % 3 == 0)
            s = s + "Foo";
        if(number % 5 == 0)
            s = s + "Bar";
        if(number % 7 == 0)
            s = s + "Qix";


        int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        // functia Integer.toString imi va stoca in vectorul de intregi "digits", cifrele variabilei intregi "number"

        for(int i : digits){
            if(i == 0)
                s = s + "*";
            if(i == 3)
                s = s + "Foo";
            if(i == 5)
                s = s + "Bar";
            if(i == 7)
                s = s + "Qix";
        }

        if(s == null || s.length() == 0) // verific daca numarul se divide cu 3,5 sau 7 / contine 3,5 sau 7
            s = s + number;

        return s;
    }

    public static String compute2(int number){
        String s = "";int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();

        for(int i : digits){
            if(i != 0){
                String aux;
                aux = Integer.toString(i);
                s = s + i;
            }

            else
                s = s + "*";
        }
        return s;
    }
}
