import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
 size(400,400);
 //int noseLength = 375;
}
int noseLength = 375;
public void draw()
{
  face();
  hair();
  clothes();
}

public void hair(){
	 //hair
    fill(10, 2, 2);
    ellipse(84,66,71,60);
    bezier(29,47,27,75,32,118,-21,118);
    bezier(29,47,27,46,31,131,183,90);
    //hat
    noStroke(); 
    fill(237, 208, 23);
    bezier(26,-32,-69,72,-53,153,119,31);
    bezier(-1,47,27,72,16,109,176,20);
    //hat stripe
    fill(100, 165, 222);
    quad(-6,53,0,37,85,9,96,18);
}

public void face(){
	 //Nose
    fill(250, 241, 182);
    bezier(115,183,83,118,noseLength,184,135,223);

	//face
	fill(250, 241, 182);
    bezier(119,66,91,179,279,323,-10,331);
    noStroke(); 
    ellipse(33,225,216,199);
    ellipse(88,137,62,72);
    ellipse(49,141,122,90);
    ellipse(38,128,47,98);
    stroke(0, 0, 0);
    //neck
    rect(-2,322,61,55);
    //eye
    fill(255, 255, 255);
    ellipse(76,162,50,66);
    //blue iris
    fill(40, 133, 214);
    ellipse(74,176,41,38);
    //pupil
    fill(8, 8, 8);
    ellipse(74,182,23,25);
    fill(250, 241, 182);
    noStroke();
    ellipse(81,203,51,25);
    //mouth
    /*
    fill(0, 0, 0);
    arc(155,256,190,50,99,187);
    fill(201, 58, 58);
    arc(155,259,171,50,101,162);
    */
    fill(0, 0, 0);
    arc(117, 260, 70, 50, 0,  PI, CHORD);
    fill(201, 58, 58);
    arc(117, 270, 65, 25, 0,  PI, CHORD);

  

}

public void clothes(){
	//SHIRT
	stroke(0,0,0);
    fill(255, 255, 255);
    ellipse(0,391,142,61);
    //bow
    fill(106, 203, 245);
    ellipse(77,393,45,65);
    ellipse(73,393,45,65);
    ellipse(92,393,36,34);
}

public void mousePressed(){

	noseLength = noseLength + 1;
	/*
	fill(250, 241, 182);
	bezier(115,183,83,118,noseLength,184,135,223);

	if(noseLength == 600){
		noseLength = 375;
	}
	*/
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
