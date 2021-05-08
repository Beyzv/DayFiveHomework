/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework;

import my.dayfivehomework.business.entities.AuthManager;
import my.dayfivehomework.business.entities.EmailValidator;
import my.dayfivehomework.business.entities.UserManager;
import my.dayfivehomework.core.GoogleAuthManagerAdapter;
import my.dayfivehomework.dataaccess.abstracts.UserDao;
import my.dayfivehomework.dataaccess.entitties.HibernateUserDao;
import my.dayfivehomework.entities.concretes.User;



/**
 *
 * @author omerfaruk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        User user= new User();
        user.setFirstName("Beyza");
        user.setLastName("Işık");
        user.setEmail("Beyza6785@gmail.com");
        user.setPassword("85693");
        
 
     
             
       
    }
    
}
