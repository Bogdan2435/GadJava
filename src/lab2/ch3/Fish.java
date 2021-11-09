package lab2.ch3;

public class Fish extends Animal implements Pet{

    public Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk.");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("Fish is playing.");
    }

}
