/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexis-PC
 */
@Entity
@Table(name = "tallasHombreSuperior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasHombreSuperior.findAll", query = "SELECT t FROM TallasHombreSuperior t")
    , @NamedQuery(name = "TallasHombreSuperior.findByIdTallaHombreSuperior", query = "SELECT t FROM TallasHombreSuperior t WHERE t.idTallaHombreSuperior = :idTallaHombreSuperior")
    , @NamedQuery(name = "TallasHombreSuperior.findByTalla", query = "SELECT t FROM TallasHombreSuperior t WHERE t.talla = :talla")
    , @NamedQuery(name = "TallasHombreSuperior.findByContornoPecho", query = "SELECT t FROM TallasHombreSuperior t WHERE t.contornoPecho = :contornoPecho")
    , @NamedQuery(name = "TallasHombreSuperior.findByContornoCintura", query = "SELECT t FROM TallasHombreSuperior t WHERE t.contornoCintura = :contornoCintura")})
public class TallasHombreSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaHombreSuperior")
    private Integer idTallaHombreSuperior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "talla")
    private String talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoPecho")
    private int contornoPecho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoCintura")
    private int contornoCintura;

    public TallasHombreSuperior() {
    }

    public TallasHombreSuperior(Integer idTallaHombreSuperior) {
        this.idTallaHombreSuperior = idTallaHombreSuperior;
    }

    public TallasHombreSuperior(Integer idTallaHombreSuperior, String talla, int contornoPecho, int contornoCintura) {
        this.idTallaHombreSuperior = idTallaHombreSuperior;
        this.talla = talla;
        this.contornoPecho = contornoPecho;
        this.contornoCintura = contornoCintura;
    }

    public Integer getIdTallaHombreSuperior() {
        return idTallaHombreSuperior;
    }

    public void setIdTallaHombreSuperior(Integer idTallaHombreSuperior) {
        this.idTallaHombreSuperior = idTallaHombreSuperior;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getContornoPecho() {
        return contornoPecho;
    }

    public void setContornoPecho(int contornoPecho) {
        this.contornoPecho = contornoPecho;
    }

    public int getContornoCintura() {
        return contornoCintura;
    }

    public void setContornoCintura(int contornoCintura) {
        this.contornoCintura = contornoCintura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTallaHombreSuperior != null ? idTallaHombreSuperior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasHombreSuperior)) {
            return false;
        }
        TallasHombreSuperior other = (TallasHombreSuperior) object;
        if ((this.idTallaHombreSuperior == null && other.idTallaHombreSuperior != null) || (this.idTallaHombreSuperior != null && !this.idTallaHombreSuperior.equals(other.idTallaHombreSuperior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TallasHombreSuperior[ idTallaHombreSuperior=" + idTallaHombreSuperior + " ]";
    }
    
}
