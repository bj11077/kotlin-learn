package section05;

public class JavaPerson3 {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public int nextYearAge(){
        System.out.println("나는 멤버");
        return age+1;
    }


    public JavaPerson3(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        byte $this$add$iv = 3;
        int other$iv = 4;
        int $i$f$add = $this$add$iv + other$iv;

    }
}
