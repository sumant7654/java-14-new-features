package dev.sumantakumar.switchcase;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchCaseEnhancement {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        var result = switch (dayOfWeek){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("Today is "+dayOfWeek+". Go to Office");
                yield dayOfWeek;
            }

            case SATURDAY, SUNDAY ->  "Today is "+dayOfWeek+". Enjoy the weekend";

            default -> {
                yield "Please check your day";
            }
        };
        System.out.println(result);
    }
}
