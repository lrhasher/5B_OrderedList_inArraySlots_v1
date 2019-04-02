/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,] 1"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-10,] 2"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-10,5,] 3"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,] 4"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,] 5"
               );


       getOne( "get an element from the front"
              , 0
              ,-11
              );

       getOne( "get an element from the back"
              , 4
              , 5
              );

       getOne( "get an element from the middle"
              , 3
              , 2
              );


      removeOne( "remove an element from front"
             , 0
             ,"[0,0,2,5,] 4"
             );

      removeOne( "remove an element from back"
             , 3
             ,"[0,0,2,] 3"
             );

      removeOne( "remove an element from middle"
             , 1
             ,"[0,2,] 2"
             );

    }


    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check
        System.out.println(
            "result:   "
          + orderedList + " " + orderedList.size()
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }

     private static void getOne( String description
                               , int index
                               , int expect
                               ) {
         System.out.println( description);

         // check
         System.out.println(
             "result:   " +
         orderedList.get( index)
           + " ...expecting "
           + expect
           + System.lineSeparator());
      }


      private static void removeOne( String description
                                , int index
                                , String expect
                                ) {
          System.out.println( description);
          orderedList.remove( index);

          // check
          System.out.println(
              "result:   "
            + orderedList + " " + orderedList.size()
            + " ...expecting "
            + expect
            + System.lineSeparator());
       }

}
