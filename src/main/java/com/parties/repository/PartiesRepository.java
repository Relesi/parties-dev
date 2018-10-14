package com.parties.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parties.models.Parties;

public interface PartiesRepository extends JpaRepository<Parties, String> {
		

}
