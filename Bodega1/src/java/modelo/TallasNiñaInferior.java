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
@Table(name = "tallasNi\u00f1aInferior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasNi\u00f1aInferior.findAll", query = "SELECT t FROM TallasNi\u00f1aInferior t")
    , @NamedQuery(name = "TallasNi\u00f1aInferior.findByIdTallaNi\u00f1aInferior", query = "SELECT t FROM TallasNi\u00f1aInferior t WHERE t.idTallaNi\u00f1aInferior = :idTallaNi\u00f1aInferior")
    , @NamedQuery(name = "TallasNi\u00f1aInferior.findByTallaNumerica", query = "SELECT t FROM TallasNi\u00f1aInferior t WHERE t.tallaNumerica = :tallaNumerica")
    , @NamedQuery(name = "TallasNi\u00f1aInferior.findByContornoCintura", query = "SELECT t FROM TallasNi\u00f1aInferior t WHERE t.contornoCintura = :contornoCintura")
    , @NamedQuery(name = "TallasNi\u00f1aInferior.findByContornoCadera", query = "SELECT t FROM TallasNi\u00f1aInferior t WHERE t.contornoCadera = :contornoCadera")
    , @NamedQuery(name = "TallasNi\u00f1aInferior.findByMuslo", query = "SELECT t FROM TallasNi\u00f1aInferior t WHERE t.muslo = :muslo")})
public class TallasNiñaInferior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaNi\u00f1aInferior")
    private Integer idTallaNiñaInferior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tallaNumerica")
    private int tallaNumerica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoCintura")
    private int contornoCintura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contornoCadera")
    private int contornoCadera;
    @Basic(optional = false)
    @NotNull
    @Column(name = "muslo")
    private int muslo;

    public TallasNiñaInferior() {
    }

    public TallasNiñaInferior(Integer idTallaNiñaInferior) {
        this.idTallaNiñaInferior = idTallaNiñaInferior;
    }

    public TallasNiñaInferior(Integer idTallaNiñaInferior, int tallaNumerica, int contornoCintura, int contornoCadera, int muslo) {
        this.idTallaNiñaInferior = idTallaNiñaInferior;
        this.tallaNumerica = tallaNumerica;
        this.contornoCintura = contornoCintura;
        this.contornoCadera = contornoCadera;
        this.muslo = muslo;
    }

    public Integer getIdTallaNiñaInferior() {
        return idTallaNiñaInferior;
    }

    public void setIdTallaNiñaInferior(Integer idTallaNiñaInferior) {
        this.idTallaNiñaInferior = idTallaNiñaInferior;
    }

    public int getTallaNumerica() {
        return tallaNumerica;
    }

    public void setTallaNumerica(int tallaNumerica) {
        this.tallaNumerica = tallaNumerica;
    }

    public int getContornoCintura() {
        return contornoCintura;
    }

    public void setContornoCintura(int contornoCintura) {
        this.contornoCintura = contornoCintura;
    }

    public int getContornoCadera() {
        return contornoCadera;
    }

    public void setContornoCadera(int contornoCadera) {
        this.contornoCadera = contornoCadera;
    }

    public int getMuslo() {
        return muslo;
    }

    public void setMuslo(int muslo) {
        this.muslo = muslo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTallaNiñaInferior != null ? idTallaNiñaInferior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasNiñaInferior)) {
            return false;
        }
        TallasNiñaInferior other = (TallasNiñaInferior) object;
        if ((this.idTallaNiñaInferior == null && other.idTallaNiñaInferior != null) || (this.idTallaNiñaInferior != null && !this.idTallaNiñaInferior.equals(other.idTallaNiñaInferior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TallasNi\u00f1aInferior[ idTallaNi\u00f1aInferior=" + idTallaNiñaInferior + " ]";
    }
    
}
