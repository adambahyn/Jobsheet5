import java.util.Scanner;

public class PemilihanHariDenganIf01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType;
        int dayName;

        System.out.print("Input day name: ");
        dayName = sc.nextInt();

        if (dayName >= 1 && dayName <= 5) {
            dayType = "weekday";
        } else if (dayName == 6 || dayName == 7) {
            dayType = "weekend";
        } else {
            dayType = "Invalid Number";
        }
        

        System.out.println(dayName + " is a " + dayType);
    }
}
