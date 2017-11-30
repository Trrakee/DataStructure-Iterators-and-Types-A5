import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**

 */
public class WeirdIterator<T> implements Iterator<T>
{
    // What fields do you need?
    int current = 0;


    public <T> WeirdIterator(WeirdArray<T> wa)
    {
        WeirdArray<T> array = new WeirdArray<>(this.wa);
    }

   public boolean hasNext() {
        return current < array.this.values.length;
    }


    // return the next element of the iteration and move the current
    // index to the element after that.
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return values[current++];
    }

    // Return the value at a given index
    public T get(int index) {
        return array[index];
    }

    // Set the value at a given index
    public void set(int index, T value) {
        values[index] = value;
    }

    // Return the length of the array
    public int length() {
        return values.length;
    }

    // Return an iterator over the elements in the array. This is generally not
    // called directly, but is called by Java when used in a "simple" for loop.
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }


    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
