/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ua.com.iteducate.entities.Comments;
import ua.com.iteducate.entities.Places;
import ua.com.iteducate.entities.Rawplaces;
import ua.com.iteducate.entities.Stations;
import ua.com.iteducate.entities.Users;
import ua.com.iteducate.iservices.ICommentsService;
import ua.com.iteducate.iservices.IPlacesService;
import ua.com.iteducate.iservices.IRawplacesService;
import ua.com.iteducate.iservices.IStationsService;
import ua.com.iteducate.iservices.IUsersService;
import ua.com.iteducate.services.StationsService;

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
        ICommentsService commentsService = (ICommentsService)actx.getBean("CommentsService", ICommentsService.class);
        IStationsService stationsService = (IStationsService)actx.getBean("StationsService", IStationsService.class);
        IRawplacesService rawplacesService = (IRawplacesService)actx.getBean("RawplacesService", IRawplacesService.class);
        
        System.out.println("\n--------------------TESTS--------------------");
        
        // -------- Users
        //Users user = new Users();
        //Users userToUpdate = usersService.findByUId(6);
        //user.setUAdmin(0);
        //user.setUEmail("antony94@ukr.net");
        //user.setUName("Antony");
        //user.setUPassword("password");
        //user.setUPhotoSrc("photo_source");
        //user.setUSurname("Boretskiy");
        //userToUpdate.setUEmail("newEmail");
        
        //System.out.println(usersService.findByUId(7).getUEmail());
        //System.out.println(usersService.findByUEmailAndUPassword("email", "PASS"));
        //usersService.insertUser(user);
        //usersService.updateUser(userToUpdate);
        //usersService.deleteUser(7);
        
        // -------- Places
        //Places place = new Places();
        //place.setPLikesNumber(23423);
        
        //placesService.deletePlace(3);
        //placesService.insertPlace(place);
        //System.out.println(placesService.findByPId(5).getPLikesNumber());
        
        // -------- Rawplaces
        //Rawplaces rawplace = new Rawplaces();
        //rawplace.setRImageSrc("src");
        //rawplacesService.insertRawplace(rawplace);
        
        // -------- Comments
        //System.out.println(commentsService.findByCId(2).getText());
        //commentsService.deleteByCId(7);
        //Comments com = new Comments();
        //com.setCId(8);
        //com.setPId(1);
        //com.setText("Newcomment");
        //com.setUId(1);
        //commentsService.insert(com);

        // -------- Stations
        //Stations station = new Stations();
        //station = stationsService.findBysId(1);
        //System.out.println(station);
        
    }
}
