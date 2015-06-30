/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.iservices;

import ua.com.iteducate.entities.Rawplaces;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface IRawplacesService { 
    
    public Rawplaces findByRId(Integer rId);
    
    public void insertRawplace(Rawplaces rawplace);
    
    public void updateRawplace(Rawplaces rawplace);
    
    public void deleteRawplace(Integer rId);
    
}
