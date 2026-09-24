package sk.upjs.paz;

import java.util.List;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;
    }

    public GenderRatio computGenderRatio(){
        int boys = 0, girls = 0, unknown = 0;
        for(User user : database){
            switch (user.gender()) {
                case UNKNOWN:
                    unknown++;
                    break;
                case MALE:
                    boys++;
                    break;
                case FEMALE:
                    girls++;
                    break;
            }
        }
        double studentsCount = boys + girls + unknown;
        return new GenderRatio(boys/studentsCount, girls/studentsCount, unknown/studentsCount);
    }
}
