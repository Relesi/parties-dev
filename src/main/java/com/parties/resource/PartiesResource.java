package com.parties.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parties.models.Parties;
import com.parties.repository.PartiesRepository;

@RestController
@RequestMapping("/parties")
public class PartiesResource {

	@Autowired
	private PartiesRepository pr;

	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Parties> listParties() {
		Iterable<Parties> listParties = pr.findAll();
		return listParties;
	}

	@PostMapping()
	public Parties cadastrarParties(@RequestBody @Valid Parties parties) {
		return pr.save(parties);
	}

	@DeleteMapping()
	public Parties deletaParties(@RequestBody Parties parties) {
		pr.delete(parties);
		return parties;
	}

}
