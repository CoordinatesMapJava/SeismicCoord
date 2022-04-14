package com.coord.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name = "bloc")

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor

public class Bloc {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "id_basin")
    private Basin id_basin;
    
    @ManyToOne
    @JoinColumn(name = "id_ead")
    private Ead id_ead;
    
}
