package com.beroglu.isuuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description",length = 100)
    private String description;


    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "details",length = 4000)
    private String details;

    @Column(name = "issueStatus")
    @Enumerated(EnumType.STRING)
    private  IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    //birden çok issue 1 tane user a atanabilir
    //optional = true->bu issue yu bir kullanıcıya atamasanda olur
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User assignee;

}
