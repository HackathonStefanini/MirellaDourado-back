package com.stefanini.service;

import com.stefanini.entity.Jogador;
import com.stefanini.exceptions.NicknameRepetidoException;
import com.stefanini.exceptions.RegraDeNegocioException;
import com.stefanini.repository.JogadorRepository;
import com.stefanini.utils.AuxSenha;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@ApplicationScoped
public class JogadorService {

    @Inject
    JogadorRepository jogadorRepository;

    public void salvar(Jogador jogador) {
        if(jogadorRepository.buscaNickname(jogador.getNickname()) == null) {
            throw new NicknameRepetidoException("Nickname já em uso, tente outro.");
        }
        jogador.setPassword(AuxSenha.encodeBase64(jogador.getPassword()));
        jogadorRepository.save(jogador);
    }

    public Jogador pegarPorId(Long id) {
        Jogador jogador = jogadorRepository.findById(id);
        if(Objects.isNull(jogador)) {
            throw new RegraDeNegocioException("Ocorreu um erro ao buscar o Jogador de id " + id, Response.Status.NOT_FOUND);
        }
        return jogador;
    }

    public Jogador alterar(Long id, Jogador jogador) {
        jogador.setId(id);
        jogador.setPassword(AuxSenha.encodeBase64(jogador.getPassword()));

        return jogadorRepository.update(jogador);
    }

    public void deletar(Long id) {
        jogadorRepository.delete(id);
    }

    public List<Jogador> listarTodos() {
        return jogadorRepository.listAll();
    }

    public Optional<Jogador> buscarNickname(String nickname){
        return jogadorRepository.buscaNickname(nickname);
    }
}
