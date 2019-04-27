package com.edu.uniopet.mensagemopet.controller;

import com.edu.uniopet.mensagemopet.model.Email;
import com.edu.uniopet.mensagemopet.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Resource
    private EmailService emailService;

    @GetMapping("/list")
    public List<Email> listAll(){
        return emailService.listAll();
    }

    @PostMapping("/send")
    public Email send(@RequestBody Email email){
        return emailService.send(email);
    }
}
