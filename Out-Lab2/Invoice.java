
/**
 * Samuel Harkness
 * Sets the accessors, mutator, constructor, and the toString method
 * Out-lab #2
 * 160 - 07
 * 9-23-05 
 */
public class Invoice
{
	//instance variables
	String partNumber, partDesc;
	int quantity;
	double price;
	
	//constructor
	Invoice()
	{ 
	  partNumber = "";
	  partDesc = "";
	  quantity = 0;
	  price = 0.0;	  
    }
    
    //accessors
	public String getPartNumber()
	{ return partNumber; }
	
	public String getPartDesc()
	{ return partDesc; }
	
	public int getQuantity()
	{ return quantity; }
	
	public double getPrice()
	{ return price; }
	
	//accessor: returns the total price of the invoice
    public double getInvoiceAmount()
    { 
        if( quantity < 0)//resets quantity to 0 if the value was negative
        { quantity = 0; }
        
        if( price < 0.0)//resets price to 0 if the value was negative
        { price = 0.0; }
        
        return quantity * price;
    }
		
	//mutators
	public void setPartNumber( String prtNmbr )
	{  partNumber = prtNmbr; }
	
	public void setPartDesc( String prtDsc )
	{ partDesc = prtDsc; }
	
	public void setQuantity( int qunty )
	{ quantity = qunty; }
	
	public void setPrice( double prce )
	{ price = prce; }
	
	public String toString()
    {
        String temp = "";
        temp = "Part number: " + partNumber + ", Description: " + partDesc;
        temp = temp + ", Quantity: " + quantity + ", Price: " + price;
        return temp;
    }
}//end class
