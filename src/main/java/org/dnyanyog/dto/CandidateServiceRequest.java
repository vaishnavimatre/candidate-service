package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;

@Component
public class CandidateServiceRequest {

	   private long resumeMediaId;

	  private String firstName;

 private String middleName;

	 private String lastName;

	   private String vacancy;

	private String email;
	  
	  private String mobile;

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
