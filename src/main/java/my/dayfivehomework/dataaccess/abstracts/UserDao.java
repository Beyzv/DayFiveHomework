/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.dataaccess.abstracts;

import java.util.List;
import my.dayfivehomework.entities.concretes.User;

/**
 *
 * @author omerfaruk
 */
public interface UserDao {
    void add(User user);
    List<User> getAll();
   
}
