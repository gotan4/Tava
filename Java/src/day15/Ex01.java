package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	¹®Á¦1]
 		
 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­ 
 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
 		ÀÌ¸ŞÀÏ Çü½ÄÀº 
 			¾ËÆÄºª°ú ¼ıÀÚ·Î 8±ÛÀÚÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò
 			
 		·Î Ã³¸®ÇÏ¼¼¿ä.
 			
 			Âü°í]
 				ÇÑ±Û Ã³¸® : [°¡-ÆR] - ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö¸¶¼¼¿ä.
 				
 				
 */
public class Ex01 {
	public Ex01() {
		String email = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏ ÁÖ¼Ò¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		
		Pattern pattern = Pattern.compile("^[a-z0-9]{+8}*@[a-z0-9]{5}+\\.[a-z0-9]{3}$ ") ;//ÀÌ¸ŞÀÏ Á¤±Ô½Ä
		
		Matcher match = pattern.matcher(email);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
		} else {
			JOptionPane.showMessageDialog(null, "Àß¸øµÈ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
		}

	}

	public static void main(String[] args) {
		// TODO ÀÚµ¿ »ı¼ºµÈ ¸Ş¼Òµå ½ºÅÓ
		new Ex01();

	}

}
