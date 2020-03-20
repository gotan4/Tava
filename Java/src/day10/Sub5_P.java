package day10;


public class Sub5_P {


	public static void main(String[] args) {
		String[] name = {
				"¹Ú±¤È£", "¹Ú±âÀ±", "¾ÈÈ«ÁÖ", "±è¼Ò¿µ", "ÀÌÁø¼ö"
		};
		Sub5[] ban = new Sub5[5];
		for (int i = 0; i < ban.length; i++) {
			ban[i] = new Sub5(name[i]);
			
		}
		for (int i = 0; i < ban.length; i++) {
			ban[i].toPrint();
		}
	}

}
