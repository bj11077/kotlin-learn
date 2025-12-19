package section04;

public class JavaPerson2 {

    private static final int MIN_AGE = 1;

    public static JavaPerson2 newBaby(String name){
        return new JavaPerson2(name, MIN_AGE);
    }

    private String name;

    private int age;


    public JavaPerson2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
