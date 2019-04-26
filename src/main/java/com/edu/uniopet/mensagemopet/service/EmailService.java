package com.edu.uniopet.mensagemopet.service;

import com.edu.uniopet.mensagemopet.model.Email;
import com.edu.uniopet.mensagemopet.repository.EmailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    private EmailRepository emailRepository;

    public List<Email> findAll() {return emailRepository.findAll();}

    public Email findById(Long id) {return  emailRepository.findById(id).get();}

    public String saveOrUpdate (Email email){
        if (emailRepository.save(email) != null){
            return "deu boa";
        }

        return "problemas";
    }

    public void delete(Email email){
       emailRepository.delete(email);
    }
}
