public class Main {
    public static void main(String[] args) throws Throwable {
        Personа person = new Personа("Maga");
        System.out.println("Создан объект: " + person.getName());

        person = null;
        System.gc();

        Thread.sleep(1000);
    }
}