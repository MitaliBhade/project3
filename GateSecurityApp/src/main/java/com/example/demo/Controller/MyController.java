package com.example.demo.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.VisitInfo;
import com.example.demo.dao.InfoRepo;

@Controller
public class MyController {
	
	@Autowired
	InfoRepo Repo;

	@RequestMapping("/")
	//@ResponseBody
	public String HomePage() {
		
		return "home.jsp";
		
	}
	
	@RequestMapping("/addVisitorInfo")
	public String addVisitInfo(VisitInfo visitinfo) {
		
		Repo.save(visitinfo);
		return "Visit_add.jsp";
	}
	
	@RequestMapping("/getVisitor")
	@ResponseBody
	public   List<VisitInfo> getVisitList() {
		
		return Repo.findAll();
		
	}
	
	//@RequestMapping(value= "/getlist/{publicationDate}" ,method = RequestMethod.GET)
	@RequestMapping(value= "/getlist" ,method = RequestMethod.GET)
	@ResponseBody
	public List<VisitInfo> getvisit(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date publicationDate){

		
		return Repo.findAllByPublicationDate(publicationDate);
	}
	//******************to fin matching to given naem *************??
	@RequestMapping(value = "/byname" ,method = RequestMethod.GET)
	@ResponseBody
	public List<VisitInfo> getTop5(@RequestParam String name){
		
		return Repo.findAllByname(name);
	}
	
	@RequestMapping(value = "/by" ,method = RequestMethod.GET)
	@ResponseBody
	public List<VisitInfo> getTop(@RequestParam String building,Integer flat){
		
		return Repo.findAllByBuildingAndFlat(building, flat);
	}
	
	
}
