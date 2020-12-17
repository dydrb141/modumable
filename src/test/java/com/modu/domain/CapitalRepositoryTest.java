package com.modu.domain;

import com.modu.domain.capital.Capital;
import com.modu.domain.capital.CapitalRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CapitalRepositoryTest {
	@Autowired
	CapitalRepository capitalRepository;


	@DisplayName("수도 불러오기")
	@Test
	void test_get_capital() {
		List<Capital> capitals = capitalRepository.findAll();

		Capital capital = capitals.get(0);

		assertThat(capital.getName()).isEqualTo("프라하");
	}


}