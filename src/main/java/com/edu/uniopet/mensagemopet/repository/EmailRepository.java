package com.edu.uniopet.mensagemopet.repository;

import com.edu.uniopet.mensagemopet.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
