class Main {
  
  public static void main(String[] args) {
   Sugar tree = new Sugar("tree",false);
   tree.cutShapes(tree.getShape(),10);
   tree.bakeCookies(350, 12);
   tree.decorate();
   
   Sugar aCookie = new Sugar();
   aCookie.decorate();
    
   
  }
    

  
}