/*

*/

import java.util.Iterator;
import java.util.NoSuchElementException;

/**

*/
public class WeirdIterator2<T> implements Iterator<T>
{
   // What fields do you need?



   public WeirdIterator2(WeirdArray<T> wa)
   {



   }


   public boolean hasNext()
   {



   }


   public T next()
   {
      if ( hasNext() )
      {


      }
      else
         throw new NoSuchElementException();
   }


   public void remove()
   {
      throw new UnsupportedOperationException();
   }
}
