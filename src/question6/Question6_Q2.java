package question6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question6_Q2 {
    public static void main(String[] args) {
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZoneId zoneId1 = ZoneId.of("Asia/Singapore");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateAndTime, zoneId1);
        System.out.println("Date and time in Singapore: "+zonedDateTime1);
        ZoneId zoneId2 = ZoneId.of("Europe/Berlin");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateAndTime, zoneId2);
        System.out.println("Date and time in Berlin: "+zonedDateTime2);
        ZoneId zoneId3 = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(localDateAndTime, zoneId3);
        System.out.println("Date and time in Paris: "+zonedDateTime3);
    }
}
