package lab1.challange2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String s;
        s = "";
        s = s + challange2.compute(number);
        if(s == null || s.length() == 0){
            // daca numarul nu se divide cu 3,5 sau 7 si nici nu contine 3, 5 sau 7 atunci in valoarea pe care o returnam trebuie sa inlocuim cifra 0 cu *
            s = s + challange2.compute2(number);
        }
        System.out.println(s);
    }
}
