/*

*/

import java.util.Iterator;
import java.util.NoSuchElementException;

/**

*/
public class WeirdIterator<T> implements Iterator<T>
{
   // What fields do you need?



   public WeirdIterator(WeirdArray<T> wa)
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
