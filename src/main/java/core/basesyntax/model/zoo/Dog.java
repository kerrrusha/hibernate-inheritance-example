package core.basesyntax.model.zoo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Dog extends Animal {

    private int tailLength;
    private String owner;

}
