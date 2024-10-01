package br.com.etechoracio.pw3_study.Controller;

import br.com.etechoracio.pw3_study.dto.ConexaoResponseDTO;
import br.com.etechoracio.pw3_study.service.ConexaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/conexoes")
@CrossOrigin(origins = "*") //qualquer requisição pode entrar
public class ConexaoController {
    @Autowired
    private ConexaoService service;

    @GetMapping
    public Long contaConexao(){ return service.contarConexoes();}

}
