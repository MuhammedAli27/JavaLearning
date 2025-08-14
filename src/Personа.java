public class Personа {
    private String name;

    public Personа(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект  удален: " + name);
        super.finalize();
    }
}