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
@Table(name = "tallasHombreInferior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TallasHombreInferior.findAll", query = "SELECT t FROM TallasHombreInferior t")
    , @NamedQuery(name = "TallasHombreInferior.findByIdTallaHombreInferior", query = "SELECT t FROM TallasHombreInferior t WHERE t.idTallaHombreInferior = :idTallaHombreInferior")
    , @NamedQuery(name = "TallasHombreInferior.findByTallaNumerica", query = "SELECT t FROM TallasHombreInferior t WHERE t.tallaNumerica = :tallaNumerica")
    , @NamedQuery(name = "TallasHombreInferior.findByContornoCintura", query = "SELECT t FROM TallasHombreInferior t WHERE t.contornoCintura = :contornoCintura")
    , @NamedQuery(name = "TallasHombreInferior.findByContornoCadera", query = "SELECT t FROM TallasHombreInferior t WHERE t.contornoCadera = :contornoCadera")
    , @NamedQuery(name = "TallasHombreInferior.findByMuslo", query = "SELECT t FROM TallasHombreInferior t WHERE t.muslo = :muslo")
    , @NamedQuery(name = "TallasHombreInferior.findByIdTalla", query = "SELECT t FROM TallasHombreInferior t WHERE t.idTalla = :idTalla")})
public class TallasHombreInferior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTallaHombreInferior")
    private Integer idTallaHombreInferior;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTalla")
    private int idTalla;

    public TallasHombreInferior() {
    }

    public TallasHombreInferior(Integer idTallaHombreInferior) {
        this.idTallaHombreInferior = idTallaHombreInferior;
    }

    public TallasHombreInferior(Integer idTallaHombreInferior, int tallaNumerica, int contornoCintura, int contornoCadera, int muslo, int idTalla) {
        this.idTallaHombreInferior = idTallaHombreInferior;
        this.tallaNumerica = tallaNumerica;
        this.contornoCintura = contornoCintura;
        this.contornoCadera = contornoCadera;
        this.muslo = muslo;
        this.idTalla = idTalla;
    }

    public Integer getIdTallaHombreInferior() {
        return idTallaHombreInferior;
    }

    public void setIdTallaHombreInferior(Integer idTallaHombreInferior) {
        this.idTallaHombreInferior = idTallaHombreInferior;
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

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTallaHombreInferior != null ? idTallaHombreInferior.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TallasHombreInferior)) {
            return false;
        }
        TallasHombreInferior other = (TallasHombreInferior) object;
        if ((this.idTallaHombreInferior == null && other.idTallaHombreInferior != null) || (this.idTallaHombreInferior != null && !this.idTallaHombreInferior.equals(other.idTallaHombreInferior))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TallasHombreInferior[ idTallaHombreInferior=" + idTallaHombreInferior + " ]";
    }
    
}
