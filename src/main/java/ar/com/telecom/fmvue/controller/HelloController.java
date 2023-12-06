package ar.com.telecom.fmvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hellojsp")
    public String hello() {
        return "hello";
    }
    @GetMapping("/emulacion")
    public String emulacion() {
        return "emulacion";
    }
}
