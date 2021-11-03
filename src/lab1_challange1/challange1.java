package lab1_challange1;

public class challange1 {

    public static void Challange1(int number){
        for(int i = 1; i <= number; i++){
            if((i % 3 == 0) && (i % 5 == 0))
                System.out.print("FizzBuzz, ");
            else if (i % 3 == 0)
                System.out.print("Fizz, ");
            else if (i % 5 == 0)
                System.out.print("Buzz,");
            else if (i % 7 == 0)
                System.out.print("Rizz, ");
            else if (i % 11 == 0)
                System.out.print("Jazz, ");
            else
                System.out.print( i + ", ");
        }
    }
}
