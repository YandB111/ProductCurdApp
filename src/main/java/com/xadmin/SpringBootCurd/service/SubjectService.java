package com.xadmin.SpringBootCurd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCurd.bean.Subject;
import com.xadmin.SpringBootCurd.repo.SubjectRepo;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepo subjectrepo;

// find all method to find all data and iterate it 
	// from our database
	public List<Subject> getAllSubject() {
		List<Subject> lst = new ArrayList<>();
		subjectrepo.findAll().forEach(lst::add);
		return lst;
	}
	
	//add subject
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectrepo.save(subject);
		
	}

	//update method
	public void updateSubject(String id,Subject subject) {
		// TODO Auto-generated method stub
		subjectrepo.save(subject);
	}
// delete subject by id
	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		subjectrepo.deleteById(id);
	}
}
