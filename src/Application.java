public class Application {
    public void start() {
        Animal animal1 = new Animal("Horsey the horising horse", 99);

        System.out.println(animal1);
    }
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }


}