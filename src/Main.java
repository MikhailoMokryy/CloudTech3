public class Main {

    public static void main(String[] args) {

        Runnable hello_world = () ->  System.out.printf("Hello %s!","world");
        hello_world.run();

    }


}
