package com.stefanini.resources;

import com.stefanini.entity.Stefamon;
import com.stefanini.service.StefamonService;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/stefamon")
public class StefamonResource {

    @Inject
    private StefamonService stefamonService;

    @GET
    @Path("/{id}")
    public Response pegarPorId(@PathParam("id") Long id){
        return Response.status(Response.Status.OK)
            .entity(stefamonService.pegarPorId(id)).build();
    }

    @GET
    @Path("/todos")
    public Response listarTodos(){
        List<Stefamon> jogadores = stefamonService.listarTodos();
        
        return Response.status(Response.Status.OK)
          .entity(jogadores).build();
    }

    @POST
    public Response salvar(@Valid Stefamon jogador) {
        stefamonService.salvar(jogador);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response alterar(@PathParam("id") Long id, @Valid Stefamon stefamon) {
        return Response.status(Response.Status.OK).entity(stefamonService.alterar(id, stefamon)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        stefamonService.deletar(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
