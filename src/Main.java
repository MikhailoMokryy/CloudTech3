public class Main {

    public static void main(String[] args) {


        Runnable hello_world = () ->  System.out.printf("Hello %s!","world by Mikhailo Mokryy");
        hello_world.run();

    }


}
