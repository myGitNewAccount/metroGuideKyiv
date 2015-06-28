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
import ua.com.iteducate.entities.Stations;
import ua.com.iteducate.iservices.IStationsService;
import ua.com.iteducate.repositories.StationsRepository;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

@Service("StationsService")
@Repository
@Transactional
public class StationsService implements IStationsService{
    
    @Autowired
    StationsRepository stationsRepository;

    @Override
    public Stations findBysId(Integer sId) {
        return stationsRepository.findBysId(sId);
    }
    
    
}
