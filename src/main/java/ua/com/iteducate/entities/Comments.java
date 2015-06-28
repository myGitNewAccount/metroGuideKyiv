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
@Table(name = "comments")
@XmlRootElement

public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "c_id")
    private Integer cId;
    @Size(max = 5000)
    @Column(name = "text")
    private String text;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne
    private Places pId;
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ManyToOne
    private Users uId;

    public Comments() {
    }

    public Comments(Integer cId) {
        this.cId = cId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Places getPId() {
        return pId;
    }

    public void setPId(Places pId) {
        this.pId = pId;
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
        hash += (cId != null ? cId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comments)) {
            return false;
        }
        Comments other = (Comments) object;
        if ((this.cId == null && other.cId != null) || (this.cId != null && !this.cId.equals(other.cId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.iteducate.entities.Comments[ cId=" + cId + " ]";
    }
    
}
