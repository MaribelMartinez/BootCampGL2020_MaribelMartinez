package spring.coverage.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.model.Example.ExampleBuilder;
import spring.coverage.example.service.impl.ExampleServiceImpl;

@ExtendWith(SpringExtension.class)
public class ExampleServiceTest {

	@InjectMocks
	private ExampleServiceImpl exampleService;
	
	@Mock
	List<Example> result;
	
	ExampleBuilder example;
	Example example2;
	
	@BeforeEach
	void setUp() {
		example = Example.builder();
		example.build().setId(10);
		example2 = example.build();
		example2.setId(10);	
	}

	@Test
	void getAllExamplesTest() {

		List<Example> result = this.exampleService.getAllExamples();
		assertThat(result).isNotNull();
	}
	
	/*
	 * @Test void getAllExamplesTestError() {
	 * when(result.isEmpty()).thenReturn(true);
	 * assertNull(exampleService.getAllExamples()); }
	 */

	@Test
	void getExampleById() {

		assertThat(exampleService.getById(0)).isNotNull();
	}

	
	@Test
	void createExample() {
	
		assertTrue(exampleService.createExample(example2));
	}
	
	@Test
	void createExampleThrows() {
		ExampleBuilder example = Example.builder();
		assertThrows(UnsupportedOperationException.class, () -> exampleService.createExample(example.build()));
	}
}
