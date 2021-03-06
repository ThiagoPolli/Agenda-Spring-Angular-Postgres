package io.github.thiagoPolli.agendaapi.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.thiagoPolli.agendaapi.model.entity.Contato;
import io.github.thiagoPolli.agendaapi.model.repositories.ContatoRepository;

@RestController
@RequestMapping("/api/contatos")
@CrossOrigin("*")
public class ContatoController {
	
	@Autowired
	private ContatoRepository repository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato save(@RequestBody Contato contato) {
		return repository.save(contato);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@GetMapping
	public List<Contato> list(){
		return repository.findAll();
	}
	
	
	@PatchMapping("{id}/favorito")  //para atualizar parcial o registro utiliza @PatcMapping
	public void favorite(@PathVariable Integer id, @RequestBody Boolean favorito) {
		Optional<Contato> contato = repository.findById(id);
		contato.ifPresent(c ->{
			c.setFavorito(favorito);
			repository.save(c);
		});
		
	}

}











