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
@Table(name = "stations")
@XmlRootElement

public class Stations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_id")
    private Integer sId;
    @Size(max = 100)
    @Column(name = "s_linename")
    private String sLinename;
    @Column(name = "s_event_num")
    private Integer sEventNum;
    @Size(max = 100)
    @Column(name = "s_name")
    private String sName;
    @Size(max = 100)
    @Column(name = "s_adress")
    private String sAdress;
    @Column(name = "s_next")
    private Integer sNext;
    @Column(name = "s_prev")
    private Integer sPrev;

    public Stations() {
    }

    public Stations(Integer sId) {
        this.sId = sId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSLinename() {
        return sLinename;
    }

    public void setSLinename(String sLinename) {
        this.sLinename = sLinename;
    }

    public Integer getSEventNum() {
        return sEventNum;
    }

    public void setSEventNum(Integer sEventNum) {
        this.sEventNum = sEventNum;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSAdress() {
        return sAdress;
    }

    public void setSAdress(String sAdress) {
        this.sAdress = sAdress;
    }

   
    public Integer getSNext() {
        return sNext;
    }

    public void setSNext(Integer sNext) {
        this.sNext = sNext;
    }

    public Integer getSPrev() {
        return sPrev;
    }

    public void setSPrev(Integer sPrev) {
        this.sPrev = sPrev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stations)) {
            return false;
        }
        Stations other = (Stations) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id = " + sId + " name = " + sName;
    }
    
}
