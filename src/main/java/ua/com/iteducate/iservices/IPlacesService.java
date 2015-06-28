/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.iservices;

import ua.com.iteducate.entities.Places;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface IPlacesService {
    
    public Places findByPId(Integer pId);
    
    public void insertPlace(Places place);
    
    public void updatePlace(Places place);
    
    public void deletePlace(Integer id);
            
}
