int x;
int y;
int a;
void setup() {
  size(500, 500);
  x = 115;
  y = 108;
  a = 1;
  PImage catPic = loadImage("tabby.png");
  catPic.resize(width, height);
  background(catPic);
}

void draw(){
  PImage catPic = loadImage("tabby.png");
  catPic.resize(width, height);
  ellipse(x, y, 31, 31);
  ellipse(x + 100, y, 31, 31);
  fill(255, 0, 0);
  
  if(x >= 500){
    print(x + ", " + y);
    background(catPic);
    x = 115;
    y = 108;
    a = 1;
  }
}

void keyPressed() {
 x += 2 * a;
 y += 2 * a;
 a ++;
 noStroke();
}