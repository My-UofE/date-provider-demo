import java.time.LocalDate;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("This is a demo of the DateProvider class");
        System.out.println("Use it by replacing LocalDate.now() with DateProvider.now()\n");

        System.out.println("Default behaviour");
        System.out.println("Result of DateProvider.now(): " + DateProvider.now());
        System.out.println("Result of LocalDate.now(): " + LocalDate.now());

        System.out.println("\nCalling DateProvider.addDay()");     
        DateProvider.addDay();
        System.out.println("Result of DateProvider.now(): " + DateProvider.now());
        System.out.println("Result of LocalDate.now(): " + LocalDate.now());
        
        System.out.println("\nCalling DateProvider.setOffset(7)");     
        DateProvider.setOffset(7);
        System.out.println("Result of DateProvider.now(): " + DateProvider.now());
        System.out.println("Result of LocalDate.now(): " + LocalDate.now());

    }
}
