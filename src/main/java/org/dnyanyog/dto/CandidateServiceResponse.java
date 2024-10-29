package org.dnyanyog.dto;


import org.springframework.stereotype.Component;

@Component
public class CandidateServiceResponse {

  private String status;

  private String client_status;
  private String code;
  private String message;

  public String getClient_status() {
    return client_status;
  }

  public static CandidateServiceResponse getInstance() {
    return new CandidateServiceResponse();
  }

  public CandidateServiceResponse setClient_status(String client_status) {
    this.client_status = client_status;
    return this;
  }

  private String client_id;

  public String getStatus() {
    return status;
  }

  public CandidateServiceResponse setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getCode() {
    return code;
  }

  public CandidateServiceResponse setCode(String code) {
    this.code = code;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public CandidateServiceResponse setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getClient_id() {
    return client_id;
  }

  public CandidateServiceResponse setClient_id(String client_id) {
    this.client_id = client_id;
    return this;
  }
}
