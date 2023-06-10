package core.basesyntax.model.figure;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Triangle extends Figure {

    private double area;

}
