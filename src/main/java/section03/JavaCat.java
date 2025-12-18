package section03;

public class JavaCat extends JavaAnimal{

    public JavaCat(String species, int legCount) {
        super(species, legCount);
    }

    @Override
    void move() {
        System.out.println("사뿐싸분");
    }
}
