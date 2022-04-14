package com.coord.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "ead")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ead.findAll", query = "SELECT e FROM Ead e"),
    @NamedQuery(name = "Ead.findById", query = "SELECT e FROM Ead e WHERE e.id = :id"),
    @NamedQuery(name = "Ead.findByName", query = "SELECT e FROM Ead e WHERE e.name = :name")})

public class Ead implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "idEad")
    private Collection<SeismicProgram> seismicProgramCollection;
    
    @OneToMany(mappedBy = "idEad")
    private Collection<Block> blockCollection;
    
    @OneToMany(mappedBy = "idEad")
    private Collection<Seismic3d> seismic3dCollection;

    public Ead() {
    }

    public Ead(Integer id) {
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

    @XmlTransient
    public Collection<SeismicProgram> getSeismicProgramCollection() {
        return seismicProgramCollection;
    }

    public void setSeismicProgramCollection(Collection<SeismicProgram> seismicProgramCollection) {
        this.seismicProgramCollection = seismicProgramCollection;
    }

    @XmlTransient
    public Collection<Block> getBlockCollection() {
        return blockCollection;
    }

    public void setBlockCollection(Collection<Block> blockCollection) {
        this.blockCollection = blockCollection;
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
        if (!(object instanceof Ead)) {
            return false;
        }
        Ead other = (Ead) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coord.model.Ead[ id=" + id + " ]";
    }
    
}
