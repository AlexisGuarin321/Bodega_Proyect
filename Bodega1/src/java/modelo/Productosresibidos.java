/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexis-PC
 */
@Entity
@Table(name = "productosresibidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productosresibidos.findAll", query = "SELECT p FROM Productosresibidos p")
    , @NamedQuery(name = "Productosresibidos.findByIdProductoResibido", query = "SELECT p FROM Productosresibidos p WHERE p.idProductoResibido = :idProductoResibido")
    , @NamedQuery(name = "Productosresibidos.findByFechaResivido", query = "SELECT p FROM Productosresibidos p WHERE p.fechaResivido = :fechaResivido")
    , @NamedQuery(name = "Productosresibidos.findByRef", query = "SELECT p FROM Productosresibidos p WHERE p.ref = :ref")
    , @NamedQuery(name = "Productosresibidos.findByCantidad", query = "SELECT p FROM Productosresibidos p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Productosresibidos.findByValorUnidad", query = "SELECT p FROM Productosresibidos p WHERE p.valorUnidad = :valorUnidad")
    , @NamedQuery(name = "Productosresibidos.findByValorTotal", query = "SELECT p FROM Productosresibidos p WHERE p.valorTotal = :valorTotal")})
public class Productosresibidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoResibido")
    private Integer idProductoResibido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaResivido")
    @Temporal(TemporalType.DATE)
    private Date fechaResivido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "REF")
    private String ref;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorUnidad")
    private int valorUnidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotal")
    private int valorTotal;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "idProvedor", referencedColumnName = "idProvedor")
    @ManyToOne(optional = false)
    private Provedor idProvedor;
    @JoinColumn(name = "idTalla", referencedColumnName = "idTalla")
    @ManyToOne(optional = false)
    private Tallas idTalla;
    @JoinColumn(name = "idTipoProducto", referencedColumnName = "idTipoProducto")
    @ManyToOne(optional = false)
    private Tipoproducto idTipoProducto;

    public Productosresibidos() {
    }

    public Productosresibidos(Integer idProductoResibido) {
        this.idProductoResibido = idProductoResibido;
    }

    public Productosresibidos(Integer idProductoResibido, Date fechaResivido, String ref, int cantidad, int valorUnidad, int valorTotal) {
        this.idProductoResibido = idProductoResibido;
        this.fechaResivido = fechaResivido;
        this.ref = ref;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
        this.valorTotal = valorTotal;
    }

    public Integer getIdProductoResibido() {
        return idProductoResibido;
    }

    public void setIdProductoResibido(Integer idProductoResibido) {
        this.idProductoResibido = idProductoResibido;
    }

    public Date getFechaResivido() {
        return fechaResivido;
    }

    public void setFechaResivido(Date fechaResivido) {
        this.fechaResivido = fechaResivido;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Provedor getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Provedor idProvedor) {
        this.idProvedor = idProvedor;
    }

    public Tallas getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Tallas idTalla) {
        this.idTalla = idTalla;
    }

    public Tipoproducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Tipoproducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoResibido != null ? idProductoResibido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productosresibidos)) {
            return false;
        }
        Productosresibidos other = (Productosresibidos) object;
        if ((this.idProductoResibido == null && other.idProductoResibido != null) || (this.idProductoResibido != null && !this.idProductoResibido.equals(other.idProductoResibido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Productosresibidos[ idProductoResibido=" + idProductoResibido + " ]";
    }
    
}
