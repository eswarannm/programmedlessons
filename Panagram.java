 public class Panagram {  

      public static void main(String[] args) {  
           String sentence = "Amazingly few discotheques provide jukeboxes.";  
           System.out.println(checkPanagram(sentence.toLowerCase()));
      }  
      private static boolean checkPanagram(String sentence) {  
           if (sentence.length() < 26)  
                return false;  
           else {  
                for (char ch = 'a'; ch <= 'z'; ch++) {  
                     if (sentence.indexOf(ch) < 0) {  
                          return false;  
                     }  
                }  
           }  
           return true;  
      }  
 }  