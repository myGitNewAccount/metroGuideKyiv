/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */
@Entity
@Table(name = "rawplaces")
@XmlRootElement

public class Rawplaces implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "r_id")
    private Integer rId;
    @Size(max = 100)
    @Column(name = "r_image_src")
    private String rImageSrc;
    @Size(max = 1000)
    @Column(name = "r_text")
    private String rText;
    @Size(max = 1000)
    @Column(name = "r_adress")
    private String rAdress;
    @JoinColumn(name = "s_id", referencedColumnName = "s_id")
    @ManyToOne
    private Stations sId;
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ManyToOne
    private Users uId;

    public Rawplaces() {
    }

    public Rawplaces(Integer rId) {
        this.rId = rId;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getRImageSrc() {
        return rImageSrc;
    }

    public void setRImageSrc(String rImageSrc) {
        this.rImageSrc = rImageSrc;
    }

    public String getRText() {
        return rText;
    }

    public void setRText(String rText) {
        this.rText = rText;
    }

    public String getRAdress() {
        return rAdress;
    }

    public void setRAdress(String rAdress) {
        this.rAdress = rAdress;
    }

    public Stations getSId() {
        return sId;
    }

    public void setSId(Stations sId) {
        this.sId = sId;
    }

    public Users getUId() {
        return uId;
    }

    public void setUId(Users uId) {
        this.uId = uId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rId != null ? rId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rawplaces)) {
            return false;
        }
        Rawplaces other = (Rawplaces) object;
        if ((this.rId == null && other.rId != null) || (this.rId != null && !this.rId.equals(other.rId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.iteducate.entities.Rawplaces[ rId=" + rId + " ]";
    }
    
}
