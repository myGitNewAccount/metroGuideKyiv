/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.iservices;

import java.util.List;
import ua.com.iteducate.entities.Comments;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface ICommentsService {
    
    public void insert(Comments comment);
    
    public void deleteByCId(Integer cId);
    
    public Comments findByCId(Integer pId);
    
}
