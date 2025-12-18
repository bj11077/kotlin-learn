package section03;

public final class JavaPenguin extends JavaAnimal {

    private final int wingCount;


    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    void move() {
        System.out.println("팍팍");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }
}
