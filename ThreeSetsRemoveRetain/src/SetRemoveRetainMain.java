import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//There are 3 sets of integers A, B, and C.
//Return items that are in common between A and C.
//Do not return items contained in B.
public class SetRemoveRetainMain {

	public static void main(String[] args) {
		// Create 3 Sets of integers.
		Set<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		Set<Integer> B = new HashSet<Integer>();
		B.add(3);
		Set<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		C.add(3);
		C.add(4);
		//Remove the values contained in B from A and C.
		A.removeAll(B);
		C.removeAll(B);
		//Values that are common between A and C will be retained into A.
		A.retainAll(C);
		
		//Will iterate through Set A printing retained values 1 and 2.
		Iterator<Integer> it = A.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
