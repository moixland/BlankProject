import processing.core.PApplet;

public class Sketch extends PApplet {

  float bgcolor;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    bgcolor = 123;
  }

  public void draw() {
    background(bgcolor);
    fill(255 * mouseX / width, 0, 255 * mouseY / height);
    ellipse(mouseX, mouseY, 25, 25);
  }
}