package com.edu.uniopet.mensagemopet.service;

import com.edu.uniopet.mensagemopet.model.Email;
import com.edu.uniopet.mensagemopet.repository.EmailRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

@Service
public class EmailService {

    @Resource
    private EmailRepository emailRepository;

    public List<Email> listAll() {return emailRepository.findAll();}

    public Email findById(Long id) {return  emailRepository.findById(id).get();}

    public Email send(Email email){
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getLocalHost();
            email.setOrigem(inetAddress.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        email.setData(new Date());

        return emailRepository.save(email);
    }

    public void delete(Email email){
       emailRepository.delete(email);
    }
}
