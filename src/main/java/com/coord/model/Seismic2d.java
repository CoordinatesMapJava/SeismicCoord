package com.coord.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name = "seismic2d")

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor

public class Seismic2d {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date acquisitionDate;
    
    @ManyToOne
    @JoinColumn(name = "id_seismicProgram")
    private SeismicProgram id_seismicProgram;
    
}
