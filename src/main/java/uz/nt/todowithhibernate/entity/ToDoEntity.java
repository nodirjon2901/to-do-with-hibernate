package uz.nt.todowithhibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "to_do")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDoEntity extends BaseEntity {

    private String title;

    private String description;

    private UUID ownerId;

}
