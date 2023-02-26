package com.stefanini.repository;

import java.util.List;
import java.util.Optional;

import com.stefanini.dao.GenericDAO;
import com.stefanini.entity.Jogador;

public class JogadorRepository extends GenericDAO<Jogador, Long> {
  public Optional<Jogador> buscaNickname(String nickname){
    return createQuery("SELECT j FROM Jogador j where j.nickname = :nickname")
      .setParameter("nickname", nickname)
      .getResultStream()
      .findFirst();
  }
}
