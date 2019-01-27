import java.util.Random;
public class DeckOfCards
{
   private Card deck[]; // array of Card objects
   private int currentCard; // index of next Card to be dealt
   private final int NUM_CARDS = 52; // constant number of Cards
   private Random randomNumbers; // random number generator

   // constructor fills deck of Cards
   public DeckOfCards()
   {
      String faces[] = { "A", "2", "3", "4", "5", "6",  "7", "8", "9", "10", "J", "Q", "K" };
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

      deck = new Card[ NUM_CARDS ];    // create array of Card objects
      currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
      randomNumbers = new Random();            // create random number generator

      // populate deck with Card objects 
      for ( int count = 0; count < deck.length; count++ ) 
         deck[ count ] =  new Card( faces[ count % 13 ], suits[ count / 13 ] );
   } // end DeckOfCards constructor
   
   // shuffle deck of Cards with one-pass algorithm
   public void shuffle()
   {
      // after shuffling, dealing should start at deck[ 0 ] again
      currentCard = 0; // reinitialize currentCard

      // for each Card, pick another random Card and swap them
      for ( int first = 0; first < deck.length; first++ ) 
      {
         int second =  randomNumbers.nextInt( NUM_CARDS );         

         Card temp = deck[ first ];                // swap current Card with randomly selected Card 
         deck[ first ] = deck[ second ];   
         deck[ second ] = temp;            
      } // end for
   } // end method shuffle

   // deal one Card
   public Card dealCard()
   {
      if ( currentCard < deck.length )
         return deck[ currentCard++ ]; // return current Card in array
      else        
         return null; // return null to indicate that all Cards were dealt
   } // end method dealCard
   
   public String pair( Card[] hand )
   {
       int a, b;
       String str = "";       
       
       for( a = 0; a < 5; a++ )
       {
           for( b = a + 1; b < 5; b++ )
           {
               String one = hand[a].getFace();
               String two = hand[b].getFace();
               
               if( one.equals( two ) )
                   str = "Pair";
           }
       }
       return str;
   }
   
   public String twoPair( Card[] hand )
   {
       int a, b, c, d;
       String str = "";       
       
       for( a = 0; a < 5; a++ )
       {
           for( b = a + 1; b < 5; b++ )
           {
               String one = hand[a].getFace();
               String two = hand[b].getFace();
               
               if( one.equals( two ) )
               {
                   for( c = a + 1; c < 5; c++ )
                   {
                       for( d = c + 1; d < 5; d++ )
                       {
                           String three = hand[c].getFace();
                           String four = hand[d].getFace();
                           
                           if( three.equals( four ) )
                               str = "Two Pair";
                       }
                   }
               }
           }
       }
       return str;
   }
   
   public String threeOfAKind( Card[] hand )
   {
       int a, b, c;
       String str = "";    
       
       for( a = 0; a < 5; a++ )
       {
           for( b = a + 1; b < 5; b++ )
           {
               for( c = b + 1; c < 5; c++ )
               {
                   String one = hand[a].getFace();
                   String two = hand[b].getFace();
                   String three = hand[c].getFace();
                   
                   if( one.equals( two ) )
                   {
                       if( two.equals( three ) )
                           str = "Three of a Kind";
                   }
               }
           }
       }
       return str;
   }
   
   public String fourOfAKind( Card[] hand )
   {
       int a, b, c, d;
       String str = "";
       
       for( a = 0; a < 5; a++ )
       {
           for( b = a + 1; b < 5; b++ )
           {
               for( c = b + 1; c < 5; c++ )
               {
                   for( d = c + 1; d < 5; d++ )
                   {
                       String one = hand[a].getFace();
                       String two = hand[b].getFace();
                       String three = hand[c].getFace();
                       String four = hand[d].getFace();
                       
                       if( one.equals( two ) )
                       {
                           if( two.equals( three ) )
                           {
                               if( three.equals( four ) )
                                   str = "Four of a Kind";
                           }
                       }
                   }
               }
           }
       }
       return str;
   }
   
   public String flush( Card[] hand )
   {
       String one = hand[0].getSuit();
       String two = hand[1].getSuit();
       String three = hand[2].getSuit();
       String four = hand[3].getSuit();
       String five = hand[4].getSuit();
       String str = "";
       
       if( one.equals( two ) && two.equals( three ) && three.equals( four ) && four.equals( five ) )
           str = "Flush";
           
       return str;
   }
   
   public String straight( Card[] hand )
   {
       String str = "";
       
       int[] array = new int[ 5 ];
       
       for( int i = 0; i < 5; i++ )
       {
           String receive = hand[i].getFace();
           
           if( receive.equals( "A" ) )
               array[i] = 1;
           if( receive.equals( "2" ) )
               array[i] = 2;
           if( receive.equals( "3" ) )
               array[i] = 3;
           if( receive.equals( "4" ) )
               array[i] = 4;
           if( receive.equals( "5" ) )
               array[i] = 5;
           if( receive.equals( "6" ) )
               array[i] = 6;
           if( receive.equals( "7" ) )
               array[i] = 7;
           if( receive.equals( "8" ) )
               array[i] = 8;
           if( receive.equals( "9" ) )
               array[i] = 9;
           if( receive.equals( "10" ) )
               array[i] = 10;
           if( receive.equals( "J" ) )
               array[i] = 11;
           if( receive.equals( "Q" ) )
               array[i] = 12;
           if( receive.equals( "K" ) )
               array[i] = 13;          
       }
       
       for( int i = 0; i < 25; i++ )
       {
           for( int j = 1; j < 5; j++ )
           {
               if( array[j] < array[ j - 1 ] )
               {
                   int temp = array[j];
                   array[j] = array[ j - 1 ];
                   array[ j - 1 ] = temp;
               }
           }
       }
       
       for( int i = 1; i < 5; i++ )
       {
           if( array[i] - 1 != array[i - 1] )
               break;
           else if( i == 4 )
               str = "Straight";
       }
       
       return str;
   }
   
   public String fullHouse( Card[] hand )
   {
       String str = "";       
       
       int[] array = new int[ 5 ];
       
       for( int i = 0; i < 5; i++ )
       {
           String receive = hand[i].getFace();
           
           if( receive.equals( "A" ) )
               array[i] = 1;
           if( receive.equals( "2" ) )
               array[i] = 2;
           if( receive.equals( "3" ) )
               array[i] = 3;
           if( receive.equals( "4" ) )
               array[i] = 4;
           if( receive.equals( "5" ) )
               array[i] = 5;
           if( receive.equals( "6" ) )
               array[i] = 6;
           if( receive.equals( "7" ) )
               array[i] = 7;
           if( receive.equals( "8" ) )
               array[i] = 8;
           if( receive.equals( "9" ) )
               array[i] = 9;
           if( receive.equals( "10" ) )
               array[i] = 10;
           if( receive.equals( "J" ) )
               array[i] = 11;
           if( receive.equals( "Q" ) )
               array[i] = 12;
           if( receive.equals( "K" ) )
               array[i] = 13;
       }
       
       for( int i = 0; i < 25; i++ )
       {
           for( int j = 1; j < 5; j++ )
           {
               if( array[j] < array[ j - 1 ] )
               {
                   int temp = array[j];
                   array[j] = array[ j - 1 ];
                   array[ j - 1 ] = temp;
               }
           }
       }
       
       if( ( array[0] == array[1] ) && ( array[2] == array[3] ) && ( array[3] == array[4] ) ) 
           str = "Full House";       
       
       if( ( array[0] == array[1] ) && ( array[1] == array[2] ) && ( array[3] == array[4] ) )
           str = "Full House";
            
       return str;
   }
} // end class DeckOfCards