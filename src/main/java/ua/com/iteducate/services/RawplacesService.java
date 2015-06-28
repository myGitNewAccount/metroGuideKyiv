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
import ua.com.iteducate.entities.Rawplaces;
import ua.com.iteducate.iservices.IRawplacesService;
import ua.com.iteducate.repositories.RawplacesRepository;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

@Service("RawplacesService")
@Repository
@Transactional
public class RawplacesService implements IRawplacesService {
    
    @Autowired
    private RawplacesRepository rawplacesRepository;
    
    @Transactional (readOnly = true)
    @Override
    public Rawplaces findByRId(Integer rId){
        return rawplacesRepository.findByRId(rId);
    }
    
    @Transactional (readOnly = true)
    @Override
    public void insertRawplace(Rawplaces rawplace){
        rawplacesRepository.save(rawplace);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void updateRawplace(Rawplaces rawplace){
        rawplacesRepository.save(rawplace);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void deleteRawplace(Integer rId){
        rawplacesRepository.delete(rId);
    }
    
}
