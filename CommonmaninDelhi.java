package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonmaninDelhi implements TrafficRulesDelhi,TrafficRules{

	public static void main(String[] args) {
		CommonmaninDelhi dc = new CommonmaninDelhi();
		dc.dontGoByDieselVehicle();
		dc.goByBicycle();
		dc.goByDieselVehicle();
		// TODO Auto-generated method stub

	}

	@Override
	public void dontGoByDieselVehicle() {
		System.out.println("dont use the diesel vehicle");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("use bycycle");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("used in chennai");
		// TODO Auto-generated method stub
		
	}

}
