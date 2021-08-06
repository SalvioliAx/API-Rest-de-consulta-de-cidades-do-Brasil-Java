package com.github.salvioliax.cidadesapi.states;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.salvioliax.cidadesapi.states.repository.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

	private final StateRepository repository;

	  public StateResource(final StateRepository repository) {
	    this.repository = repository;
	  }

	  @GetMapping
	  public List<State> staties() {
	    return repository.findAll();
	  }
	
}
