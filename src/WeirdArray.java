/**
 ----------------------------------
 | Program created by Tushar Sharma.|
 | CS27500 Homework 5               |
 | Email: sharm191@pnw.edu          |
 | File Info: WeirdArray Class      |
 ----------------------------------
 */
import java.util.Iterator;
public class WeirdArray<T> implements Iterable<T>
{
    private Object[] theArray;
    public WeirdArray(int n)
    {
        theArray = new Object[n];
    }
    @SuppressWarnings("unchecked")
    public T getElement(int i)
    {
        return (T) theArray[i];
    }
    public void setElement(int i, T e)
    {
        theArray[i] = e;
    }
    public int getLength()
    {
        return theArray.length;
    }
/**
 Implement the Iterable<T> interface.
 */
    public Iterator<T> iterator()
    {
        return new WeirdIterator<>(this);
    }
}