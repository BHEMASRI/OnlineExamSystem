package com.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TestQuestionDTO{
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getOption1() {
		return option1;
	}

	public void setOption1(int option1) {
		this.option1 = option1;
	}

	public int getOption2() {
		return option2;
	}

	public void setOption2(int option2) {
		this.option2 = option2;
	}

	public int getOption3() {
		return option3;
	}

	public void setOption3(int option3) {
		this.option3 = option3;
	}

	public int getOption4() {
		return option4;
	}

	public void setOption4(int option4) {
		this.option4 = option4;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	@NotEmpty(message="question to be filled")
	private String question;
	
	@NotNull(message="option 1 to be filled")
	private int option1;
	
	@NotNull(message="option 2 to be filled")
	private int option2;
	
	@NotNull(message="option 3 to be filled")
	private int option3;
	
	@NotNull(message="option 4 to be filled")
	private int option4;
	
	@NotNull(message="question number to be filled")
	private int questionNo;
}
