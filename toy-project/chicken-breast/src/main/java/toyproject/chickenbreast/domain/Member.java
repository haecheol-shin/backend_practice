package toyproject.chickenbreast.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter @Setter
@Entity
public class Member {

    private Long id;
    private String name;

}
