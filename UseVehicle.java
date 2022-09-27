import lesson4_10.Bus;
import lesson4_10.Stopable;
import lesson4_10.Taxi;
import lesson4_10.Train;
import lesson4_10.Vehicle;

class UseVehicle {
	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		v[0] = new Taxi(4);
		v[1] = new Train(160);
		v[2] = new Bus(80);
		
		for (int i = 0; i < v.length; i++) {
			v[i].showCrewNum();
			if (v[i] instanceof Stopable) {
				Stopable s = (Stopable)v[i];
				s.stop();
			}
		}
	}
}
