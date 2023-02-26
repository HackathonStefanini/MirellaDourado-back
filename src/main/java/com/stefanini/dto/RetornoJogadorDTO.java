package com.stefanini.dto;

import java.math.BigDecimal;
import java.util.List;

import com.stefanini.entity.Jogador;
import com.stefanini.entity.Stefamon;

public class RetornoJogadorDTO {
  private Long id;
  private String nickname;
  private BigDecimal saldo;
  private List<Stefamon> stefamons;
  
  public RetornoJogadorDTO(Long id, String nickname, BigDecimal saldo, List<Stefamon> stefamons) {
    this.id = id;
    this.saldo = saldo;
    this.nickname = nickname;
    this.stefamons = stefamons;
  }

  public Long getId() {
    return id;
  }

  public String getNickname() {
    return nickname;
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

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public void setStefamons(List<Stefamon> stefamons) {
    this.stefamons = stefamons;
  }

  public static RetornoJogadorDTO paraDTO(Jogador jogador){
    return new RetornoJogadorDTO(
            jogador.getId(),
            jogador.getNickname(),
            jogador.getSaldo(),
            jogador.getStefamons()
    );
}
}
