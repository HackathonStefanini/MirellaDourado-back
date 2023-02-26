package com.stefanini.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.stefanini.interfaces.messages.*;

import com.stefanini.entity.Jogador;
import com.stefanini.entity.Stefamon;

public class CriacaoJogadorDTO {  
  private String nickname;

  @NotNull(message = NOT_NULL)
  @Size(min = 4, max = 10, message = PASSWORD_SIZE)
  private String password;
  private BigDecimal saldo;
  private List<Stefamon> stefamons;

  public CriacaoJogadorDTO() {}

  public CriacaoJogadorDTO(String nickname, String password, BigDecimal saldo, List<Stefamon> stefamons) {
    this.saldo = saldo;
    this.nickname = nickname;
    this.password = password;
    this.stefamons = stefamons;
  }

  public String getNickname() {
    return nickname;
  }

  public String getPassword() {
    return password;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public List<Stefamon> getStefamons() {
    return stefamons;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public void setStefamons(List<Stefamon> stefamons) {
    this.stefamons = stefamons;
  }

  public Jogador paraJogador(){
    return new Jogador(
            this.getNickname(),
            this.getPassword(),
            this.getSaldo(),
            getStefamons()
    );
}
}
