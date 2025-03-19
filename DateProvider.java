import java.time.LocalDate;

/**
 * The DateProvider class can be used to facilitate system testing.
 * Instead of using LocalDate.now() directly, you can use DateProvider.now()
 * When testing use methods DateProvider.addDay() and DateProvider.setOffset() 
 * to manipulate the date.
 */

public class DateProvider {
    private static int offset = 0;
    public static void setOffset(int offset) {
        DateProvider.offset = offset;
    }
    public static void addDay() {
        DateProvider.offset++;
    }    
    public static LocalDate now() {
        return LocalDate.now().plusDays(offset);
    }
}