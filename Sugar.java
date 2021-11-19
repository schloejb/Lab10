class Sugar extends Cookie {
   String shape;
   boolean decorated;

  Sugar(){
    shape = "";
    decorated = false;
  }
  Sugar(String aShape, boolean aDecorated){
    shape = aShape;
    decorated = aDecorated;
  }
  String getShape(){
    return shape;
  }
  void setShape(String newShape){
    shape = newShape;
  }
  void cutShapes(String shape, int num){
    System.out.println(num + " cookies were cut into " + shape);
  }
   void decorate(){
    if (baked == true){
      System.out.println("The cookies were decorated.");
    
    }
    else if (baked == false) {
      System.out.println("Make sure to bake the cookies first.");
    }
  }
}