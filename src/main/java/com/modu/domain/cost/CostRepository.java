package com.modu.domain.cost;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CostRepository extends JpaRepository<Cost, Long> {
	Optional<Cost> findByCapitalIdAndBuildId(Long capitalId, Long buildId);
}
