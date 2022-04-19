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
@Table(name = "coord")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class Coord extends EntityBase {
    
    @Column(name = "stn")
    private Integer stn;
    @Column(name = "lat")
    private String lat; 
    @Column(name = "lon")
    private String lon;
    @Column(name = "x")
    private Double x;
    @Column(name = "y")
    private Double y;
    @Column(name = "z")
    private Double z;
    @JoinColumn(name = "id_seismic2d")
    @ManyToOne
    private Seismic2d idSeismic2d;
    
}
