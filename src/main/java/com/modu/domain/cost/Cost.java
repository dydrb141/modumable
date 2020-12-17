package com.modu.domain.cost;

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
public class Cost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long costId;

	private Long capitalId;

	private Long buildId;

	private int rand;

	private int billa;

	private int billding;

	private int hotel;

	private int landmark;

	private int parasol;

	private int bangalo;




}
