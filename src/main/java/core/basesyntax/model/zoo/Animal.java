package core.basesyntax.model.zoo;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "animals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String name;

}
