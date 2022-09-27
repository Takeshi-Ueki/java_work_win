package lesson4_10;

public class Train extends Vehicle {
	public Train(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("電車の乗客：" + crewNum);
	}
}
