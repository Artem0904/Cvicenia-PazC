package sk.upjs.paz;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @org.junit.jupiter.api.Test
    void computGenderRatio() {
        UserService userService;
        userService = new UserService(List.of(
                new User(1L, "James", "Anderson", User.Gender.MALE,
                        LocalDate.of(2004, 3, 15), User.Role.STUDENT),

                new User(2L, "Emily", "Johnson", User.Gender.FEMALE,
                        LocalDate.of(2003, 7, 22), User.Role.STUDENT),

                new User(3L, "Michael", "Williams", User.Gender.MALE,
                        LocalDate.of(2005, 1, 10), User.Role.STUDENT),

                new User(4L, "Sophia", "Brown", User.Gender.FEMALE,
                        LocalDate.of(2004, 11, 5), User.Role.STUDENT),

                new User(5L, "Daniel", "Miller", User.Gender.MALE,
                        LocalDate.of(2003, 9, 18), User.Role.STUDENT),

                new User(6L, "Olivia", "Davis", User.Gender.FEMALE,
                        LocalDate.of(2005, 4, 27), User.Role.STUDENT),

                new User(7L, "William", "Wilson", User.Gender.MALE,
                        LocalDate.of(2004, 6, 12), User.Role.STUDENT),

                new User(8L, "Ava", "Moore", User.Gender.FEMALE,
                        LocalDate.of(2003, 12, 3), User.Role.STUDENT),

                new User(9L, "Benjamin", "Taylor", User.Gender.MALE,
                        LocalDate.of(2005, 2, 25), User.Role.STUDENT),

                new User(10L, "Isabella", "Anderson", User.Gender.FEMALE,
                        LocalDate.of(2004, 8, 30), User.Role.STUDENT)
        ));


        var got = userService.computGenderRatio();

        var delta = 0.000001;
        assertTrue(Math.abs(0.500000 - got.boys()) < delta);
        assertTrue(Math.abs(0.500000 - got.girls()) < delta);


    }


    @org.junit.jupiter.api.Test
    void computGenderRatio_Empty() {
        var userService = new UserService(List.of());

        var got = userService.computGenderRatio();

        assertEquals(0.0, got.boys());
        assertEquals(0.0, got.girls());
        assertEquals(0.0, got.unknown());
    }

}