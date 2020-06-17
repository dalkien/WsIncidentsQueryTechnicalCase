/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsQueryTechnicalCase.ws;


import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author omarMad
 */
@Path("incidentsQueryTechnicalCase")
@Stateless
@TransactionManagement
public class WsIncidentsQueryTechnicalCaseService {


    public WsIncidentsQueryTechnicalCaseService() {
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("consult/{idcat}/{idsubcat}/{idvoz}/{idcod}/{numcta}/{tipdoc}/{numdoc}")
    public String consulta(@QueryParam("idcat") String idcat ,
                           @QueryParam("idsubcat") String idsubcat ,
                           @QueryParam("idvoz") String idvoz ,
                           @QueryParam("idcod") String idcod ,
                           @QueryParam("numcta") String numcta ,
                           @QueryParam("tipdoc") String tipdoc ,
                           @QueryParam("numdoc") String numdoc
    ) throws JsonProcessingException {
        String valor = "exitoso";
        return valor;
    }
}
