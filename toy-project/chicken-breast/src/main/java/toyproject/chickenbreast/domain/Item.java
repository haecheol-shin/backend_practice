package toyproject.chickenbreast.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Item {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int carbohydrate;
    private int protein;
    private int fat;

}
