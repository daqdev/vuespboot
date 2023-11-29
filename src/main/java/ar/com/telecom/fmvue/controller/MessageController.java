package ar.com.telecom.fmvue.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/api/messages")
@CrossOrigin
public class MessageController {

    @GetMapping("/hello")
       public String hello(){
        log.info("saying hello");
        log.info("otro logcito");
        return "Trying vuejs with spring boot";
     }

}
