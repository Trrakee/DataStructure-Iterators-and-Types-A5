/**
 ----------------------------------
 | Program created by Tushar Sharma.|
 | CS27500 Homework 5               |
 | Email: sharm191@pnw.edu          |
 | File Info: WeirdIterator2 Class  |
 ----------------------------------
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
public class WeirdIterator2<T> implements Iterator<T> {
    private WeirdArray<T> wrdArray;
    private int index;
    private int[] newWrd;

    public WeirdIterator2(WeirdArray<T> wa) {
        wrdArray = wa;
        index = 0;
        newWrd = new int[wrdArray.getLength()];
        int start = 0;
/*fills in the first half of the array**/
        for (int x = 0; x < wrdArray.getLength(); x += 2) {
            newWrd[x] = start++;
        }
        int end = wrdArray.getLength() - 1;
/*fills in the second half of the array**/
        for (int x = 1; x < wrdArray.getLength(); x += 2) {
            newWrd[x] = end--;
        }
    }
    public boolean hasNext() {
        return (index < wrdArray.getLength());
    }
    public T next() {
        if (hasNext()) {
            return wrdArray.getElement(newWrd[index++]);
        } else
            throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}