package uz.nt.todowithhibernate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.nt.todowithhibernate.entity.ToDoEntity;
import uz.nt.todowithhibernate.repository.ToDoRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public void save(ToDoEntity toDo) {
        toDoRepository.save(toDo);
    }

    public List<ToDoEntity> getUserToDoList(UUID userId) {
        return toDoRepository.findUserToDoListById(userId);
    }

    public int deleteById(UUID id) {
        return toDoRepository.deleteById(id);
    }

    public void update(ToDoEntity toDo) {
       toDoRepository.update(toDo);
    }

}
