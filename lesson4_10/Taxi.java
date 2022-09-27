package lesson4_10;

public class Taxi extends Vehicle implements Stopable {
	public Taxi(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("タクシーの乗客:" + crewNum);
	}
	
	public void stop() {
		System.out.println("ここで降ります。");
	}
}
