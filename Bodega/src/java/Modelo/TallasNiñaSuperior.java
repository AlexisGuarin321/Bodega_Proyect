/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
@Table(name = "tallasNi\u00f1aSuperior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasNi\u00f1aSuperior.findAll", query = "SELECT t FROM TallasNi\u00f1aSuperior t")
    , @NamedQuery(name = "TallasNi\u00f1aSuperior.findByIdTallaNi\u00f1aSuperior", query = "SELECT t FROM TallasNi\u00f1aSuperior t WHERE t.idTallaNi\u00f1aSuperior = :idTallaNi\u00f1aSuperior")
    , @NamedQuery(name = "TallasNi\u00f1aSuperior.findByTalla", query = "SELECT t FROM TallasNi\u00f1aSuperior t WHERE t.talla = :talla")
    , @NamedQuery(name = "TallasNi\u00f1aSuperior.findByContornoPecho", query = "SELECT t FROM TallasNi\u00f1aSuperior t WHERE t.contornoPecho = :contornoPecho")
    , @NamedQuery(name = "TallasNi\u00f1aSuperior.findByContornoCintura", query = "SELECT t FROM TallasNi\u00f1aSuperior t WHERE t.contornoCintura = :contornoCintura")})
public class TallasNiñaSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaNi\u00f1aSuperior")
    private Integer idTallaNiñaSuperior;
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

    public TallasNiñaSuperior() {
    }

    public TallasNiñaSuperior(Integer idTallaNiñaSuperior) {
        this.idTallaNiñaSuperior = idTallaNiñaSuperior;
    }

    public TallasNiñaSuperior(Integer idTallaNiñaSuperior, int talla, int contornoPecho, int contornoCintura) {
        this.idTallaNiñaSuperior = idTallaNiñaSuperior;
        this.talla = talla;
        this.contornoPecho = contornoPecho;
        this.contornoCintura = contornoCintura;
    }

    public Integer getIdTallaNiñaSuperior() {
        return idTallaNiñaSuperior;
    }

    public void setIdTallaNiñaSuperior(Integer idTallaNiñaSuperior) {
        this.idTallaNiñaSuperior = idTallaNiñaSuperior;
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
        hash += (idTallaNiñaSuperior != null ? idTallaNiñaSuperior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasNiñaSuperior)) {
            return false;
        }
        TallasNiñaSuperior other = (TallasNiñaSuperior) object;
        if ((this.idTallaNiñaSuperior == null && other.idTallaNiñaSuperior != null) || (this.idTallaNiñaSuperior != null && !this.idTallaNiñaSuperior.equals(other.idTallaNiñaSuperior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TallasNi\u00f1aSuperior[ idTallaNi\u00f1aSuperior=" + idTallaNiñaSuperior + " ]";
    }
    
}
