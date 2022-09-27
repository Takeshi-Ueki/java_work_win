package lesson4_10;

public class Bus extends Vehicle implements Stopable {
	public Bus(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("バスの乗客：" + crewNum);
	}
	
	public void stop() {
		System.out.println("次止まります");
	}
}
