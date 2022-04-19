package com.coord.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "block")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class Block extends EntityBase {
    
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "id_basin")
    @ManyToOne
    private Basin idBasin;
    @JoinColumn(name = "id_ead")
    @ManyToOne
    private Ead idEad;
    
}
