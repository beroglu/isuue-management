package com.beroglu.isuuemanagement.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "projectCode",unique = true,length = 100)
    private String projectCode;

    @Column(name = "projectName",length = 100)
    private String projectName;


    @JoinColumn(name="manager_user_id")
    @ManyToOne(optional = true,fetch =FetchType.LAZY)
    private User manager;

}

