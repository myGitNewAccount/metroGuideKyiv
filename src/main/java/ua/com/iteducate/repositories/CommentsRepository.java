/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import ua.com.iteducate.entities.Comments;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface CommentsRepository extends CrudRepository<Comments, Integer> {
    
    public Comments findByCId(Integer cId);
    
    public void deleteByCId(Integer cId);
    
}
