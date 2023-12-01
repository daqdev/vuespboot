package ar.com.telecom.fmvue.controller;

import ar.com.telecom.fmvue.dao.OrdenTrabajoFallidaDAO;
import ar.com.telecom.fmvue.model.OrdenTrabajoFallida;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/messages")
@CrossOrigin
public class MessageController {

    private final OrdenTrabajoFallidaDAO otfDAO;
    public MessageController(OrdenTrabajoFallidaDAO otfDAO){
        this.otfDAO = otfDAO;
        log.info("MessageController created");
    }

    @GetMapping("/hello")
       public OrdenTrabajoFallida hello(){
        OrdenTrabajoFallida otFallida = this.otfDAO.findByNroOT("DESA0000000000206196");


        log.info("saying hello {} {}", otFallida.getNroOT(), otFallida.getJsonMensaje());
        
        log.info("otro logcito");
//        return "Trying vuejs with spring boot: "+otFallida.getNroOT();
        return otFallida;
     }

}
