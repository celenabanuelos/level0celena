int x=345;
int y=150;
void setup() {




  size (540, 440);
  PImage catPic = loadImage("lazercat.jpg");
  catPic.resize(540, 440);  // to match your size
  background(catPic);
}

void draw() {
  ellipse(365, 150, 25, 30);
  ellipse(x, y, 25, 30);
  fill(240, 12, 12);
  void keyPressed() {
    x++;
    y++;
  }
}  
}
