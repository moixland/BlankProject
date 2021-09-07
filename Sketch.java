import processing.core.PApplet;

public class Sketch extends PApplet {

  float bgcolor;
  float ballSize;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    bgcolor = 123;
    ballSize = 25;
  }

  public void draw() {
    background(bgcolor);
    fill(255 * mouseX / width, 0, 255 * mouseY / height);
    rect(mouseX - ballSize/2, mouseY - ballSize/2, ballSize, ballSize);
  }
}
