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
import ua.com.iteducate.repositories.UsersRepository;
import ua.com.iteducate.iservices.IUsersService;
import ua.com.iteducate.entities.Users;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

@Service("UsersService")
@Repository
@Transactional
public class UsersService implements IUsersService {
    
    @Autowired
    private UsersRepository usersRepository;
    
    @Transactional (readOnly = true)
    @Override
    public Users findByUId(Integer uId){
        return usersRepository.findByUId(uId);
    }
    
    @Transactional (readOnly = true)
    @Override
    public Boolean findByUEmailAndUPassword(String uEmail, String uPassword){
        return usersRepository.findByUEmailAndUPassword(uEmail, uPassword) != null;
    }
    
    @Transactional (readOnly = true)
    @Override
    public void insertUser(Users user){
        usersRepository.save(user);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void updateUser(Users user){
        usersRepository.save(user);
    }
    
    @Transactional (readOnly = false)
    @Override
    public void deleteUser(Integer uId){
        usersRepository.delete(uId);
    }
}
