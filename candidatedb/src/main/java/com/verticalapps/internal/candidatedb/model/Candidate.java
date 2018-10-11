package com.verticalapps.internal.candidatedb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Candidate {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String headline;
	private String notes;
	private String phone;
	private String linkedin;
}