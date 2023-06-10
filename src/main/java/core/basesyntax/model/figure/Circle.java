package core.basesyntax.model.figure;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Circle extends Figure {

    private int radius;

}
