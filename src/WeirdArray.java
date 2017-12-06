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
    /**
     * A constructor that takes a single integer n and creates an empty array of size n.
     * @param n
     */
    public WeirdArray(int n)
    {
        theArray = new Object[n];
    }
    /**
     * A method that returns a reference to the element of type T stored at index i in the private array.
     * @param i
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getElement(int i)
    {
        return (T) theArray[i];
    }
    /**
     * A method that puts a reference to a T object at index i in the private array.
     * @param i
     * @param e
     */
    public void setElement(int i, T e)
    {
        theArray[i] = e;
    }
    /**
     * A method that returns the length of the private array.
     * @return
     */
    public int getLength()
    {
        return theArray.length;
    }
/**
 Implement the Iterable<T> interface.
 */
    /**
     * Iterator method that returns a reference to a Iterator<T> object. Then constructs
     * and returns a reference to a WeirdIterator<T> object.
     * @return
     */
    public Iterator<T> iterator()
    {
        return new WeirdIterator<>(this);
    }
}