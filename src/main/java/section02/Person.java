package section02;

import org.jetbrains.annotations.Nullable;

public class Person {

    private  final String name;

    private  Long age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    /*
        예제용 person
         */
    @Nullable
    public String getName() {
        return name;
    }


    public Long getAge() {
        return age;
    }
}
