/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */
@Entity
@Table(name = "places")
@XmlRootElement

public class Places implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "p_id")
    private Integer pId;
    @Size(max = 100)
    @Column(name = "p_image_src")
    private String pImageSrc;
    @Size(max = 1000)
    @Column(name = "p_text")
    private String pText;
    @Column(name = "p_likes_number")
    private Integer pLikesNumber;
    @Column(name = "p_rate")
    private Integer pRate;
    @Size(max = 1000)
    @Column(name = "p_adress")
    private String pAdress;
    @JoinTable(name = "marks", joinColumns = {
        @JoinColumn(name = "p_id", referencedColumnName = "p_id")}, inverseJoinColumns = {
        @JoinColumn(name = "u_id", referencedColumnName = "u_id")})
    @ManyToMany
    private Collection<Users> usersCollection;
    @JoinColumn(name = "s_id", referencedColumnName = "s_id")
    @ManyToOne
    private Stations sId;
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ManyToOne
    private Users uId;
    @OneToMany(mappedBy = "pId")
    private Collection<Comments> commentsCollection;

    public Places() {
    }

    public Places(Integer pId) {
        this.pId = pId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPImageSrc() {
        return pImageSrc;
    }

    public void setPImageSrc(String pImageSrc) {
        this.pImageSrc = pImageSrc;
    }

    public String getPText() {
        return pText;
    }

    public void setPText(String pText) {
        this.pText = pText;
    }

    public Integer getPLikesNumber() {
        return pLikesNumber;
    }

    public void setPLikesNumber(Integer pLikesNumber) {
        this.pLikesNumber = pLikesNumber;
    }

    public Integer getPRate() {
        return pRate;
    }

    public void setPRate(Integer pRate) {
        this.pRate = pRate;
    }

    public String getPAdress() {
        return pAdress;
    }

    public void setPAdress(String pAdress) {
        this.pAdress = pAdress;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
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

    @XmlTransient
    public Collection<Comments> getCommentsCollection() {
        return commentsCollection;
    }

    public void setCommentsCollection(Collection<Comments> commentsCollection) {
        this.commentsCollection = commentsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Places)) {
            return false;
        }
        Places other = (Places) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.iteducate.entities.Places[ pId=" + pId + " ]";
    }
    
}
