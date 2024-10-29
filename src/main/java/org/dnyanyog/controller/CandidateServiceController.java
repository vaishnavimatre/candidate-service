package org.dnyanyog.controller;

import org.dnyanyog.service.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateServiceController {
  @Autowired CandidateServiceImpl candidateService;
}
