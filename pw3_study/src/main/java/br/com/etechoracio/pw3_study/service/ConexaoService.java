package br.com.etechoracio.pw3_study.service;

import br.com.etechoracio.pw3_study.dto.ConexaoResponseDTO;
import br.com.etechoracio.pw3_study.dto.DisciplinaResponseDTO;
import br.com.etechoracio.pw3_study.repository.ConexaoRepository;
import br.com.etechoracio.pw3_study.repository.DisciplinaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConexaoService {
    @Autowired
    private ConexaoRepository respository;

     public Long contarConexoes(){return respository.count();}
}