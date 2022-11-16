public class Code3{
  public static void main(String[] args){
    firstTriangle();
    }
  public static void firstTriangle() {
    int rowCount=1; 
    for (int i = 5; i > 0; i--){ 
      for (int j = 1; j <= i; j++){
        System.out.print(" ");
        } 
      for (int j = 1; j <= rowCount; j++){
        System.out.print(j+" "); 
       }
      System.out.println();
      rowCount++;
     }
   }
}