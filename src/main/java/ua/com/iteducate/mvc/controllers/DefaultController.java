/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.iteducate.mvc.controllers;

import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.com.iteducate.entities.Users;
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
       return "index";
   }
   
   @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
   public ModelAndView signin() {
      return new ModelAndView("sign-in", "command", new Users());
   }
   
   @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
   public String addUser (@ModelAttribute("metroGuide")Users user, ModelMap model) {
      model.addAttribute("uEmail", user.getUEmail());
      model.addAttribute("uPassword", user.getUPassword());
      /*if(usersService.findByUEmailAndUPassword(user.getUEmail(), user.getUPassword())){
          model.addAttribute("existance", "1");
      }
      else{
          model.addAttribute("existance", "0");
      }*/
      return "login";
   }
}
