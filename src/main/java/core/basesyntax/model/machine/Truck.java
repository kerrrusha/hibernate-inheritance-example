package core.basesyntax.model.machine;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Truck extends Machine {

    private String color;
    private double maxAllowedWeight;

}
