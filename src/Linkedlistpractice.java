import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlistpractice {
    public static void main()
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(25);
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
