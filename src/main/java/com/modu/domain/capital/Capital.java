package com.modu.domain.capital;

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
public class Capital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long capitalId;

	private String name;

	@Builder
	public Capital(String name) {
		this.name = name;
	}
}
