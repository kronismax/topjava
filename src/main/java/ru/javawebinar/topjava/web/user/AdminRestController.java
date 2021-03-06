package ru.javawebinar.topjava.web.user;

import org.springframework.stereotype.Controller;

import java.util.List;

import ru.javawebinar.topjava.model.User;

/**
 * GKislin
 * 06.03.2015.
 */
@Controller
public class AdminRestController extends AbstractUserController {

    public List<User> getAll() {
        return super.getAll();
    }

    public User get(int id) {
        return super.get(id);
    }

    public User create(User user) {
        return super.create(user);
    }

    public void delete(int id) {
        super.delete(id);
    }

    public void update(User user, int id) {
        super.update(user, id);
    }

    public User getByMail(String email) {
        return super.getByMail(email);
    }
}
