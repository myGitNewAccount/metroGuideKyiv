/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.mvc.controllers;

import javax.inject.Inject;
import org.krams.tutorial.domain.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.com.iteducate.entities.*;
import ua.com.iteducate.services.UsersService;

/**
 *
 * @author denis
 */
@Controller
public class DefaultController {
    @Inject
    @Qualifier("UsersService")
    private UsersService usersService; 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "sign-in";
    }
   
}
