package homework_git_10;

public class Applic_3 {
	public static void main(String[] args) {
	    int [] array = {12,4,45,6,21,79,3,5,6,7};
	    int min;
	    int max;
	      min = array[0];
	      max = min;
	      System.out.println("---------------------");
	      for (int i = 0; i < array.length; i++) {
	          if (array[i] > max) {
	            max = array[i];
	          }
	          if (array[i] < min) {
	            min = array[i];
	          }
	          System.out.println(array[i]);
	      }
	      System.out.println("---------------------");
	      
	    System.out.println("min="+min);
	    System.out.println("max="+max);
 }
}
