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
@Table(name = "tallasNi\u00f1oInferior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasNi\u00f1oInferior.findAll", query = "SELECT t FROM TallasNi\u00f1oInferior t")
    , @NamedQuery(name = "TallasNi\u00f1oInferior.findByIdTallaNi\u00f1oInferior", query = "SELECT t FROM TallasNi\u00f1oInferior t WHERE t.idTallaNi\u00f1oInferior = :idTallaNi\u00f1oInferior")
    , @NamedQuery(name = "TallasNi\u00f1oInferior.findByTallaNumerica", query = "SELECT t FROM TallasNi\u00f1oInferior t WHERE t.tallaNumerica = :tallaNumerica")
    , @NamedQuery(name = "TallasNi\u00f1oInferior.findByContornoCintura", query = "SELECT t FROM TallasNi\u00f1oInferior t WHERE t.contornoCintura = :contornoCintura")
    , @NamedQuery(name = "TallasNi\u00f1oInferior.findByContornoCadera", query = "SELECT t FROM TallasNi\u00f1oInferior t WHERE t.contornoCadera = :contornoCadera")
    , @NamedQuery(name = "TallasNi\u00f1oInferior.findByMuslo", query = "SELECT t FROM TallasNi\u00f1oInferior t WHERE t.muslo = :muslo")})
public class TallasNiñoInferior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaNi\u00f1oInferior")
    private Integer idTallaNiñoInferior;
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

    public TallasNiñoInferior() {
    }

    public TallasNiñoInferior(Integer idTallaNiñoInferior) {
        this.idTallaNiñoInferior = idTallaNiñoInferior;
    }

    public TallasNiñoInferior(Integer idTallaNiñoInferior, int tallaNumerica, int contornoCintura, int contornoCadera, int muslo) {
        this.idTallaNiñoInferior = idTallaNiñoInferior;
        this.tallaNumerica = tallaNumerica;
        this.contornoCintura = contornoCintura;
        this.contornoCadera = contornoCadera;
        this.muslo = muslo;
    }

    public Integer getIdTallaNiñoInferior() {
        return idTallaNiñoInferior;
    }

    public void setIdTallaNiñoInferior(Integer idTallaNiñoInferior) {
        this.idTallaNiñoInferior = idTallaNiñoInferior;
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
        hash += (idTallaNiñoInferior != null ? idTallaNiñoInferior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasNiñoInferior)) {
            return false;
        }
        TallasNiñoInferior other = (TallasNiñoInferior) object;
        if ((this.idTallaNiñoInferior == null && other.idTallaNiñoInferior != null) || (this.idTallaNiñoInferior != null && !this.idTallaNiñoInferior.equals(other.idTallaNiñoInferior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TallasNi\u00f1oInferior[ idTallaNi\u00f1oInferior=" + idTallaNiñoInferior + " ]";
    }
    
}
