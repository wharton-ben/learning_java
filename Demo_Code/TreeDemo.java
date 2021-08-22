public class TreeDemo {

  static int height1 = 5;

  public static void main(String[] args) {
	  //CutDownTreeIterative(height1);
	  CutDownTreeRecursive(height1);

  }

  static void CutDownTreeIterative(int height){
  	for (int i = height; i > 0; i--)
  	   height = height - 1;
    System.out.println("Tree cut down, Height  is " + height );
  }

  static int CutDownTreeRecursive(int height){
	 if (height == 0){    //Base case
		 System.out.println("Recursive tree is cut down.");
	     return height;
	 }
	 else //General case
	     return CutDownTreeRecursive(height-1);
  }
}//end TreeDemo.java
