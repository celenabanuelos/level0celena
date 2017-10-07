PImage donkey;
PImage tail  ;
void setup(){
  //at top of sketch  
  size(217,232);
//Copy this stuff into the setup()method.  
donkey = loadImage("images.jpeg");    
background(donkey);
tail = loadImage("tails.png");  //in the setup method
tail.resize(50, 50);    //in setup method

}
void draw(){
if( mousePressed){
image(tail, mouseX-20, mouseY);  //in your draw method
rect(30,20,50,55);
}
}
  
