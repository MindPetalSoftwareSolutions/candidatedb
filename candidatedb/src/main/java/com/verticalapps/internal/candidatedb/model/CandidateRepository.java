package com.verticalapps.internal.candidatedb.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.verticalapps.internal.candidatedb.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	
	Candidate findByName(String name);
	
}