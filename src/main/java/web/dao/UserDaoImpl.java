package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Repository
//@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUserList() {
        return entityManager.createQuery("select  u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);

    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);

    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));

    }
}
