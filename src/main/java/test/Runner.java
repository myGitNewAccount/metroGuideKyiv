/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ua.com.iteducate.entities.Places;
import ua.com.iteducate.entities.Users;
import ua.com.iteducate.iservices.IPlacesService;
import ua.com.iteducate.iservices.IUsersService;

/**
 *
 * @author Antony Boretskiy
 * @author Denis Kochubey
 */

public class Runner {
    public static void main(String[] args) {
        
        ApplicationContext actx = new FileSystemXmlApplicationContext("src/main/resources/app-context.xml");
        IUsersService usersService = (IUsersService)actx.getBean("UsersService", IUsersService.class);
        IPlacesService placesService = (IPlacesService)actx.getBean("PlacesService", IPlacesService.class);
        
        System.out.println("\n--------------------TESTS--------------------");
        
        // Users
        Users user = new Users();
        Users userToUpdate = usersService.findByUId(6);
        user.setUAdmin(0);
        user.setUEmail("antony94@ukr.net");
        user.setUName("Antony");
        user.setUPassword("password");
        user.setUPhotoSrc("photoSrc");
        user.setUSurname("Boretskiy");
        userToUpdate.setUEmail("newEmail");
        
        //System.out.println(usersService.findByUId(7).getUEmail());
        //System.out.println(usersService.findByUEmailAndUPassword("email", "PASS"));
        //usersService.insertUser(user);
        //usersService.updateUser(userToUpdate);
        //usersService.deleteUser(7);
        
        // Places
        //System.out.println(placesService.findByPId(5).getPLikesNumber()); EXAMPLE
        
    }
}
