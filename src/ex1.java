import java.util.LinkedList;
/*
 * That's just a test javadoc for the git branch.
 */
public class ex1 {
	public static boolean equalList(LinkedList<Integer> l1,
			LinkedList<Integer> l2) {
		boolean result;
		if (l1.isEmpty() && l2.isEmpty()) {
			result = true;
		} else if (!l1.isEmpty() && l2.isEmpty()) {
			result = false;
		} else if (l1.isEmpty() && !l2.isEmpty()) {
			result = false;
		} else {
			if (l1.getFirst() == l2.getFirst()) {
				l1.removeFirst();
				l2.removeFirst();
				result = equalList(l1, l2);
			} else
				result = false;
		}
		return result;
	}

	public static boolean member(int x, LinkedList<Integer> s1) {
		// boolean result;
		if (!s1.isEmpty()) {
			if (s1.getFirst() == x) {
				return true;
			} else {
				s1.removeFirst();
				return member(x, s1);
			}
		}
		else return false;
	}
	
	public static boolean subset(LinkedList<Integer> s1, LinkedList<Integer> s2) {
		if (!s1.isEmpty()) {
			if (member(s1.getFirst(),s2)) {
				s1.removeFirst();
				return subset(s1,s2);
			}
			else return false;
		}
		else return true;
	}

	// return result;

	public static void main(String[] args) {
		LinkedList<Integer> check = new LinkedList<Integer>();
		check.add(1);
		check.add(23);
		check.add(54);
		check.add(5);
		check.add(123131);
		check.add(2);
		LinkedList<Integer> check2 = (LinkedList<Integer>) check.clone();
		System.out.println(check);
		System.out.println(check2);
		LinkedList<Integer> check3 = new LinkedList<Integer>();
		check3.add(1);
		check3.add(23);
		check3.add(54);
		check3.add(5);
		check3.add(3131);
	/*	if (equalList(check, check2))
			System.out.println("True");
		else
			System.out.println("False");
			*/

		/*if (member(23,check))
			System.out.println("Is member");
		else
			System.out.println("Not a member");
			*/
		if (subset(check,check2)) 
			System.out.println("Is subset");
		else
			System.out.println("Not a subset");
	}
}
