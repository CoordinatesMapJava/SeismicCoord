package com.coord.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "seismic2d")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class Seismic2d extends EntityBase {

    @Column(name = "name")
    private String name;
    @Column(name = "acquisition_date")
    @Temporal(TemporalType.DATE)
    private Date acquisitionDate;
    
    @JoinColumn(name = "id_seismic_program")
    @ManyToOne
    private SeismicProgram idseismicProgram;
    
}
