package wang.lvshang.three;

import wang.lvshang.three.ceiling.LevelOneCeiling;
import wang.lvshang.three.coat.DuluxCoat;
import wang.lvshang.three.service.Building;
import wang.lvshang.three.service.iml.House;

public class Main {

	public static void main(String[] args) throws Exception {

		Matter ceiling = new LevelOneCeiling();
		Matter coat = new DuluxCoat();

		//创建装修1风格
		Building house  = new House();
		house.setCoat(coat);
		house.setCeiling(ceiling);
		System.out.println(house.getCoat());
		System.out.println(house.getCeiling());


	}
}



