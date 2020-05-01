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
@Table(name = "tipoproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproducto.findAll", query = "SELECT t FROM Tipoproducto t")
    , @NamedQuery(name = "Tipoproducto.findByIdTipoProducto", query = "SELECT t FROM Tipoproducto t WHERE t.idTipoProducto = :idTipoProducto")
    , @NamedQuery(name = "Tipoproducto.findByGenero", query = "SELECT t FROM Tipoproducto t WHERE t.genero = :genero")})
public class Tipoproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoProducto")
    private Integer idTipoProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Genero")
    private String genero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoProducto")
    private List<Productoentregado> productoentregadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoProducto")
    private List<Productosresibidos> productosresibidosList;

    public Tipoproducto() {
    }

    public Tipoproducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public Tipoproducto(Integer idTipoProducto, String genero) {
        this.idTipoProducto = idTipoProducto;
        this.genero = genero;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @XmlTransient
    public List<Productoentregado> getProductoentregadoList() {
        return productoentregadoList;
    }

    public void setProductoentregadoList(List<Productoentregado> productoentregadoList) {
        this.productoentregadoList = productoentregadoList;
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
        hash += (idTipoProducto != null ? idTipoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproducto)) {
            return false;
        }
        Tipoproducto other = (Tipoproducto) object;
        if ((this.idTipoProducto == null && other.idTipoProducto != null) || (this.idTipoProducto != null && !this.idTipoProducto.equals(other.idTipoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tipoproducto[ idTipoProducto=" + idTipoProducto + " ]";
    }
    
}
