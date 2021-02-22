package ru.konry.spherometr;

public enum SpherBigData {
	
	RING_1(45.0473, 3.158),
	RING_2(74.9673, 3.159),
	RING_3(109.9832, 3.157),
	RING_4(149.982, 3.160);

	private double ringRad;
	private double ballRad;

	SpherBigData(double ringRad, double ballRad) {
		this.ringRad = ringRad;
		this.ballRad = ballRad;
	}

	double getRingRad() {
		return this.ringRad;
	}

	double getBallRad() {
		return this.ballRad;
	}

}
