package org.dnyanyog.repo;

import java.util.List;


import org.dnyanyog.entity.Candidate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CandidateServiceRepository extends JpaRepository<Candidate, Long> {
}
