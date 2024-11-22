package com.vts.ims.qms.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Table(name = "ims_qms_qm_revision_record")
@Data
@Entity
public class QmsQmRevisionRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RevisionRecordId")
	private long revisionRecordId;
	@Column(name = "DocFileName")
	private String docFileName;
	@Column(name = "DocFilepath")
	private String docFilepath;
	@Column(name = "Description")
	private String description;
	@Column(name = "IssueNo")
	private int issueNo;
	@Column(name = "RevisionNo")
	private int revisionNo;
	@Column(name = "DateOfRevision")
	private LocalDate dateOfRevision;
	@Column(name = "StatusCode")
	private String statusCode;
	@Column(name = "AbbreviationIdNotReq")
	private String abbreviationIdNotReq;
	@Column(name = "CreatedBy")
	private String createdBy;
	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Column(name = "ModifiedDate")
	private LocalDateTime modifiedDate;
	@Column(name = "IsActive")
	private int isActive;
	
}
