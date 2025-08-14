public class MethodChaining {
    public static void main(String[] args) {
        String info = new Person()
                .setName("Maga")
                .setAge(16)
                .getInfo();

        System.out.println(info);
    }
}

class Person {
    private String name;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getInfo() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}