package com.vts.ims.audit.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="ims_audit_obs")
public class AuditObservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AuditObsId")
	private Long auditObsId;
	
	@Column(name = "Observation")
	private String observation;
	
	@Column(name = "IsActive")
	private int isActive;
}
