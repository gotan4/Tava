package day17;
import java.util.*;
public class Test09 {

	public Test09() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("-----------------------------");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�ټ�", "010-9999-9999");
		map.put("������", "010-3333-3333");
		map.put("����", "010-5555-5555");
		map.put("�ú�", "010-2222-2222");
		
		Set<String> key = map.keySet();
		
		ArrayList<String> kList = new ArrayList<String>(key);
		for (String k : kList) {
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("-----------------------------");
		System.out.println();
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<String, String> ent  = itor.next();
			String k = itor.next().getKey();
			String val = itor.next().getValue();
			
			System.out.println(k + " : " + val);
			
		}
		
	}

	public static void main(String[] args) {

		new Test09();
	}

}
