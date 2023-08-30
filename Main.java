import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        walk(n);
    }
    private static void walk(int steps){
        if(steps < 1) return;
        System.out.println("You have taken a step.");
        walk(steps - 1);
    }
}