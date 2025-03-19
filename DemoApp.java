import java.time.LocalDate;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("The date today is: " + DateProvider.now());
        DateProvider.setOffset(1);
        System.out.println("The date tomorrow is: " + DateProvider.now());
        DateProvider.addDay();
        System.out.println("The date the day after tomorrow is: " + DateProvider.now());

        System.out.println("LocalDate still says the day is: " + LocalDate.now());
    }
}
