package ru.konry.spherometr;


class CalculatorConvex {

	public static double calcRadius(double clearance, double ringRad, double ballRad) {
		
		double term_1 = ringRad * ringRad / clearance;
		double term_2 = clearance / 2;

		return term_1 + term_2 - ballRad;
	}

	public static double calcClearance(double radius, double ringRad, double ballRad) {
		
		double tmpSum = radius + ballRad;
		double rootExp = tmpSum * tmpSum - ringRad * ringRad;

		return tmpSum - Math.sqrt(rootExp);
	}
	
}