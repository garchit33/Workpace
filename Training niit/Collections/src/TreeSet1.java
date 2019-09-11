import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 implements Comparator {
	
//	public int Compare(Object o1, Object o2) {
//		
//		Integer i1= (Integer)o1;
//		Integer i2=(Integer)o2;
//		if(i1<i2)
//			return +1;
//		if(i1>i2)
//			return -1;
//		else
//			return 0;
//		
//	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		Integer i1= (Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		if(i1>i2)
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to customize the TreeSet we can implement Comparator Interface it will implement compare interface.
		//postive will go right side in binary tree and negative will go left side.
		
		TreeSet t1=new TreeSet(new TreeSet1());
		t1.add(4);
		t1.add(3);
		t1.add(0);
		t1.add(12);
		t1.add(-2);
		t1.add(50);
		t1.add(0);                                                             
		System.out.println(t1);
		
		
	}

	//set.headSet(element).size() to find out element in the treeSet.
	
}
