package sk.upjs.paz;

import java.time.LocalDate;

public record User(Long id,
                   String name,
                   String surname,
                   Gender gender,
                   LocalDate birthdate,
                   Role role) {

    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }

    public enum Role {
        UNKNOWN,
        GUEST,
        STUDENT,
        TEACHER,
        ADMIN
    }
}
