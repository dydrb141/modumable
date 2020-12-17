package com.modu.domain.build;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Build {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buildId;

	private String name;

	@Builder
	public Build(String name) {
		this.name = name;
	}
}
