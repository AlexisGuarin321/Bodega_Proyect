/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexis-PC
 */
@Entity
@Table(name = "provedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provedor.findAll", query = "SELECT p FROM Provedor p")
    , @NamedQuery(name = "Provedor.findByIdProvedor", query = "SELECT p FROM Provedor p WHERE p.idProvedor = :idProvedor")
    , @NamedQuery(name = "Provedor.findByNit", query = "SELECT p FROM Provedor p WHERE p.nit = :nit")})
public class Provedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProvedor")
    private Integer idProvedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIT")
    private int nit;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Personas idPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProvedor")
    private List<Productosresibidos> productosresibidosList;

    public Provedor() {
    }

    public Provedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public Provedor(Integer idProvedor, int nit) {
        this.idProvedor = idProvedor;
        this.nit = nit;
    }

    public Integer getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    @XmlTransient
    public List<Productosresibidos> getProductosresibidosList() {
        return productosresibidosList;
    }

    public void setProductosresibidosList(List<Productosresibidos> productosresibidosList) {
        this.productosresibidosList = productosresibidosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvedor != null ? idProvedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provedor)) {
            return false;
        }
        Provedor other = (Provedor) object;
        if ((this.idProvedor == null && other.idProvedor != null) || (this.idProvedor != null && !this.idProvedor.equals(other.idProvedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Provedor[ idProvedor=" + idProvedor + " ]";
    }
    
}
