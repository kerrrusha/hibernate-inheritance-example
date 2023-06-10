package core.basesyntax.model.machine;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Car extends Machine {

    private int horsePower;
    private String model;

}
