/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.iservices;

import ua.com.iteducate.entities.Users;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public interface IUsersService {
    
    /**
     * Finds the user using user identifier.
     *
     * @param uId user identifier to find appropriate user
     * @return the user, or null if none
     */
    public Users findByUId(Integer uId);
    
    /**
     * Detects if the user has administrator abilities using user email and password.
     *
     * @param uEmail user email to find appropriate user
     * @param uPassword user password to find appropriate user
     * @return true or false depending on having administrator abilities
     */
    public Boolean findByUEmailAndUPassword(String uEmail, String uPassword);
    
    /**
     * Inserts the user into the database.
     *
     * @param user the user to be inserted
     */
    public void insertUser(Users user);
    
    /**
     * Updates information about the appropriate user in the database.
     *
     * @param user the user whose information to be inserted
     */
    public void updateUser(Users user);
    
    /**
     * Deletes information about the appropriate user in the database according to given user identifier.
     *
     * @param uId the user identifier for the user having such to be deleted
     */
    public void deleteUser(Integer uId);
    
}
