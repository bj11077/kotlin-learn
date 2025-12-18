package section03;

public final class JavaPenguin2 extends JavaAnimal implements JavaSwimable,JavaFlyable {

    private final int wingCount;


    public JavaPenguin2(String species) {
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

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
