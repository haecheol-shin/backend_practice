package toyproject.chickenbreast.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Post {

    @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
}
