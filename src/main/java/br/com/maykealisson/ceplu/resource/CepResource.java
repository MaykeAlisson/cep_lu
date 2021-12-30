package br.com.maykealisson.ceplu.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/cep")
public class CepResource {

    @RequestMapping(value = "/v1/cep/{cep}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarEndereco(@PathVariable final Long cep){
        return ResponseEntity.ok().build();
    }
}
