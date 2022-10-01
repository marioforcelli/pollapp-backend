package br.com.mario.reactpoll.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="questions")
public class Questions implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_question")
    @Id
    Integer id;

    @ManyToOne
    @JoinColumn(name="id_poll")
     Poll poll;

    @Column(name="num_votes", columnDefinition = "int default 0")
    Integer numOfVotes;


}
