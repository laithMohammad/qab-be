package com.qa.fun.qa.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Answer extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ANSWER_CONTENT")
	private String answerContent;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QUESTION_ID", nullable = false)
	private Question question;
}
