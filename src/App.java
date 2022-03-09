

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int my_array[] = {1, 5, 6, 5, 4, 1};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}