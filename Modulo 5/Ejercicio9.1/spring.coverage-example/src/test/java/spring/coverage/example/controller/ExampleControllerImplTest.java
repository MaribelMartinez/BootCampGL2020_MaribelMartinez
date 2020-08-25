package spring.coverage.example.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.model.Example.ExampleBuilder;
import spring.coverage.example.service.ExampleService;

@ExtendWith(MockitoExtension.class)
public class ExampleControllerImplTest {

	@InjectMocks
	private ExampleController exampleController;
	
	@Mock
	private ExampleService exampleService;
	
	ExampleBuilder example;
	Example example2;
	
	List<Example> examples = new ArrayList<Example>();
	
	@BeforeEach
	void setUp() {
		example = Example.builder();
		example.build().setId(10);
		example2 = example.build();
		example2.setId(10);	
		examples.add(example.build());
		examples.add(example2);
	}


	@Test
	void getExampleByIdTest() {

		final Example response = this.exampleController.getExampleById(2347);
		assertThat(response).isNull();

	}
	
	@Test
	void getAllExamples() {

		when(exampleService.getAllExamples()).thenReturn(examples);
		assertEquals(examples, exampleController.getAllExamples());
	}
	
	
	@Test
	void createExample() {

		when(exampleService.createExample(example2)).thenReturn(true);
		assertTrue(exampleController.createExample(example2));
	}
	
	
	@Test
	void createExampleFalse() {

		when(exampleService.createExample(example.build())).thenThrow(UnsupportedOperationException.class);
		assertFalse(exampleController.createExample(example.build()));
	}
}
