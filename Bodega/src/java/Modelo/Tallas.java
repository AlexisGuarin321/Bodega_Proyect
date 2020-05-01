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
@Table(name = "tallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tallas.findAll", query = "SELECT t FROM Tallas t")
    , @NamedQuery(name = "Tallas.findByIdTalla", query = "SELECT t FROM Tallas t WHERE t.idTalla = :idTalla")
    , @NamedQuery(name = "Tallas.findByTipo", query = "SELECT t FROM Tallas t WHERE t.tipo = :tipo")})
public class Tallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTalla")
    private Integer idTalla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTalla")
    private List<Productosresibidos> productosresibidosList;

    public Tallas() {
    }

    public Tallas(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public Tallas(Integer idTalla, String tipo) {
        this.idTalla = idTalla;
        this.tipo = tipo;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash += (idTalla != null ? idTalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tallas)) {
            return false;
        }
        Tallas other = (Tallas) object;
        if ((this.idTalla == null && other.idTalla != null) || (this.idTalla != null && !this.idTalla.equals(other.idTalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tallas[ idTalla=" + idTalla + " ]";
    }
    
}
