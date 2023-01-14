package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.dao.UserDao;
import web.dao.UserDaoImpl;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public List<User> getUserList() {
        return dao.getUserList();
    }

    @Override
    public User getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        dao.deleteUser(id);
    }
}
