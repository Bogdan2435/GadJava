package lab2.ch2;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[] {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[] {oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[] {oscar2018});

        Actor actorFaraPremii01 = new Actor("actor fara premii 01", 33, new Premiu[] {});
        Actor actorFaraPremii02 = new Actor("actor fara premii 02", 60, new Premiu[] {});
        Actor actorFaraPremii03 = new Actor("actor fara premii 03", 20, new Premiu[] {});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[] {actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[] {actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[] {actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar2", new Actor[] {actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actorii fara premii5", new Actor[] {actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[] {film1, film2});
        Studio studio2 = new Studio("Disney", new Film[] {film3, film4, film5});

        Studio[] studioDatabase = new Studio[] {studio1, studio2};

        // STAGE 3, EX 1
        System.out.print("Studiourile care au publicat mai mult de doua filme sunt: ");
        for(Studio i : studioDatabase){
            int c = 0;
            for(Film j : i.getFilme())
                c++;
            if(c > 2)
                System.out.print(i.getNume() + " ");
        }
        System.out.println();

        // STAGE 3, EX 2
        for(Studio i : studioDatabase)
            for(Film j : i.getFilme())
                for(Actor k : j.getActori())
                    if(k.getNume() == "actor cu 2 oscaruri")
                        System.out.println("Numele studioului la care joaca actorul cu doua oscaruri este: " + i.getNume() );

        // STAGE 3, EX 3
        System.out.print("Numele filmelor in care joaca actori mai in varsta de 50 de ani sunt: ");
        for(Studio i : studioDatabase)
            for(Film j : i.getFilme())
                for(Actor k : j.getActori())
                    if(k.getVarsta() > 50)
                        System.out.print(j.getNume() + " ");
        System.out.println();

    }
}
