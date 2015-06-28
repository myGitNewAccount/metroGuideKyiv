/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.iteducate.entities.Comments;
import ua.com.iteducate.iservices.ICommentsService;
import ua.com.iteducate.repositories.CommentsRepository;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

@Service("CommentsService")
@Repository
@Transactional
public class CommentsService implements ICommentsService{

    @Autowired
    CommentsRepository commentsRepository;
    
   
    @Override
    public void insert(Comments comment) {
        commentsRepository.save(comment);
    }
    
   
    @Override
    public void deleteByCId(Integer cId) {
        commentsRepository.deleteByCId(cId);
    }

  
    @Override
    public Comments findByCId(Integer cId) {
        return commentsRepository.findByCId(cId);
    }
    
}
