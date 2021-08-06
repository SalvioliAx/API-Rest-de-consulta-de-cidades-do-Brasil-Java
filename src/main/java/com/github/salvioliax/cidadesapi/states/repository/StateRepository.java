package com.github.salvioliax.cidadesapi.states.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.salvioliax.cidadesapi.states.State;

public interface StateRepository extends JpaRepository<State, Long> {
}

