public class DeckOfCardsTest
{
   // execute application
   public static void main( String args[] )
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle();
      
      Card[] hand = { new Card( "10", "Diamonds" ),
                      new Card( "Q", "Diamonds" ),
                      new Card( "J", "Diamonds" ),
                      new Card( "K", "Diamonds" ),
                      new Card( "9", "Diamonds" ) };
      
      for( int i = 0; i < 5; i++ )
        System.out.println( hand[ i ] );
        
      System.out.println( myDeckOfCards.pair( hand ) );
      System.out.println( myDeckOfCards.twoPair( hand ) );
      System.out.println( myDeckOfCards.threeOfAKind( hand ) );
      System.out.println( myDeckOfCards.fourOfAKind( hand ) );
      System.out.println( myDeckOfCards.flush( hand ) );
      System.out.println( myDeckOfCards.straight( hand ) );
      System.out.println( myDeckOfCards.fullHouse( hand ) + "\n" );
   } // end main
} // end class DeckOfCardsTest