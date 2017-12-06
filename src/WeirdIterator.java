/**
 ----------------------------------
 | Program created by Tushar Sharma.|
 | CS27500 Homework 5               |
 | Email: sharm191@pnw.edu          |
 | File Info: WeirdIterator Class   |
 ----------------------------------
 */
import java.util.NoSuchElementException;
import java.util.Iterator;
public class WeirdIterator<T> implements Iterator<T> {
    private WeirdArray<T> wrdArray;
    private int index;
    private int[] newWrd;
    /**
     * @param wa Once the instance variables are initialized. It will set the middle item of wrdArray equal to the first
     *           element of newWrd array.
     *           And then it steps through and fills in newWrd
     *           and
     *           Also fills it in with the correct order.
     *           A constructor that takes a reference to a WeirdArray<T> object. The object that it is going to iterate through.
     */
    public WeirdIterator(WeirdArray<T> wa) {
        wrdArray = wa;
        index = 0;
        newWrd = new int[wrdArray.getLength()];
        if (this.wrdArray.getLength() % 2 == 0) {
            int middle = (wrdArray.getLength() / 2) - 1;
            newWrd[0] = middle;
/* fill in first half **/
            for (int x = 2; x < wrdArray.getLength(); x += 2) {
                newWrd[x] = --middle;
            }
            middle = (wrdArray.getLength() / 2) - 1;
/*fill in the second half **/
            for (int x = 1; x < wrdArray.getLength(); x += 2) {
                newWrd[x] = ++middle;
            }
        }
/*if the WeirdArray is odd**/
        else {
            int middle = wrdArray.getLength() / 2;
            newWrd[0] = middle;
/*fills in the first half of the array**/
            for (int x = 1; x < wrdArray.getLength(); x += 2) {
                newWrd[x] = --middle;
            }
            middle = wrdArray.getLength() / 2;
/*fills in the second half of the array**/
            for (int x = 2; x < wrdArray.getLength(); x += 2) {
                newWrd[x] = ++middle;
            }
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