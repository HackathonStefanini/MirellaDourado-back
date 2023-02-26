package com.stefanini.utils;

import java.util.Base64;

public abstract class AuxSenha {
  public static String encodeBase64(String password){
    return Base64.getEncoder().encodeToString(password.getBytes());
}
}
