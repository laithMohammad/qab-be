package com.qa.fun.qa.model;

import com.qa.fun.qa.model.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {}