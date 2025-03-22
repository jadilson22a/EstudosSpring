package com.github.jadilson22a.APIPrevisao.controller;

import com.github.jadilson22a.APIPrevisao.model.Previsao;
import com.github.jadilson22a.APIPrevisao.repository.PrevisaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/previsao")
public class PrevisaoController {

    private PrevisaoRepository previsaoRepository;

    public PrevisaoController(PrevisaoRepository previsaoRepository) {
        this.previsaoRepository = previsaoRepository;
    }

    @PostMapping
    public void inserir(@RequestBody Previsao previsao){
        previsaoRepository.save(previsao);
    }

    @DeleteMapping
    public void excluir(@RequestParam("id") Integer id){
        previsaoRepository.deleteById(id.toString());
    }

    @PutMapping
    public void atualizar(@RequestParam("id") Integer id, @RequestBody Previsao previsao){
        previsao.setId(id);
        previsaoRepository.save(previsao);
    }

    @GetMapping
    public List<Previsao> buscarPedido(@RequestParam("pedido") Integer pedido){
        return previsaoRepository.findByPedido(pedido);
    }
}
