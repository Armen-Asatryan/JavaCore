package homework.onlineshop.storage;

import homework.medicalCenter.model.Person;
import homework.onlineshop.model.User;

public class UserStorage {
    private User[]users= new User[10];
    private int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;

    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users= tmp;
    }
}
