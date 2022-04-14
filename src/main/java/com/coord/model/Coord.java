package com.coord.model;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "coord")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coord.findAll", query = "SELECT c FROM Coord c"),
    @NamedQuery(name = "Coord.findById", query = "SELECT c FROM Coord c WHERE c.id = :id"),
    @NamedQuery(name = "Coord.findByStn", query = "SELECT c FROM Coord c WHERE c.stn = :stn"),
    @NamedQuery(name = "Coord.findByLat", query = "SELECT c FROM Coord c WHERE c.lat = :lat"),
    @NamedQuery(name = "Coord.findByLon", query = "SELECT c FROM Coord c WHERE c.lon = :lon"),
    @NamedQuery(name = "Coord.findByX", query = "SELECT c FROM Coord c WHERE c.x = :x"),
    @NamedQuery(name = "Coord.findByY", query = "SELECT c FROM Coord c WHERE c.y = :y"),
    @NamedQuery(name = "Coord.findByZ", query = "SELECT c FROM Coord c WHERE c.z = :z")})

public class Coord implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "stn")
    private Integer stn;
    
    @Column(name = "lat")
    private String lat;
    
    @Column(name = "lon")
    private String lon;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "x")
    private Double x;
    
    @Column(name = "y")
    private Double y;
    
    @Column(name = "z")
    private Double z;
    
    @JoinColumn(name = "id_seismic2d", referencedColumnName = "id")
    @ManyToOne
    private Seismic2d idSeismic2d;

    public Coord() {
    }

    public Coord(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStn() {
        return stn;
    }

    public void setStn(Integer stn) {
        this.stn = stn;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Seismic2d getIdSeismic2d() {
        return idSeismic2d;
    }

    public void setIdSeismic2d(Seismic2d idSeismic2d) {
        this.idSeismic2d = idSeismic2d;
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
        if (!(object instanceof Coord)) {
            return false;
        }
        Coord other = (Coord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coord.model.Coord[ id=" + id + " ]";
    }
    
}
