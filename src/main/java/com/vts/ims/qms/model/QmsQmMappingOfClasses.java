package com.vts.ims.qms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="ims_qms_qm_mapping_classes")
public class QmsQmMappingOfClasses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "MocId")
	private Long mocId;
	
	@Column(name = "SectionNo")
	private String  sectionNo;
	
	@Column(name = "ClauseNo")
	private String clauseNo;
	
	@Column(name = "MocParentId")
	private Long mocParentId;
	
	@Column(name = "IsForCheckList")
	private String isForCheckList;
	
	@Column(name = "MocDescription")
	private String description;
	
	@Column(name = "RevisionRecordId")
	private Long revisionRecordId;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "ModifiedDate")
	private LocalDateTime modifiedDate;
	
	@Column(name = "IsActive")
	private Integer isActive;
	
}


