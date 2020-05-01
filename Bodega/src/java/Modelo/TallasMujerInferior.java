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
@Table(name = "tallasMujerInferior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasMujerInferior.findAll", query = "SELECT t FROM TallasMujerInferior t")
    , @NamedQuery(name = "TallasMujerInferior.findByIdTallaMujerInferior", query = "SELECT t FROM TallasMujerInferior t WHERE t.idTallaMujerInferior = :idTallaMujerInferior")
    , @NamedQuery(name = "TallasMujerInferior.findByTallaNumerica", query = "SELECT t FROM TallasMujerInferior t WHERE t.tallaNumerica = :tallaNumerica")
    , @NamedQuery(name = "TallasMujerInferior.findByContornoCintura", query = "SELECT t FROM TallasMujerInferior t WHERE t.contornoCintura = :contornoCintura")
    , @NamedQuery(name = "TallasMujerInferior.findByContornoCadera", query = "SELECT t FROM TallasMujerInferior t WHERE t.contornoCadera = :contornoCadera")
    , @NamedQuery(name = "TallasMujerInferior.findByMuslo", query = "SELECT t FROM TallasMujerInferior t WHERE t.muslo = :muslo")})
public class TallasMujerInferior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaMujerInferior")
    private Integer idTallaMujerInferior;
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
    @Column(name = "ContornoCadera")
    private int contornoCadera;
    @Basic(optional = false)
    @NotNull
    @Column(name = "muslo")
    private int muslo;

    public TallasMujerInferior() {
    }

    public TallasMujerInferior(Integer idTallaMujerInferior) {
        this.idTallaMujerInferior = idTallaMujerInferior;
    }

    public TallasMujerInferior(Integer idTallaMujerInferior, int tallaNumerica, int contornoCintura, int contornoCadera, int muslo) {
        this.idTallaMujerInferior = idTallaMujerInferior;
        this.tallaNumerica = tallaNumerica;
        this.contornoCintura = contornoCintura;
        this.contornoCadera = contornoCadera;
        this.muslo = muslo;
    }

    public Integer getIdTallaMujerInferior() {
        return idTallaMujerInferior;
    }

    public void setIdTallaMujerInferior(Integer idTallaMujerInferior) {
        this.idTallaMujerInferior = idTallaMujerInferior;
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
        hash += (idTallaMujerInferior != null ? idTallaMujerInferior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasMujerInferior)) {
            return false;
        }
        TallasMujerInferior other = (TallasMujerInferior) object;
        if ((this.idTallaMujerInferior == null && other.idTallaMujerInferior != null) || (this.idTallaMujerInferior != null && !this.idTallaMujerInferior.equals(other.idTallaMujerInferior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TallasMujerInferior[ idTallaMujerInferior=" + idTallaMujerInferior + " ]";
    }
    
}
