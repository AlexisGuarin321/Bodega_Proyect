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
@Table(name = "tallasMujerSuperior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasMujerSuperior.findAll", query = "SELECT t FROM TallasMujerSuperior t")
    , @NamedQuery(name = "TallasMujerSuperior.findByIdTallaMujerSuperior", query = "SELECT t FROM TallasMujerSuperior t WHERE t.idTallaMujerSuperior = :idTallaMujerSuperior")
    , @NamedQuery(name = "TallasMujerSuperior.findByTalla", query = "SELECT t FROM TallasMujerSuperior t WHERE t.talla = :talla")
    , @NamedQuery(name = "TallasMujerSuperior.findByContornoPecho", query = "SELECT t FROM TallasMujerSuperior t WHERE t.contornoPecho = :contornoPecho")
    , @NamedQuery(name = "TallasMujerSuperior.findByContornoCintura", query = "SELECT t FROM TallasMujerSuperior t WHERE t.contornoCintura = :contornoCintura")})
public class TallasMujerSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaMujerSuperior")
    private Integer idTallaMujerSuperior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
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

    public TallasMujerSuperior() {
    }

    public TallasMujerSuperior(Integer idTallaMujerSuperior) {
        this.idTallaMujerSuperior = idTallaMujerSuperior;
    }

    public TallasMujerSuperior(Integer idTallaMujerSuperior, String talla, int contornoPecho, int contornoCintura) {
        this.idTallaMujerSuperior = idTallaMujerSuperior;
        this.talla = talla;
        this.contornoPecho = contornoPecho;
        this.contornoCintura = contornoCintura;
    }

    public Integer getIdTallaMujerSuperior() {
        return idTallaMujerSuperior;
    }

    public void setIdTallaMujerSuperior(Integer idTallaMujerSuperior) {
        this.idTallaMujerSuperior = idTallaMujerSuperior;
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
        hash += (idTallaMujerSuperior != null ? idTallaMujerSuperior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasMujerSuperior)) {
            return false;
        }
        TallasMujerSuperior other = (TallasMujerSuperior) object;
        if ((this.idTallaMujerSuperior == null && other.idTallaMujerSuperior != null) || (this.idTallaMujerSuperior != null && !this.idTallaMujerSuperior.equals(other.idTallaMujerSuperior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TallasMujerSuperior[ idTallaMujerSuperior=" + idTallaMujerSuperior + " ]";
    }
    
}
