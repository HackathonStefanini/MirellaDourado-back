package com.stefanini.resources;

import com.stefanini.dto.CriacaoJogadorDTO;
import com.stefanini.dto.LoginJogadorDTO;
import com.stefanini.dto.RetornoJogadorDTO;
import com.stefanini.entity.Jogador;
import com.stefanini.service.JogadorService;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/jogador")
@Produces("application/json")
@Consumes("application/json")
public class JogadorResource {

    @Inject
    private JogadorService jogadorService;

    @GET
    @Path("/{id}")
    public Response pegarPorId(@PathParam("id") Long id){
        return Response.status(Response.Status.OK)
            .entity(jogadorService.pegarPorId(id)).build();
    }

    @GET
    @Path("/todos")
    public Response listarTodos(){
        List<RetornoJogadorDTO> jogadores = jogadorService.listarTodos()
            .stream().map(RetornoJogadorDTO::paraDTO).collect(Collectors.toList());
        
        return Response.status(Response.Status.OK)
          .entity(jogadores).build();
    }

    @POST
    public Response salvar(@Valid CriacaoJogadorDTO jogador) {
        Jogador novoJogador = jogador.paraJogador();
        jogadorService.salvar(novoJogador);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response alterar(@PathParam("id") Long id, @Valid CriacaoJogadorDTO jogador) {
        Jogador jogadorEditado = jogador.paraJogador();
        RetornoJogadorDTO jogadorFinal = RetornoJogadorDTO
            .paraDTO(jogadorService.alterar(id, jogadorEditado));
        return Response.status(Response.Status.OK).entity(jogadorFinal).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        jogadorService.deletar(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
