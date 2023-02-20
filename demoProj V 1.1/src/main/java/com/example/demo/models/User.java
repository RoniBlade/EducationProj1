package com.example.demo.models;

import lombok.*;
import org.hibernate.annotations.Check;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"courses"})
@ToString(exclude = {"courses"})
@Builder
@Entity
@Table(name = "student")
public class User {

    public enum State{
        NOT_CONFIRMED, CONFIRMED, DELETED
    }

    public enum Role{
        USER, ADMIN
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Check(constraints = "age >= 0 and age <= 120")
    private Integer age = 0;

    @Column(name = "is_worker")
    private Boolean isWorker;

    private Double average;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")})
    private Set<Course> courses;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @Enumerated(value = EnumType.STRING)
    private Role role;



}
