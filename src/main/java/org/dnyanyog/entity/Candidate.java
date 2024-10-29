package org.dnyanyog.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table
public class Candidate {

  @Id @Column private long resumeMediaId;

  @Column private String firstName;

  @Column private String middleName;

  @Column private String lastName;

  @Column private String vacancy;

  @Column private String email;
  
  @Column private String mobile;

public long getResumeMediaId() {
return resumeMediaId;}

public void setResumeMediaId(long resumeMediaId) {
this.resumeMediaId = resumeMediaId;}

public String getFirstName() {
return firstName;}

public void setFirstName(String firstName) {
this.firstName = firstName;}

public String getMiddleName() {
return middleName;}

public void setMiddleName(String middleName) {
this.middleName = middleName;}

public String getLastName() {
return lastName;}

public void setLastName(String lastName) {
this.lastName = lastName;}

public String getVacancy() {
return vacancy;}

public void setVacancy(String vacancy) {
this.vacancy = vacancy;}

public String getEmail() {
return email;}

public void setEmail(String email) {
this.email = email;}

public String getMobile() {
return mobile;}

public void setMobile(String mobile) {
this.mobile = mobile;}

  
}
