package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.VisitInfo;

public interface InfoRepo extends JpaRepository<VisitInfo ,Integer> {

	 List<VisitInfo> findAllByPublicationDate(Date publicationDate);
	 List<VisitInfo> findAllByname(String name);
	List<VisitInfo> findAllByBuildingAndFlat(String building ,Integer flat);
}
