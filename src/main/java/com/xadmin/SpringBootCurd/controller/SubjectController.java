package com.xadmin.SpringBootCurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCurd.bean.Subject;
import com.xadmin.SpringBootCurd.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjser;

	// findall method
	@RequestMapping("/subjects")
	public List<Subject> getAllSubject() {
		return subjser.getAllSubject();
	}

	// create or add subject
	@RequestMapping(method = RequestMethod.POST, value="/subjects" )
	public void addSubject(@RequestBody Subject subject) {
		subjser.addSubject(subject);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/subject/{id}")
	public void UpdateSubject(@PathVariable String id, @RequestBody Subject subject) {
		subjser.updateSubject(id,subject);
	}
	
	// delte method -- by id
	public void DeleteSubject(@PathVariable String id) {
		subjser.deleteSubject(id);
	}
}
