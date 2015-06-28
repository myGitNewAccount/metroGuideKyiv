/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "users")
@XmlRootElement

public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "u_id")
    private Integer uId;
    @Column(name = "u_admin")
    private Integer uAdmin;
    @Size(max = 100)
    @Column(name = "u_name")
    private String uName;
    @Size(max = 100)
    @Column(name = "u_surname")
    private String uSurname;
    @Size(max = 100)
    @Column(name = "u_password")
    private String uPassword;
    @Size(max = 100)
    @Column(name = "u_photo_src")
    private String uPhotoSrc;
    @Size(max = 100)
    @Column(name = "u_email")
    private String uEmail;
    @ManyToMany(mappedBy = "usersCollection")
    private Collection<Places> placesCollection;
    @OneToMany(mappedBy = "uId")
    private Collection<Places> placesCollection1;
    @OneToMany(mappedBy = "uId")
    private Collection<Comments> commentsCollection;
    @OneToMany(mappedBy = "uId")
    private Collection<Rawplaces> rawplacesCollection;

    public Users() {
    }

    public Users(Integer uId) {
        this.uId = uId;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public Integer getUAdmin() {
        return uAdmin;
    }

    public void setUAdmin(Integer uAdmin) {
        this.uAdmin = uAdmin;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUSurname() {
        return uSurname;
    }

    public void setUSurname(String uSurname) {
        this.uSurname = uSurname;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getUPhotoSrc() {
        return uPhotoSrc;
    }

    public void setUPhotoSrc(String uPhotoSrc) {
        this.uPhotoSrc = uPhotoSrc;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    @XmlTransient
    public Collection<Places> getPlacesCollection() {
        return placesCollection;
    }

    public void setPlacesCollection(Collection<Places> placesCollection) {
        this.placesCollection = placesCollection;
    }

    @XmlTransient
    public Collection<Places> getPlacesCollection1() {
        return placesCollection1;
    }

    public void setPlacesCollection1(Collection<Places> placesCollection1) {
        this.placesCollection1 = placesCollection1;
    }

    @XmlTransient
    public Collection<Comments> getCommentsCollection() {
        return commentsCollection;
    }

    public void setCommentsCollection(Collection<Comments> commentsCollection) {
        this.commentsCollection = commentsCollection;
    }

    @XmlTransient
    public Collection<Rawplaces> getRawplacesCollection() {
        return rawplacesCollection;
    }

    public void setRawplacesCollection(Collection<Rawplaces> rawplacesCollection) {
        this.rawplacesCollection = rawplacesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uId != null ? uId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.uId == null && other.uId != null) || (this.uId != null && !this.uId.equals(other.uId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.iteducate.entities.Users[ uId=" + uId + " ]";
    }
    
}
