package com.example.demo.Model;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Configuration;




@Entity
@Configuration
public class VisitInfo {
	
	//private static final TemporalType TIMESTAMP = null;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	public String Person_Name;
	
	@Column(name = "Person_To_Visit")
	public String name;
	@Column(name = "Building_No")
	public String building;
	
	@Column(name = "Flat_No")
	public int flat;
	public String Purpose_of_Visit;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	public Date publicationDate;
	//public LocalDateTime Creation_Date;
	
	public String Govt_Id_No;
	
	
	
	public VisitInfo() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getPerson_Name() {
		return Person_Name;
	}
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getFlat() {
		return flat;
	}

	public void setFlat(int flat) {
		this.flat = flat;
	}

	public String getPurpose_of_Visit() {
		return Purpose_of_Visit;
	}
	public void setPurpose_of_Visit(String purpose_of_Visit) {
		Purpose_of_Visit = purpose_of_Visit;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	public String getGovt_Id_No() {
		return Govt_Id_No;
	}

	public void setGovt_Id_No(String govt_Id_No) {
		Govt_Id_No = govt_Id_No;
	}

	@Override
	public String toString() {
		return "VisitInfo [id=" + id + ", Person_Name=" + Person_Name + ", name=" + name + ", building=" + building
				+ ", Flat=" + flat + ", Purpose_of_Visit=" + Purpose_of_Visit + ", publicationDate=" + publicationDate
				+ ", Govt_Id_No=" + Govt_Id_No + "]";
	}

	public VisitInfo(int id, String person_Name, String name, String building, int flat, String purpose_of_Visit,
			Date publicationDate, String govt_Id_No) {
		super();
		this.id = id;
		Person_Name = person_Name;
		this.name = name;
		this.building = building;
		this.flat = flat;
		Purpose_of_Visit = purpose_of_Visit;
		this.publicationDate = publicationDate;
		Govt_Id_No = govt_Id_No;
	}



	

	
	
	
	

}
