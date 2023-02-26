package com.stefanini.repository;

import java.util.Optional;

import com.stefanini.dao.GenericDAO;
import com.stefanini.entity.Stefamon;

public class StefamonRepository extends GenericDAO<Stefamon, Long> {
  public Optional<Stefamon> nomeRepetido(String nome){
    return createQuery("SELECT j FROM Jogador j where j.nome = :nome")
      .setParameter("nome", nome)
      .getResultStream()
      .findFirst();
  }
}
