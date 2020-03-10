package com.qa.fun.qa.controllers;

import com.qa.fun.qa.model.QuestionRepo;
import com.qa.fun.qa.model.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionRepo questionRepo;
	
	@RequestMapping({"/question/create", "question/update"})
	public void createQuestion(Question question) {
		questionRepo.save(question);
	}
	
	@RequestMapping("question/list/all")
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}
	
	@RequestMapping("question/list/{id}")
	public Question getQuestion(@PathVariable String id) {
		return questionRepo.findById(Long.parseLong(id)).orElse(null);
	}
}
