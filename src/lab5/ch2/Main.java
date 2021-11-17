package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Boot boot1 = new Boot();
        Shoe boot2 = new Boot();
        Shoe running1 = new Running();
        Running running2 = new Running();

        Pair<Boot> pair1 = new Pair<>(boot1, boot2);

    }
}
