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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexis-PC
 */
@Entity
@Table(name = "tallasNi\u00f1oSuperior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasNi\u00f1oSuperior.findAll", query = "SELECT t FROM TallasNi\u00f1oSuperior t")
    , @NamedQuery(name = "TallasNi\u00f1oSuperior.findByIdTallaNi\u00f1oSuperior", query = "SELECT t FROM TallasNi\u00f1oSuperior t WHERE t.idTallaNi\u00f1oSuperior = :idTallaNi\u00f1oSuperior")
    , @NamedQuery(name = "TallasNi\u00f1oSuperior.findByTalla", query = "SELECT t FROM TallasNi\u00f1oSuperior t WHERE t.talla = :talla")
    , @NamedQuery(name = "TallasNi\u00f1oSuperior.findByContornoPecho", query = "SELECT t FROM TallasNi\u00f1oSuperior t WHERE t.contornoPecho = :contornoPecho")
    , @NamedQuery(name = "TallasNi\u00f1oSuperior.findByContornoCintura", query = "SELECT t FROM TallasNi\u00f1oSuperior t WHERE t.contornoCintura = :contornoCintura")})
public class TallasNiñoSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaNi\u00f1oSuperior")
    private Integer idTallaNiñoSuperior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "talla")
    private int talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoPecho")
    private int contornoPecho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoCintura")
    private int contornoCintura;

    public TallasNiñoSuperior() {
    }

    public TallasNiñoSuperior(Integer idTallaNiñoSuperior) {
        this.idTallaNiñoSuperior = idTallaNiñoSuperior;
    }

    public TallasNiñoSuperior(Integer idTallaNiñoSuperior, int talla, int contornoPecho, int contornoCintura) {
        this.idTallaNiñoSuperior = idTallaNiñoSuperior;
        this.talla = talla;
        this.contornoPecho = contornoPecho;
        this.contornoCintura = contornoCintura;
    }

    public Integer getIdTallaNiñoSuperior() {
        return idTallaNiñoSuperior;
    }

    public void setIdTallaNiñoSuperior(Integer idTallaNiñoSuperior) {
        this.idTallaNiñoSuperior = idTallaNiñoSuperior;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
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
        hash += (idTallaNiñoSuperior != null ? idTallaNiñoSuperior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasNiñoSuperior)) {
            return false;
        }
        TallasNiñoSuperior other = (TallasNiñoSuperior) object;
        if ((this.idTallaNiñoSuperior == null && other.idTallaNiñoSuperior != null) || (this.idTallaNiñoSuperior != null && !this.idTallaNiñoSuperior.equals(other.idTallaNiñoSuperior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TallasNi\u00f1oSuperior[ idTallaNi\u00f1oSuperior=" + idTallaNiñoSuperior + " ]";
    }
    
}
