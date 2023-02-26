package com.stefanini.dto;

import javax.validation.constraints.NotBlank;

public class LoginJogadorDTO {
    @NotBlank(message = "Campo Login não pode ser vazio.")
    private String login;
    @NotBlank(message = "Campo Senha não pode ser vazio.")
    private String password;

    public LoginJogadorDTO(){}

    public LoginJogadorDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
