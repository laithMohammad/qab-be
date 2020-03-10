package com.qa.fun.qa.model;

import com.qa.fun.qa.model.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepo extends JpaRepository<Answer, Long> {}