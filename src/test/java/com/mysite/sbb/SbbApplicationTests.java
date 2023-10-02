package com.mysite.sbb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Assertions.assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = questionRepository.findById(1);
		Assertions.assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		Assertions.assertEquals(1, this.questionRepository.count());

	}
}
