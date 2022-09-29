package package3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
	List<Float> list= new ArrayList<>();
	float sum=0;
	list.add(3.2f);
	list.add(4.5f);
	list.add(1.1f);
	list.add(2.2f);
	list.add(3.3f);
	Iterator<Float> it=list.iterator();
	while(it.hasNext()) {
		sum=sum+it.next();
	}
System.out.println("Sum of elements in list is:" + sum);
}
}
