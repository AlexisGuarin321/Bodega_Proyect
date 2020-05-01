/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
@Table(name = "productoentregado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productoentregado.findAll", query = "SELECT p FROM Productoentregado p")
    , @NamedQuery(name = "Productoentregado.findByIdProductoEntregado", query = "SELECT p FROM Productoentregado p WHERE p.idProductoEntregado = :idProductoEntregado")
    , @NamedQuery(name = "Productoentregado.findByFechaEntrega", query = "SELECT p FROM Productoentregado p WHERE p.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Productoentregado.findByRef", query = "SELECT p FROM Productoentregado p WHERE p.ref = :ref")
    , @NamedQuery(name = "Productoentregado.findByCantidad", query = "SELECT p FROM Productoentregado p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Productoentregado.findByIva", query = "SELECT p FROM Productoentregado p WHERE p.iva = :iva")
    , @NamedQuery(name = "Productoentregado.findByValorSubtotal", query = "SELECT p FROM Productoentregado p WHERE p.valorSubtotal = :valorSubtotal")
    , @NamedQuery(name = "Productoentregado.findByValorTotal", query = "SELECT p FROM Productoentregado p WHERE p.valorTotal = :valorTotal")})
public class Productoentregado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoEntregado")
    private Integer idProductoEntregado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEntrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
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
    @Column(name = "IVA")
    private float iva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorSubtotal")
    private int valorSubtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotal")
    private int valorTotal;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "idTipoProducto", referencedColumnName = "idTipoProducto")
    @ManyToOne(optional = false)
    private Tipoproducto idTipoProducto;

    public Productoentregado() {
    }

    public Productoentregado(Integer idProductoEntregado) {
        this.idProductoEntregado = idProductoEntregado;
    }

    public Productoentregado(Integer idProductoEntregado, Date fechaEntrega, String ref, int cantidad, float iva, int valorSubtotal, int valorTotal) {
        this.idProductoEntregado = idProductoEntregado;
        this.fechaEntrega = fechaEntrega;
        this.ref = ref;
        this.cantidad = cantidad;
        this.iva = iva;
        this.valorSubtotal = valorSubtotal;
        this.valorTotal = valorTotal;
    }

    public Integer getIdProductoEntregado() {
        return idProductoEntregado;
    }

    public void setIdProductoEntregado(Integer idProductoEntregado) {
        this.idProductoEntregado = idProductoEntregado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
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

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getValorSubtotal() {
        return valorSubtotal;
    }

    public void setValorSubtotal(int valorSubtotal) {
        this.valorSubtotal = valorSubtotal;
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

    public Tipoproducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Tipoproducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoEntregado != null ? idProductoEntregado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productoentregado)) {
            return false;
        }
        Productoentregado other = (Productoentregado) object;
        if ((this.idProductoEntregado == null && other.idProductoEntregado != null) || (this.idProductoEntregado != null && !this.idProductoEntregado.equals(other.idProductoEntregado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Productoentregado[ idProductoEntregado=" + idProductoEntregado + " ]";
    }
    
}
