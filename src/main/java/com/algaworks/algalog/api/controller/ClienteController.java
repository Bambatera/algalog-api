package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leand
 */
@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager manager;
    
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return this.manager.createQuery("FROM Cliente", Cliente.class).getResultList();
    }
}
