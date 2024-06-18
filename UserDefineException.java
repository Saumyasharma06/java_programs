class CheckAgeException extends Exception 
{ 
 String msg; 
 CheckAgeException(String msg)  
   { 
   this.msg=msg; 
   } 
   public String toString() 
     { 
      return msg; 
     } 
  
} 
class CanVote 
{ 
 int age; 
 void checkAge(int age) throws CheckAgeException 
 { 
  if(age<18) 
  { 
   throw new CheckAgeException("your age should be greater then 18"); 
  } 
  else 
  { 
   System.out.println("you can vote"); 
  } 
 } 
} 
public class UserDefineException { 
 
 public static void main(String[] args) { 
   
  CanVote v = new CanVote(); 
  try { 
   v.checkAge(13); 
  } catch (CheckAgeException e) { 
   
   System.out.println(e.toString()); 
  } 
 } 
 
}

