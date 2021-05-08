/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.business.entities;

import java.util.List;
import my.dayfivehomework.business.abstracts.UserService;
import my.dayfivehomework.core.EmailAuthService;
import my.dayfivehomework.dataaccess.abstracts.UserDao;
import my.dayfivehomework.entities.concretes.User;



/**
 *
 * @author omerfaruk
 */
public class UserManager implements UserService{

    private EmailValidator _emailValidator;
    private AuthManager _authManager;
    private  UserDao _userDao;
    private EmailAuthService _emailAuthService;
    
    
    public UserManager(EmailValidator emailValidator ,AuthManager authManager, UserDao userDao,EmailAuthService emailAuthService){
     _emailValidator=emailValidator;
     _authManager=authManager;
     _userDao=userDao;
     _emailAuthService=emailAuthService;
    }
 
       
    @Override
    public void singUp(User user) {
       if(_emailValidator.isEmailExist(user.getEmail()) && _emailValidator.isEmailValid(user.getEmail())&& _authManager.isInfoSuitable(user)) {
         
           _authManager.sendVerificationMail();
           if (_authManager.didClickLLink()) {
                System.out.println("User Registration Successful! Please Login.");
                _userDao.add(user);
                _emailAuthService.addToSystem("user added to system : " + user.getFirstName() );
            }
         
        }
        else
            System.out.println("User Registration is NOT Successful.");
    }

    @Override
    public void singIn(User user,String password) {
        if (_emailValidator.isEmailExist(user.getEmail()) && user.getPassword()==password) {
                System.out.println("login Successful!");
            }
        else
            System.out.println("Email or password is incorrect ");
    }

}

 

