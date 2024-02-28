package uz.nt.todowithhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import uz.nt.todowithhibernate.entity.ToDoEntity;

import java.util.List;
import java.util.UUID;

@Repository
public class ToDoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(ToDoEntity toDo) {
        entityManager.persist(toDo);
    }

    public ToDoEntity findById(UUID id) {
        return entityManager.find(ToDoEntity.class, id);
    }

    public List<ToDoEntity> findUserToDoListById(UUID id) {
        return entityManager.createQuery("select t from to_do t where t.ownerId=:owner_id", ToDoEntity.class)
                .setParameter("owner_id", id)
                .getResultList();
    }

    @Transactional
    public ToDoEntity update(ToDoEntity toDo){
        return entityManager.merge(toDo);
    }

    @Transactional
    public int deleteById(UUID id){
        return entityManager.createQuery("delete from to_do t where t.id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
