package com.stefanini.service;

import com.stefanini.entity.Stefamon;
import com.stefanini.exceptions.RegraDeNegocioException;
import com.stefanini.repository.StefamonRepository;
import com.stefanini.exceptions.NomeRepetidoException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class StefamonService {
    @Inject
    StefamonRepository stefamonRepository;

    public List<Stefamon> listarTodos(){
        return stefamonRepository.listAll();
    }

    public void salvar(Stefamon stefamon) {
        if(stefamonRepository.nomeRepetido(stefamon.getNome()) == null) {
            throw new NomeRepetidoException("Este nome de Stefamon já existe!");
        }
        stefamonRepository.save(stefamon);
    }

    public Stefamon pegarPorId(Long id) {
        Stefamon stefamon = stefamonRepository.findById(id);
        if(Objects.isNull(stefamon)) {
            throw new RegraDeNegocioException("Ocorreu um erro ao buscar o Stefamon de id " + id, Response.Status.NOT_FOUND);
        }
        return stefamon;
    }

    public Stefamon alterar(Long id, Stefamon stefamon) {
        stefamon.setId(id);
        return stefamonRepository.update(stefamon);
    }

    public void deletar(Long id) {
        stefamonRepository.delete(id);
    }

 }
