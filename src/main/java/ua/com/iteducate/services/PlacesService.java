/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.iteducate.entities.Places;
import ua.com.iteducate.iservices.IPlacesService;
import ua.com.iteducate.repositories.PlacesRepository;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

@Service("PlacesService")
@Repository
@Transactional
public class PlacesService implements IPlacesService {
    
    @Autowired
    private PlacesRepository placesRepository;
    
    @Transactional (readOnly = true)
    @Override
    public Places findByPId(Integer pId){
        return placesRepository.findByPId(pId);
    }
    
    @Transactional (readOnly = true)
    @Override
    public void insertPlace(Places place){
        placesRepository.save(place);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void updatePlace(Places place){
        placesRepository.save(place);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void deletePlace(Integer id){
        placesRepository.delete(id);
    }
    
}
