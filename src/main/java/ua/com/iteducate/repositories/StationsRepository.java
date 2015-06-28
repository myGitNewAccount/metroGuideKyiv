/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.com.iteducate.entities.Stations;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface StationsRepository extends CrudRepository<Stations, Integer>{
    
    public Stations findBysId(Integer sId);
    
}
