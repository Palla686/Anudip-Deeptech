class PalindromeEx
{  
 public static void main(String args[]){  
  int r,sum=0,rem;    
  int n=232; 
  
  rem=n;    
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(rem==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  