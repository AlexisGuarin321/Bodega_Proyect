/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexis-PC
 */
@Entity
@Table(name = "clasificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasificacion.findAll", query = "SELECT c FROM Clasificacion c")
    , @NamedQuery(name = "Clasificacion.findByIdClasificacion", query = "SELECT c FROM Clasificacion c WHERE c.idClasificacion = :idClasificacion")
    , @NamedQuery(name = "Clasificacion.findByNit", query = "SELECT c FROM Clasificacion c WHERE c.nit = :nit")
    , @NamedQuery(name = "Clasificacion.findByRol", query = "SELECT c FROM Clasificacion c WHERE c.rol = :rol")})
public class Clasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClasificacion")
    private Integer idClasificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIT")
    private int nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "rol")
    private String rol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClasificacion")
    private List<Personas> personasList;

    public Clasificacion() {
    }

    public Clasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public Clasificacion(Integer idClasificacion, int nit, String rol) {
        this.idClasificacion = idClasificacion;
        this.nit = nit;
        this.rol = rol;
    }

    public Integer getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlTransient
    public List<Personas> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Personas> personasList) {
        this.personasList = personasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClasificacion != null ? idClasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacion)) {
            return false;
        }
        Clasificacion other = (Clasificacion) object;
        if ((this.idClasificacion == null && other.idClasificacion != null) || (this.idClasificacion != null && !this.idClasificacion.equals(other.idClasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Clasificacion[ idClasificacion=" + idClasificacion + " ]";
    }
    
}
