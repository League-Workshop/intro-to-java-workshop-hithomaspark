int ballX;
int ballY;
int paddleX;
int paddleY;
int paddleLength;
int xSpeed;
int ySpeed;
int score;
PImage backgroundImage;
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength){
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else 
    return false;  
}
void setup(){
 size(750, 500);
 ballX = 20;
 ballY = 20;
 xSpeed = 8;
 ySpeed = 8;
 paddleX = 475;
 paddleLength = 75;
 paddleY = 475;
backgroundImage = loadImage("rainbow.jpg");
}

void draw(){
  background(0, 0, 0);
  image(backgroundImage, 0, 0);
  ellipse(ballX, ballY, 20, 20);
  fill(0, 0, 0);
  stroke(0, 255, 0);
  paddleX = mouseX;
  rect(paddleX, paddleY, paddleLength, 10);
  
  ballX += xSpeed;
  if (ballX == 750 || ballX == 0) {
    xSpeed = -xSpeed;
  }
  
  ballY += ySpeed;
  if (intersects(ballX, ballY, paddleX, paddleY, paddleLength) == true || ballY == 0) {
   ySpeed = -ySpeed; 
   score += 1;
  }
  
  if (ballY == 500){
    xSpeed = 0;
    ySpeed = 0;
    println("Game Over");
    println("Your score was " + score/2);
  }
} 