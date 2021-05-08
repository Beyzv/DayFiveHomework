/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dayfivehomework.core;

import my.dayfivehomework.google.GoogleAuthManager;

/**
 *
 * @author omerfaruk
 */
public class GoogleAuthManagerAdapter implements EmailAuthService{

    public GoogleAuthManagerAdapter() {
    }

    @Override
    public void addToSystem(String message) {
     GoogleAuthManager manager=new GoogleAuthManager();   
     manager.register(message);
    }
  
}
