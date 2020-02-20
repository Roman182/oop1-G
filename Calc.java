package lab3;

public class Calc {

	public Calc() 
    {
	
		
	}
	
	
	
	
    public Calc(double num1, double num2) 
    {
	
		this.num1 = num1;
		this.num2 = num2;
	}
    
	private double num1;
    private double num2;
    
    public double add ()
    
    {
    	
    	return num1+num2;
    }
    
   public double sub ()
    
    {
    	
    	return num1-num2;
    }
   
   public double multi ()
   
   {
   	
   	return num1*num2;
   }
   
   
   public double div ()
   
   {
   	
   	return num1/num2;
   }



   
  public String toString()

{
	return "Calc [num1=" + num1 + ", num2=" + num2 + "]";
	
}
   
   
   
   
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
