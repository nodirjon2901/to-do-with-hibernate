package uz.nt.todowithhibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.nt.todowithhibernate.entity.ToDoEntity;
import uz.nt.todowithhibernate.service.ToDoService;

import java.util.UUID;

@Controller
@RequestMapping("/to-do")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    private UUID currentUserId;

    @GetMapping("/list/{ownerId}")
    public String toDoList(
            @PathVariable UUID ownerId,
            Model model
    ) {
        currentUserId = ownerId;
        model.addAttribute("toDos", toDoService.getUserToDoList(currentUserId));
        model.addAttribute("ownerId", currentUserId);
        return "to-do";
    }

    @PostMapping("/add")
    public String createToDo(
            @ModelAttribute ToDoEntity toDo,
            Model model) {
        toDoService.save(toDo);
        model.addAttribute("toDos", toDoService.getUserToDoList(currentUserId));
        model.addAttribute("ownerId", currentUserId);
        return "to-do";
    }

    @PostMapping("/delete/{toDoId}")
    public String delete(
            @PathVariable UUID toDoId,
            Model model
    ) {
        toDoService.deleteById(toDoId);
        model.addAttribute("toDos", toDoService.getUserToDoList(currentUserId));
        model.addAttribute("ownerId", currentUserId);
        return "to-do";
    }

    @PostMapping("/update")
    public String update(
            @ModelAttribute ToDoEntity toDo,
            Model model
    ) {
        System.out.println(toDo);
        toDoService.update(toDo);
        model.addAttribute("toDos", toDoService.getUserToDoList(currentUserId));
        model.addAttribute("ownerId", currentUserId);
        return "to-do";
    }

}
