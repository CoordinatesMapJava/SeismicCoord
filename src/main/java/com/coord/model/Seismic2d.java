package com.coord.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "seismic2d")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seismic2d.findAll", query = "SELECT s FROM Seismic2d s"),
    @NamedQuery(name = "Seismic2d.findById", query = "SELECT s FROM Seismic2d s WHERE s.id = :id"),
    @NamedQuery(name = "Seismic2d.findByName", query = "SELECT s FROM Seismic2d s WHERE s.name = :name"),
    @NamedQuery(name = "Seismic2d.findByAcquisitionDate", query = "SELECT s FROM Seismic2d s WHERE s.acquisitionDate = :acquisitionDate")})

public class Seismic2d implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "acquisitionDate")
    @Temporal(TemporalType.DATE)
    private Date acquisitionDate;
    
    @OneToMany(mappedBy = "idSeismic2d")
    private Collection<Coord> coordCollection;
    
    @JoinColumn(name = "id_seismicProgram", referencedColumnName = "id")
    @ManyToOne
    private SeismicProgram idseismicProgram;

    public Seismic2d() {
    }

    public Seismic2d(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    @XmlTransient
    public Collection<Coord> getCoordCollection() {
        return coordCollection;
    }

    public void setCoordCollection(Collection<Coord> coordCollection) {
        this.coordCollection = coordCollection;
    }

    public SeismicProgram getIdseismicProgram() {
        return idseismicProgram;
    }

    public void setIdseismicProgram(SeismicProgram idseismicProgram) {
        this.idseismicProgram = idseismicProgram;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seismic2d)) {
            return false;
        }
        Seismic2d other = (Seismic2d) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coord.model.Seismic2d[ id=" + id + " ]";
    }
    
}
