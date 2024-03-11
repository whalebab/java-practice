package extends1.ex;

public class Movie extends Item {

    private String diretor;
    private String actor;

    public Movie(String name, int price, String diretor, String actor) {
        super(name, price);
        this.diretor = diretor;
        this.actor = actor;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + diretor + ", 배우:"+ actor);
    }
}
