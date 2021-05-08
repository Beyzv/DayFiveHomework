/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.business.abstracts;

import my.dayfivehomework.entities.concretes.User;

/**
 *
 * @author omerfaruk
 */
public interface AuthService {
     void sendVerificationMail();
     boolean didClickLLink();
     boolean isInfoSuitable(User user);
}
