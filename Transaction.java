class Payment

{
	
 boolean payment;
	
 public void status()
{
		
 payment=false;
		
 System.out.println("PAYMENT STATUS:"+payment);	

	
}

}

 class NetBanking extends Payment

{
	
 public void netBank()
	
{
		
  System.out.println("PAYMENT Type: NetBanking");
		
	
}



}

 class DebitCard extends Payment

{
	
  public void debitCard()

{ 		
 System.out.println("PAYMENT Type:DebitCard");
		
	
}



}

 class UPI extends Payment

{
	
  public void UPI()
	
{
		
  System.out.println("PAYMENT Type:UPI");
		
	
}



}

 class Transaction

{
	
 public static void main(String[] ar)
	
 {

		
  DebitCard p2=new DebitCard();
		
  p2.debitCard();
		
  UPI p1=new UPI();
		
  p1.UPI();
		
   NetBanking p=new NetBanking();
		
  p.status();
	
 

}}