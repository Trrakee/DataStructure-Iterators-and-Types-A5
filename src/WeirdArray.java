import java.util.Iterator;
public class WeirdArray<T> implements Iterable<T>
{
    private Object[] theArray;
    public WeirdArray(int n)
    {
        int[] array =new int[n];
    }







    /**
     Implement the Iterable<T> interface.
     */
    public Iterator<T> iterator()
    {
        return new WeirdArray();
    }

}
