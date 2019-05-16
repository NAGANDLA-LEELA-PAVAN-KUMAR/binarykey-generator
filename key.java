import java.util.*; 

public class HelloWorld{

   
 public static void main(String[] args) {
    
    String listString = "";
   
     for(int i=0;i<64;i++){
     
       Double r=Math.random();
   
         for(int j=0;j<1;j++){
     
           if(r<=0.42886668963141583){
    
                listString +=Integer.toString(0);
       
             break;
              
  }
          
      else{
       
             listString +=Integer.toString(1);
  
                  break;
         
       }
        
    }
     
   }
    
    System.out.println(listString);
       
 System.out.println("string length is: "+listString.length());
 
  }
}