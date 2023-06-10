package core.basesyntax.model.zoo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Cat extends Animal {

    private int numberOfLives;
    private String color;

}
