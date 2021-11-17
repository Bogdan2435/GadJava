/*
package lab3.Project1_Pizza;


public class Pizza {
    private boolean onion;
    private boolean cheese;
    private boolean corn;
    private boolean olives;
    private boolean pineapple;
    private boolean mushroom;
    private boolean tomato;
    private String SauceType;
    private String size;

    public String toString(){
        return size + " pizza with " + SauceType + ".";
    }

    public static class Builder{
        private boolean onion;
        private boolean cheese;
        private boolean corn;
        private boolean olives;
        private boolean pineapple;
        private boolean mushroom;
        private boolean tomato;
        private String sauceType;
        private String size;

        public void setOnion(boolean onion) {
            this.onion = onion;
        }

        public void setCheese(boolean cheese) {
            this.cheese = cheese;
        }

        public void setCorn(boolean corn) {
            this.corn = corn;
        }

        public void setOlives(boolean olives) {
            this.olives = olives;
        }

        public void setPineapple(boolean pineapple) {
            this.pineapple = pineapple;
        }

        public void setMushroom(boolean mushroom) {
            this.mushroom = mushroom;
        }

        public void setTomato(boolean tomato) {
            this.tomato = tomato;
        }

        public void setSauceType(String sauceType) {
            sauceType = sauceType;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Pizza build(){
            Pizza toReturn = Pizza(this.size, this.sauceType);
            toReturn.onion = this.onion;
            toReturn.cheese = this.cheese;
            toReturn.corn = this.corn;
            toReturn.olives = this.olives;
            toReturn.mushroom = this.mushroom;
            toReturn.pineapple = this.pineapple;
            toReturn.tomato = this.tomato;

            return toReturn;
        }
    }
}
*/