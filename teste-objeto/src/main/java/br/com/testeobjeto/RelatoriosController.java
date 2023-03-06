package br.com.testeobjeto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RelatoriosController {

	@PostMapping
	public void salvar(@RequestBody Filtros filtros) {
		
		filtros.setFiltrarContasNaoPagas(true); // aqui vc está modificando o valor que veio da requisição --- veja q ja deu erro
		
		
		if(filtros.getFiltrarContasNaoPagas()) {
			
		}else if(filtros.getFiltrarContasNaoPagas()) {
			
		}else if(filtros.getFiltrarContasNaoVencidas()) {
			
		}else if(filtros.getFiltrarContasVencidas()) {
			
		}
		
	}
	
	
}
