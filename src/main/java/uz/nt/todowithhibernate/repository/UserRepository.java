package uz.nt.todowithhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import uz.nt.todowithhibernate.entity.UserEntity;
import uz.nt.todowithhibernate.exception.AlreadyExistsException;

import java.util.UUID;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(UserEntity user) {
        entityManager.persist(user);
    }

    public UserEntity findById(UUID id) {
        return entityManager.find(UserEntity.class, id);
    }

    public UserEntity findByUsername(String username) {
        try {
            return entityManager
                    .createQuery("select u from users u where username=:username", UserEntity.class)
                    .setParameter("username", username)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
