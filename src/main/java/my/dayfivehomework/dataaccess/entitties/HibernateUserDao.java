/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.dataaccess.entitties;

import java.util.List;
import my.dayfivehomework.dataaccess.abstracts.UserDao;
import my.dayfivehomework.entities.concretes.User;

/**
 *
 * @author omerfaruk
 */
public class HibernateUserDao implements UserDao{

    public HibernateUserDao(){}
    @Override
    public void add(User user) {
        System.out.println("added with hibernate.");
               
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
