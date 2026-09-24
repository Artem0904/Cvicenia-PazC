package sk.upjs.paz;

import java.time.*;
import java.util.List;

public record Attendance(Long id,
                         LocalDate date,
                         Subject subject,
                         List<User> students) {

    public static void main(String[] args) {

        // Date
        System.out.println("LocalDate " + LocalDate.now());
        // Date + time
        System.out.println("\nLocalDateTime: " + LocalDateTime.now());
        System.out.println("Instant: " + Instant.now());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now());
        System.out.println("OffsetDateTime: " + OffsetDateTime.now());
        // Time
        System.out.println("\nLocalTime " + LocalTime.now());
    }
}