/**
 * 
 */
package mockito.example.services.impl;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.BasicOperationsService;
import mockito.example.services.CalculatorService;
import mockito.example.services.DataService;

public class CalculatorServiceImpl implements CalculatorService, DataService {
	private DataService dataService;
	private BasicOperationsService basicOperationsService;
	private int[] listOfNumbers;

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return this.dataService;
	}

	@Override
	public double calculateSum(int a, int b) {
		return basicOperationsService.add(a, b);
	}

	@Override
	public double calculateSubstraction(int a, int b) {
		return basicOperationsService.subtract(a, b);
	}

	@Override
	public double calculateDivision(int a, int b){
		try {
			if (b == 0) {
				throw new ZeroDivisionException("No se puede dividir por 0");
			} else {
				return basicOperationsService.divide(a, b);
			}
		} catch (ZeroDivisionException e) {
			System.err.println(e.getMessage());
			return 0.0;

		}
	}

	@Override
	public double calculateMultiplication(int a, int b) {
		return basicOperationsService.multiply(a, b);
	}

	@Override
	public double calculateAverage() {
		int[] numbers = this.getDataService().getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	@Override
	public boolean isOdd(int a) {
		if (a % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String printResult(double result) {
		String textToDisplay = "El resultado es: " + result;
		System.out.print(textToDisplay);
		return textToDisplay;
	}

	public void setListOfNumbers(int[] listOfNumbers) {
		this.listOfNumbers = listOfNumbers;
	}
	
	@Override
	public int[] getListOfNumbers() {
		return listOfNumbers;
	}

}
