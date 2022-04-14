package com.coord.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "seismicProgram")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeismicProgram.findAll", query = "SELECT s FROM SeismicProgram s"),
    @NamedQuery(name = "SeismicProgram.findById", query = "SELECT s FROM SeismicProgram s WHERE s.id = :id"),
    @NamedQuery(name = "SeismicProgram.findByName", query = "SELECT s FROM SeismicProgram s WHERE s.name = :name")})

public class SeismicProgram implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @JoinColumn(name = "id_ead", referencedColumnName = "id")
    @ManyToOne
    private Ead idEad;
    
    @OneToMany(mappedBy = "idseismicProgram")
    private Collection<Seismic2d> seismic2dCollection;
    
    @OneToMany(mappedBy = "idseismicProgram")
    private Collection<Seismic3d> seismic3dCollection;

    public SeismicProgram() {
    }

    public SeismicProgram(Integer id) {
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

    public Ead getIdEad() {
        return idEad;
    }

    public void setIdEad(Ead idEad) {
        this.idEad = idEad;
    }

    @XmlTransient
    public Collection<Seismic2d> getSeismic2dCollection() {
        return seismic2dCollection;
    }

    public void setSeismic2dCollection(Collection<Seismic2d> seismic2dCollection) {
        this.seismic2dCollection = seismic2dCollection;
    }

    @XmlTransient
    public Collection<Seismic3d> getSeismic3dCollection() {
        return seismic3dCollection;
    }

    public void setSeismic3dCollection(Collection<Seismic3d> seismic3dCollection) {
        this.seismic3dCollection = seismic3dCollection;
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
        if (!(object instanceof SeismicProgram)) {
            return false;
        }
        SeismicProgram other = (SeismicProgram) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coord.model.SeismicProgram[ id=" + id + " ]";
    }
    
}
