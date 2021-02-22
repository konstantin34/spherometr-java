package ru.konry.spherometr;

class Spherometr {

	private String dataType;
	private double dataValue;
	private String type;
	private String ring;
	
	Spherometr(String dataType, double dataValue, String type, int ring) {
		this.dataType = dataType;
		this.dataValue = dataValue;
		this.type = type;
		this.ring = String.format("RING_%d", ring);
	}

	void spherInfo() {
		System.out.printf("%s spherometr with ring %s save data %s = %f", this.type, this.ring, this.dataType, this.dataValue);
	}
	
}


class SpherometrDemo {

	public static void main(String[] args) {
		
		Spherometr sph_1 = new Spherometr("Radius", 128.342 , "big", 1);

		sph_1.spherInfo();
	}
}
