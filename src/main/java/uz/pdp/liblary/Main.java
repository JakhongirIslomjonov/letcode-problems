package uz.pdp.liblary;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Welcome to Liblary");
        while (true) {
            display();
            switch (Input.inputInt("Chose: ")) {
                case 1 -> {
                    registerUser();
                }
                case 2 -> {
                    makeOrder();
                }
                case 3 -> {
                    report();
                }
            }
        }


    }

    private static void registerUser() {

    }

    private static void report() {

    }

    private static void makeOrder() {

    }

    private static void display() {
        System.out.println("""
                1-Make  order 
                2-reort korish
                
                """);
    }
}
