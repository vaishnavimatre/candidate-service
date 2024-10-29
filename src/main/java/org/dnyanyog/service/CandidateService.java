package org.dnyanyog.service;

import org.dnyanyog.dto.CandidateServiceRequest;
import org.dnyanyog.dto.CandidateServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CandidateService {
  CandidateServiceResponse activateClient(@RequestBody CandidateServiceRequest clientRequest);
}
