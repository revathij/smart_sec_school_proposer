package com.myspace.smart_sec_school_proposer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Postal Code")
	private java.lang.Integer postal_Code;
	@org.kie.api.definition.type.Label("Mode of transport")
	private String transport_Mode;
	@org.kie.api.definition.type.Label("Expected or Prelims Score")
	private java.lang.Integer t_score;
	@org.kie.api.definition.type.Label("Mother Tongue ")
	private String motherTongue;
	@org.kie.api.definition.type.Label("Resident Status")
	private String residence_Status;
	@org.kie.api.definition.type.Label("Gender")
	private String gender;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getPostal_Code() {
		return this.postal_Code;
	}

	public void setPostal_Code(java.lang.Integer postal_Code) {
		this.postal_Code = postal_Code;
	}

	public java.lang.Integer getT_score() {
		return this.t_score;
	}

	public void setT_score(java.lang.Integer t_score) {
		this.t_score = t_score;
	}

	public java.lang.String getTransport_Mode() {
		return this.transport_Mode;
	}

	public void setTransport_Mode(java.lang.String transport_Mode) {
		this.transport_Mode = transport_Mode;
	}

	public java.lang.String getMotherTongue() {
		return this.motherTongue;
	}

	public void setMotherTongue(java.lang.String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public java.lang.String getResidence_Status() {
		return this.residence_Status;
	}

	public void setResidence_Status(java.lang.String residence_Status) {
		this.residence_Status = residence_Status;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public Applicant(java.lang.String name, java.lang.Integer postal_Code,
			java.lang.String transport_Mode, java.lang.Integer t_score,
			java.lang.String motherTongue, java.lang.String residence_Status,
			java.lang.String gender) {
		this.name = name;
		this.postal_Code = postal_Code;
		this.transport_Mode = transport_Mode;
		this.t_score = t_score;
		this.motherTongue = motherTongue;
		this.residence_Status = residence_Status;
		this.gender = gender;
	}

}