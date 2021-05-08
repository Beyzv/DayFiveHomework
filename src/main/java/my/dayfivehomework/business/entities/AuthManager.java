/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.business.entities;

import my.dayfivehomework.business.abstracts.AuthService;
import my.dayfivehomework.entities.concretes.User;

/**
 *
 * @author omerfaruk
 */
public class AuthManager implements AuthService {
   public AuthManager(){}
    
    @Override
    public  void sendVerificationMail() {
        System.out.println("This is a verification mail.Please open the link for verification.");
    }

    @Override
    public boolean didClickLLink() {
        return true;
    }

    @Override
    public boolean isInfoSuitable(User user) {
        if (user.getPassword().length()>=6 && user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
            return true;
        }
       return false;
    }
    
}
