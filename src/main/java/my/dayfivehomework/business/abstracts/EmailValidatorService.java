/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.business.abstracts;

/**
 *
 * @author omerfaruk
 */
public interface EmailValidatorService {
    boolean isEmailValid(String email);
    boolean isEmailExist(String email);
   
}
