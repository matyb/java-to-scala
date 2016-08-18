package com.javatoscala;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IfHeavyLogicTest {

	static class Food {
		private String type, size;
		private Food(String type, String size){
			this.type = type;
			this.size = size;
		}
	}
	
	private static String shouldIEatIt(Food food) {
		if(food.type.equals("pizza") && food.size.equals("huge")) {
			return "Cowabunga dude";
		}else if(food.type.equals("pizza")) {
	    	return "EAT MORE PIZZA - The Ninja Turtles";
	    }else if(food.size.equals("teeny tiny")) {
	    	return "Be careful";
	    }else if(food.type.equals("tacos") && food.size.equals("huge")) {
	    	return "Ah dios mio!";
	    }else if(food.type.equals("bananas")) {
	    	return "Not cheap for long";
	    }else if(food.type.equals("rice")) {
	    	return "Carbs were good for you in the 90's";
	    }
	    return "Could be poisenous";
	}
	
	@Test
	public void testABunchOfIfStatements() {
		List<Food> foods = asList(
				new Food("tacos", "huge"), 
				new Food("pizza", "huge"), 
				new Food("rice", "small"), 
		        new Food("brussel sprouts", "teeny tiny"), 
		        new Food("fingernails", "huge"));
		List<String> responses = new ArrayList<String>();
		for(Food food : foods){
			responses.add(shouldIEatIt(food));
		}
		assertEquals(asList("Ah dios mio!",
							"Cowabunga dude",
							"Carbs were good for you in the 90's",
							"Be careful",
							"Could be poisenous"), responses);
	}
	
}
