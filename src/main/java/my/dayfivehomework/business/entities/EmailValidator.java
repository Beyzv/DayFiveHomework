/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.business.entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import my.dayfivehomework.business.abstracts.EmailValidatorService;
import my.dayfivehomework.dataaccess.abstracts.UserDao;

import my.dayfivehomework.entities.concretes.User;


/**
 *
 * @author omerfaruk
 */
public class EmailValidator implements EmailValidatorService{

    private UserDao _UserDao;
    public EmailValidator(UserDao userDao){
   
    }
    
    
    @Override
    public  boolean isEmailValid(String email) {
     Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (!email.isEmpty() && matchFound) {
			return true;
		} 
                else
                    return false;
                    
              
    } 

    @Override
    public boolean isEmailExist(String email) {
        for(User user: _UserDao.getAll()) {
            if (email != user.getEmail()) {
                return false;
            }
        }
        return true;
    }
}