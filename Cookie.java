class Cookie {
  int num;
  int temp;
  int mins;
  boolean baked = false;
  
  Cookie(){
    num = 0;
    temp = 0;
    mins = 0;
    baked = false;
  }
  Cookie(int number, int bakeTemp, int bakeTime, boolean isReady){
    num = number;
    temp = bakeTemp;
    mins = bakeTime;
    baked = isReady;
  }
  boolean getIsReady(){
    return baked;
  }
  
  void setNum(int number){
    num = number;
  }
    void bakeCookies(int bakeTemp, int bakeTime){
    System.out.println("The cookies were baked at "+ bakeTemp + " degrees F for " + bakeTime + " minutes");
    baked = true;
    
    
  }
}