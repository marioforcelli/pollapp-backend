package br.com.mario.reactpoll.dto;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="poll")
public class Poll implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_poll")
    @Id
    Integer id;
    String title;

    public Poll() {}

    public Poll(Integer id, String title) {
        this.id = id;
        this.title = title;
    }


}
