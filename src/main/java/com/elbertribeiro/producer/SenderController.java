package com.elbertribeiro.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class SenderController {
    @Autowired
    private SenderService service;

    @GetMapping
    public String send(){
        service.send("Enviando mensagem do servico");
        return "ok. done";
    }
}
