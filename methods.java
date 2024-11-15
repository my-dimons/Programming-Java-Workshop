public class methods {
    public static void main(String[] args) {
        printHelloWorld(5, "test");
    }

    public static void printHelloWorld(int repetitions, String string_to_print) {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(string_to_print);
        }
    }
}
