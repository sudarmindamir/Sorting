import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Pembuatan HashTable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Menambahkan "key"
   hashtable.put("Key1","Uchiha Sudarmin");
   hashtable.put("Key2","Uzumaki Farham");
   hashtable.put("Key3","Haruno Reni");
   hashtable.put("Key4","Uchiha Madara");
   hashtable.put("Key5","Kotlin");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}
