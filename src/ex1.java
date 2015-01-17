import java.util.LinkedList;



public class ex1 {
	public static boolean equalList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		boolean result;
		if(l1.isEmpty() && l2.isEmpty()) {
			result=true;
		}
		else if(!l1.isEmpty() && l2.isEmpty()) {
			result=false;
		}
		else if(l1.isEmpty() && !l2.isEmpty()) {
			result=false;
		}
		else {
			if(l1.getFirst() == l2.getFirst()) {
				l1.removeFirst();
				l2.removeFirst();
				result=equalList(l1,l2);
			}
			else result=false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> check = new LinkedList<Integer>();
		check.add(1);
		check.add(23);
		check.add(54);
		check.add(5);
		check.add(123131);
		LinkedList<Integer> check2 = (LinkedList<Integer>) check.clone();
		System.out.println(check);
		System.out.println(check2);
		LinkedList<Integer> check3 = new LinkedList<Integer>();
		check3.add(1);
		check3.add(23);
		check3.add(54);
		check3.add(5);
		check3.add(3131);
		if (equalList(check,check2)) System.out.println("True");
		else System.out.println("False");
	}
}
