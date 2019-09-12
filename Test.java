//this assignment includes the GUI part of our project (without events)
//150116028 Minel SAYGISEVER
//150116038 Beran Ege Senol

//vLine1_2_3 means 2nd vertical line belongs to circle 1 which in Level3

//hLine -> horizontal line
//arc -> arc
//c -> circle


import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Test extends Application {

	Stage window;

	//a_4, a_5, b_5 is for check which lines are correct to move, we use these at disconnector
	boolean a_4 = true;

	//setDirection methods makes lines in disconnector turns
	private void setDirection_4(Line x){

		if (x.getStartX() == 190) {
			x.setStartX(171);
			x.setEndX(209);
			x.setStartY(170);
			x.setEndY(170);
			a_4 = false;

		} else {
			x.setStartX(190);
			x.setEndX(190);
			x.setStartY(151);
			x.setEndY(189);
			a_4 = true;
		}

	}

	private boolean a_5 = true, b_5 = true;

	private void vsetDirection_5(Line x){

		if (x.getStartX() == 182.5) {
			x.setStartX(162.5);
			x.setEndX(202.5);
			x.setStartY(170);
			x.setEndY(170);
			a_5 = false;

		} else {
			x.setStartX(182.5);
			x.setEndX(182.5);
			x.setStartY(150);
			x.setEndY(190);
			a_5 = true;
		}

	}

	private void hsetDirection_5(Line x){
		if (x.getStartX() == 162.5) {
			x.setStartX(182.5);
			x.setEndX(182.5);
			x.setStartY(220);
			x.setEndY(260);
			b_5 = false;

		}
		else {
			x.setStartX(162.5);
			x.setEndX(202.5);
			x.setStartY(240);
			x.setEndY(240);
			b_5 = true;
		}
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception{

		window = primaryStage;


		//LEVEL 1
		Pane pane1 = new Pane();

		Scene level1 = new Scene(pane1, 500, 300);
		window.setTitle("Level 1"); // Set the stage title
		window.setScene(level1); // Place the scene in the stage
		window.show();

		//we use these circles while change levels
		Circle c1= new Circle(0, 0, 0);
		Circle c2= new Circle(0, 0, 0);
		Circle c3= new Circle(0, 0, 0);
		Circle c4= new Circle(0, 0, 0);

		Line vLine1_1_1 = new Line(102.5, 30, 102.5, 45);
		vLine1_1_1.setStrokeWidth(5);
		vLine1_1_1.setStroke(Color.HOTPINK);
		pane1.getChildren().add(vLine1_1_1); //add the line to the pane

		Line vLine1_2_1 = new Line(85, 43.5, 85, 182.5); //stroke 1
		vLine1_2_1.setStrokeWidth(1);
		vLine1_2_1.setStroke(Color.BLACK);
		pane1.getChildren().add(vLine1_2_1);



		Line hLine1_1_1 = new Line(102.5, 37.5, 275, 37.5); //stroke 5
		hLine1_1_1.setStrokeWidth(5);
		hLine1_1_1.setStroke(Color.HOTPINK);
		pane1.getChildren().add(hLine1_1_1);

		Line hLine1_2_1 = new Line(315, 37.5, 365, 37.5); //stroke 5
		hLine1_2_1.setStrokeWidth(5);
		hLine1_2_1.setStroke(Color.HOTPINK);
		pane1.getChildren().add(hLine1_2_1);

		Line hLine1_3_1 = new Line(90, 37.5, 100, 37.5); //stroke 1
		hLine1_3_1.setStrokeWidth(1);
		hLine1_3_1.setStroke(Color.BLACK);
		pane1.getChildren().add(hLine1_3_1);

		Line hLine1_4_1 = new Line(90, 188.5, 370, 188.5); //stroke 1
		hLine1_4_1.setStrokeWidth(1);
		hLine1_4_1.setStroke(Color.BLACK);
		pane1.getChildren().add(hLine1_4_1);



		Arc arc1_1_1 = new Arc(295, 37.5, 20, 20, 0, 180); // stroke 5
		arc1_1_1.setFill(Color.WHITE);
		arc1_1_1.setStroke(Color.HOTPINK);
		arc1_1_1.setStrokeWidth(5);
		arc1_1_1.setType(ArcType.OPEN);
		pane1.getChildren().add(arc1_1_1);

		Arc arc1_2_1 = new Arc(90, 42.5, 5, 5, 90, 90); // stroke 1
		arc1_2_1.setFill(Color.WHITE);
		arc1_2_1.setStroke(Color.BLACK);
		arc1_2_1.setStrokeWidth(1);
		arc1_2_1.setType(ArcType.OPEN);
		pane1.getChildren().add(arc1_2_1);

		Arc arc1_3_1 = new Arc(90, 183.5, 5, 5, 180, 90); // stroke 1
		arc1_3_1.setFill(Color.WHITE);
		arc1_3_1.setStroke(Color.BLACK);
		arc1_3_1.setStrokeWidth(1);
		arc1_3_1.setType(ArcType.OPEN);
		pane1.getChildren().add(arc1_3_1);



		Circle c1_1_1 = new Circle(385, 188.5, 20);
		c1_1_1.setFill(Color.HOTPINK);
		pane1.getChildren().add(c1_1_1);



		Line vLine2_1_1 = new Line(295, 32.5 , 295, 162.5); //stroke 5
		vLine2_1_1.setStrokeWidth(5);
		vLine2_1_1.setStroke(Color.POWDERBLUE);
		pane1.getChildren().add(vLine2_1_1);



		Line hLine2_1_1 = new Line(287.5, 162.5, 302.5, 162.5); //stroke 5
		hLine2_1_1.setStrokeWidth(5);
		hLine2_1_1.setStroke(Color.POWDERBLUE);
		pane1.getChildren().add(hLine2_1_1);

		Line vLine2_2_1 = new Line(295, 165 , 295, 230); //stroke 1
		vLine2_2_1.setStrokeWidth(1);
		vLine2_2_1.setStroke(Color.BLACK);
		pane1.getChildren().add(vLine2_2_1);

		Circle c2_1_1 = new Circle(295, 250, 20);
		c2_1_1.setFill(Color.POWDERBLUE);
		pane1.getChildren().add(c2_1_1);



		//LEVEL 2
		Pane pane2 = new Pane();

		Scene level2 = new Scene(pane2, 625 , 500);

		Arc arc1_1_2 = new Arc(104, 105, 5, 5, 90, 90); // stroke 1
		arc1_1_2.setFill(Color.WHITE); // Set fill color
		arc1_1_2.setStroke(Color.BLACK);
		arc1_1_2.setStrokeWidth(1);
		arc1_1_2.setType(ArcType.OPEN); // Set arc type
		pane2.getChildren().add(arc1_1_2); // Add arc to pane


		Arc arc2_1_2 = new Arc (252.5, 100, 20, 20, 270, 180); // stroke 5
		arc2_1_2.setFill(Color.WHITE);
		arc2_1_2.setStroke(Color.MEDIUMPURPLE);
		arc2_1_2.setStrokeWidth(5);
		arc2_1_2.setType(ArcType.OPEN);
		pane2.getChildren().add(arc2_1_2);

		Arc arc2_2_2 = new Arc (252.5, 220, 20, 20, 90, 180);
		arc2_2_2.setFill(Color.WHITE);
		arc2_2_2.setStroke(Color.MEDIUMPURPLE);
		arc2_2_2.setStrokeWidth(5);
		arc2_2_2.setType(ArcType.OPEN);
		pane2.getChildren().add(arc2_2_2);


		Arc arc4_1_2 = new Arc (370, 220, 20, 20, 0, 180);
		arc4_1_2.setFill(Color.WHITE);
		arc4_1_2.setStroke(Color.TEAL);
		arc4_1_2.setStrokeWidth(5);
		arc4_1_2.setType(ArcType.OPEN);
		pane2.getChildren().add(arc4_1_2);

		Arc arc4_2_2 = new Arc (521, 225, 5, 5, 0, 90);
		arc4_2_2.setFill(Color.WHITE);
		arc4_2_2.setStroke(Color.BLACK);
		arc4_2_2.setStrokeWidth(1);
		arc4_2_2.setType(ArcType.OPEN);
		pane2.getChildren().add(arc4_2_2);



		Line hLine1_1_2 = new Line(117.5, 100, 257.5, 100);
		hLine1_1_2.setStrokeWidth(5);
		hLine1_1_2.setStroke(Color.MIDNIGHTBLUE);
		pane2.getChildren().add(hLine1_1_2);

		Line hLine1_2_2 = new Line(105, 100, 115, 100);
		hLine1_2_2.setStrokeWidth(1);
		hLine1_2_2.setStroke(Color.BLACK);
		pane2.getChildren().add(hLine1_2_2);


		Line hLine2_1_2 = new Line(245, 322, 260, 322);
		hLine2_1_2.setStrokeWidth(5);
		hLine2_1_2.setStroke(Color.MEDIUMPURPLE);
		pane2.getChildren().add(hLine2_1_2);


		Line hLine3_1_2 = new Line(362.5, 323, 377.5, 323);
		hLine3_1_2.setStrokeWidth(5);
		hLine3_1_2.setStroke(Color.MEDIUMVIOLETRED);
		pane2.getChildren().add(hLine3_1_2);


		Line hLine4_1_2 = new Line(247.5, 220, 350, 220);
		hLine4_1_2.setStrokeWidth(5);
		hLine4_1_2.setStroke(Color.TEAL);
		pane2.getChildren().add(hLine4_1_2);

		Line hLine4_2_2 = new Line(390, 220, 502.5, 220);
		hLine4_2_2.setStrokeWidth(5);
		hLine4_2_2.setStroke(Color.TEAL);
		pane2.getChildren().add(hLine4_2_2);

		Line hLine4_3_2 = new Line(510, 220, 520, 220);
		hLine4_3_2.setStrokeWidth(1);
		hLine4_3_2.setStroke(Color.BLACK);
		pane2.getChildren().add(hLine4_3_2);



		Line vLine1_1_2 = new Line(117.5, 92.5, 117.5, 107.5);
		vLine1_1_2.setStrokeWidth(5);
		vLine1_1_2.setStroke(Color.MIDNIGHTBLUE);
		pane2.getChildren().add(vLine1_1_2);

		Line vLine1_2_2 = new Line(99, 106, 99, 400);
		vLine1_2_2.setStrokeWidth(1);
		vLine1_2_2.setStroke(Color.BLACK);
		pane2.getChildren().add(vLine1_2_2);


		Line vLine2_1_2 = new Line(252.5, 50, 252.5, 80);
		vLine2_1_2.setStrokeWidth(5);
		vLine2_1_2.setStroke(Color.MEDIUMPURPLE);
		pane2.getChildren().add(vLine2_1_2);

		Line vLine2_2_2 = new Line(252.5,120, 252.5, 200);
		vLine2_2_2.setStrokeWidth(5);
		vLine2_2_2.setStroke(Color.MEDIUMPURPLE);
		pane2.getChildren().add(vLine2_2_2);

		Line vLine2_3_2 = new Line(252.5,240, 252.5, 320);
		vLine2_3_2.setStrokeWidth(5);
		vLine2_3_2.setStroke(Color.MEDIUMPURPLE);
		pane2.getChildren().add(vLine2_3_2);

		Line vLine2_4_2 = new Line(252.5,325, 252.5, 400);
		vLine2_4_2.setStrokeWidth(1);
		vLine2_4_2.setStroke(Color.BLACK);
		pane2.getChildren().add(vLine2_4_2);


		Line vLine3_1_2 = new Line(370, 215, 370, 322);
		vLine3_1_2.setStrokeWidth(5);
		vLine3_1_2.setStroke(Color.MEDIUMVIOLETRED);
		pane2.getChildren().add(vLine3_1_2);

		Line vLine3_2_2 = new Line(370,325, 370, 400);
		vLine3_2_2.setStrokeWidth(1);
		vLine3_2_2.setStroke(Color.BLACK);
		pane2.getChildren().add(vLine3_2_2);


		Line vLine4_1_2 = new Line(507.5,212.5, 507.5, 227.5);
		vLine4_1_2.setStrokeWidth(5);
		vLine4_1_2.setStroke(Color.TEAL);
		pane2.getChildren().add(vLine4_1_2);

		Line vLine4_2_2 = new Line(526, 225, 526, 400);
		vLine4_2_2.setStrokeWidth(1);
		vLine4_2_2.setStroke(Color.BLACK);
		pane2.getChildren().add(vLine4_2_2);




		Circle c1_2 = new Circle (99,420,20);
		c1_2.setFill(Color.MIDNIGHTBLUE);
		pane2.getChildren().add(c1_2);

		Circle c2_2 = new Circle (252.5,420,20);
		c2_2.setFill(Color.MEDIUMPURPLE);
		pane2.getChildren().add(c2_2);

		Circle c3_2 = new Circle (370,420,20);
		c3_2.setFill(Color.MEDIUMVIOLETRED);
		pane2.getChildren().add(c3_2);

		Circle c4_2 = new Circle (526,420,20);
		c4_2.setFill(Color.TEAL);
		pane2.getChildren().add(c4_2);



		//LEVEL 3
		Pane pane3 = new Pane();

		Scene level3 = new Scene(pane3, 500, 325);

		Arc arc1_1_3 = new Arc(380, 37.5, 20, 20, 0, 180);
		arc1_1_3.setFill(Color.WHITE);
		arc1_1_3.setStroke(Color.CADETBLUE);
		arc1_1_3.setStrokeWidth(5);
		arc1_1_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc1_1_3);

		Arc arc1_2_3 = new Arc(237.5, 42.5, 5, 5, 90, 90);
		arc1_2_3.setFill(Color.WHITE);
		arc1_2_3.setStroke(Color.BLACK);
		arc1_2_3.setStrokeWidth(1);
		arc1_2_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc1_2_3);

		Arc arc2_1_3 = new Arc(275, 215, 5, 5, 270, 90);
		arc2_1_3.setFill(Color.WHITE);
		arc2_1_3.setStroke(Color.BLACK);
		arc2_1_3.setStrokeWidth(1);
		arc2_1_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc2_1_3);

		Arc arc2_2_3 = new Arc(285, 125, 5, 5, 90, 90);
		arc2_2_3.setFill(Color.WHITE);
		arc2_2_3.setStroke(Color.BLACK);
		arc2_2_3.setStrokeWidth(1);
		arc2_2_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc2_2_3);

		Arc arc3_1_3 = new Arc(375, 185, 5, 5, 270, 90);
		arc3_1_3.setFill(Color.WHITE);
		arc3_1_3.setStroke(Color.BLACK);
		arc3_1_3.setStrokeWidth(1);
		arc3_1_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc3_1_3);

		Arc arc3_2_3 = new Arc(380, 120, 20, 20, 270, 180);
		arc3_2_3.setFill(Color.WHITE);
		arc3_2_3.setStroke(Color.TOMATO);
		arc3_2_3.setStrokeWidth(5);
		arc3_2_3.setType(ArcType.OPEN);
		pane3.getChildren().add(arc3_2_3);

		Line vLine1_1_3 = new Line(250, 30, 250, 45);
		vLine1_1_3.setStrokeWidth(5);
		vLine1_1_3.setStroke(Color.CADETBLUE);
		pane3.getChildren().add(vLine1_1_3);

		Line vLine1_2_3 = new Line(232.5, 42.5, 232.5, 250);
		vLine1_2_3.setStrokeWidth(1);
		vLine1_2_3.setStroke(Color.BLACK);
		pane3.getChildren().add(vLine1_2_3);

		Line vLine2_1_3 = new Line(280, 125, 280, 215);
		vLine2_1_3.setStrokeWidth(1);
		vLine2_1_3.setStroke(Color.BLACK);
		pane3.getChildren().add(vLine2_1_3);

		Line vLine2_2_3 = new Line(297.5, 112.5, 297.5, 127.5);
		vLine2_2_3.setStrokeWidth(5);
		vLine2_2_3.setStroke(Color.GOLDENROD);
		pane3.getChildren().add(vLine2_2_3);

		Line vLine3_1_3 = new Line(380, 175, 380, 185);
		vLine3_1_3.setStrokeWidth(1);
		vLine3_1_3.setStroke(Color.BLACK);
		pane3.getChildren().add(vLine3_1_3);

		Line vLine3_2_3 = new Line(380, 140, 380, 175);
		vLine3_2_3.setStrokeWidth(5);
		vLine3_2_3.setStroke(Color.TOMATO);
		pane3.getChildren().add(vLine3_2_3);

		Line vLine3_3_3 = new Line(380, 32.5, 380, 100);
		vLine3_3_3.setStrokeWidth(5);
		vLine3_3_3.setStroke(Color.TOMATO);
		pane3.getChildren().add(vLine3_3_3);

		Line hLine1_1_3 = new Line(252.5, 37.5, 360, 37.5);
		hLine1_1_3.setStrokeWidth(5);
		hLine1_1_3.setStroke(Color.CADETBLUE);
		pane3.getChildren().add(hLine1_1_3);

		Line hLine1_2_3 = new Line(400, 37.5, 450, 37.5);
		hLine1_2_3.setStrokeWidth(5);
		hLine1_2_3.setStroke(Color.CADETBLUE);
		pane3.getChildren().add(hLine1_2_3);

		Line hLine1_3_3 = new Line(237.5, 37.5, 247.5, 37.5);
		hLine1_3_3.setStrokeWidth(1);
		hLine1_3_3.setStroke(Color.BLACK);
		pane3.getChildren().add(hLine1_3_3);

		Line hLine2_1_3 = new Line(172.5, 220, 275, 220);
		hLine2_1_3.setStrokeWidth(1);
		hLine2_1_3.setStroke(Color.BLACK);
		pane3.getChildren().add(hLine2_1_3);

		Line hLine2_2_3 = new Line(285, 120, 295, 120);
		hLine2_2_3.setStrokeWidth(1);
		hLine2_2_3.setStroke(Color.BLACK);
		pane3.getChildren().add(hLine2_2_3);

		Line hLine2_3_3 = new Line(300, 120, 385, 120);
		hLine2_3_3.setStrokeWidth(5);
		hLine2_3_3.setStroke(Color.GOLDENROD);
		pane3.getChildren().add(hLine2_3_3);

		Line hLine3_1_3 = new Line(92.5, 190, 375, 190);
		hLine3_1_3.setStrokeWidth(1);
		hLine3_1_3.setStroke(Color.BLACK);
		pane3.getChildren().add(hLine3_1_3);

		Line hLine3_2_3 = new Line(372.5, 175, 387.5, 175);
		hLine3_2_3.setStrokeWidth(5);
		hLine3_2_3.setStroke(Color.TOMATO);
		pane3.getChildren().add(hLine3_2_3);

		Circle c1_3 = new Circle(232.5, 270, 20);
		c1_3.setFill(Color.CADETBLUE);
		pane3.getChildren().add(c1_3);

		Circle c2_3 = new Circle(152.5, 220, 20);
		c2_3.setFill(Color.GOLDENROD);
		pane3.getChildren().add(c2_3);

		Circle c3_3 = new Circle(72.5, 190, 20);
		c3_3.setFill(Color.TOMATO);
		pane3.getChildren().add(c3_3);



		//LEVEL 4
		Pane pane4 = new Pane();

		Scene level4 = new Scene(pane4, 500, 300);

		Arc arc1_1_4 = new Arc(371, 165, 5, 5, 270, 90); // stroke 5
		arc1_1_4.setFill(Color.WHITE); // Set fill color
		arc1_1_4.setStroke(Color.BLACK);
		arc1_1_4.setStrokeWidth(1);
		arc1_1_4.setType(ArcType.OPEN); // Set arc type
		pane4.getChildren().add(arc1_1_4); // Add arc to pane

		Arc arc2_1_4 = new Arc(195, 59, 5, 5, 90, 90); // stroke 5
		arc2_1_4.setFill(Color.WHITE); // Set fill color
		arc2_1_4.setStroke(Color.BLACK);
		arc2_1_4.setStrokeWidth(1);
		arc2_1_4.setType(ArcType.OPEN); // Set arc type
		pane4.getChildren().add(arc2_1_4); // Add arc to pane

		Arc arc2_2_4 = new Arc(376, 54, 20, 20, 0, 180); // stroke 5
		arc2_2_4.setFill(Color.WHITE);
		arc2_2_4.setStroke(Color.MAROON); // Set fill color
		arc2_2_4.setStrokeWidth(5);
		arc2_2_4.setType(ArcType.OPEN); // Set arc type
		pane4.getChildren().add(arc2_2_4); // Add arc to pane

		Circle c1_4 = new Circle(70, 170, 20);
		c1_4.setFill(Color.DARKGOLDENROD);
		pane4.getChildren().add(c1_4);

		Circle c1_2_4 = new Circle(190, 170, 20);
		c1_2_4.setFill(Color.WHITE);
		c1_2_4.setStrokeWidth(3);
		c1_2_4.setStroke(Color.BLACK);

		pane4.getChildren().add(c1_2_4);

		Circle c2_4 = new Circle(190, 250, 20);
		c2_4.setFill(Color.MAROON);
		pane4.getChildren().add(c2_4);

		Line hLine1_1_4 = new Line(90, 170, 170, 170);
		hLine1_1_4.setStrokeWidth(1);
		hLine1_1_4.setStroke(Color.BLACK);
		pane4.getChildren().add(hLine1_1_4);

		Line hLine1_2_4= new Line(210, 170, 370, 170);
		hLine1_2_4.setStrokeWidth(1);
		hLine1_2_4.setStroke(Color.BLACK);
		pane4.getChildren().add(hLine1_2_4);

		Line hLine1_3_4 = new Line(368.5, 157, 383.5, 157);
		hLine1_3_4.setStrokeWidth(5);
		hLine1_3_4.setStroke(Color.DARKGOLDENROD);
		pane4.getChildren().add(hLine1_3_4);

		Line hLine2_1_4 = new Line(196, 54, 210, 54);
		hLine2_1_4.setStrokeWidth(1);
		hLine2_1_4.setStroke(Color.BLACK);
		pane4.getChildren().add(hLine2_1_4);

		Line hLine2_2_4 = new Line(211, 54, 356, 54);
		hLine2_2_4.setStrokeWidth(5);
		hLine2_2_4.setStroke(Color.MAROON);
		pane4.getChildren().add(hLine2_2_4);

		Line hLine2_3_4 = new Line(396, 54, 425, 54);
		hLine2_3_4.setStrokeWidth(5);
		hLine2_3_4.setStroke(Color.MAROON);
		pane4.getChildren().add(hLine2_3_4);

		Line vLine1_1_4 = new Line(376, 165, 376, 160); // stroke 5
		vLine1_1_4.setStrokeWidth(1);
		vLine1_1_4.setStroke(Color.BLACK);
		pane4.getChildren().add(vLine1_1_4);

		Line vLine1_2_4 = new Line(376, 157, 376, 50); // stroke 5
		vLine1_2_4.setStrokeWidth(5);
		vLine1_2_4.setStroke(Color.DARKGOLDENROD);
		pane4.getChildren().add(vLine1_2_4);

		Line vLine2_1_4 = new Line(190, 230, 190, 191); // stroke 5
		vLine2_1_4.setStrokeWidth(1);
		vLine2_1_4.setStroke(Color.BLACK);
		pane4.getChildren().add(vLine2_1_4);

		Line vLine2_2_4 = new Line(190, 189, 190, 151); // in the circle
		vLine2_2_4.setStrokeWidth(1);
		vLine2_2_4.setStroke(Color.BLACK);
		pane4.getChildren().add(vLine2_2_4);


		Line vLine2_3_4 = new Line(190, 150, 190, 60);
		vLine2_3_4.setStrokeWidth(1);
		vLine2_3_4.setStroke(Color.BLACK);
		pane4.getChildren().add(vLine2_3_4);

		Line vLine2_4_4 = new Line(210, 46.5, 210, 61.5);
		vLine2_4_4.setStrokeWidth(5);
		vLine2_4_4.setStroke(Color.MAROON);
		pane4.getChildren().add(vLine2_4_4);



		//LEVEL5
		Pane pane_5 = new Pane();

		Scene level5 = new Scene(pane_5, 450 , 350);


		Arc arc1_1_5 = new Arc(270, 37.5, 20, 20, 0, 180);
		arc1_1_5.setFill(Color.WHITE);
		arc1_1_5.setStroke(Color.DARKSALMON);
		arc1_1_5.setStrokeWidth(5);
		arc1_1_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc1_1_5);

		Arc arc1_2_5 = new Arc(187.5, 42.5, 5, 5, 90, 90);
		arc1_2_5.setFill(Color.WHITE);
		arc1_2_5.setStroke(Color.BLACK);
		arc1_2_5.setStrokeWidth(1);
		arc1_2_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc1_2_5);


		Arc arc2_1_5 = new Arc(350, 37.5, 20, 20, 270, 180);
		arc2_1_5.setFill(Color.WHITE);
		arc2_1_5.setStroke(Color.PURPLE);
		arc2_1_5.setStrokeWidth(5);
		arc2_1_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc2_1_5);

		Arc arc2_2_5 = new Arc(345, 235, 5, 5, 270, 90);
		arc2_2_5.setFill(Color.WHITE);
		arc2_2_5.setStroke(Color.BLACK);
		arc2_2_5.setStrokeWidth(1);
		arc2_2_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc2_2_5);


		Arc arc3_1_5 = new Arc(270, 70, 20, 20, 90, 180);
		arc3_1_5.setFill(Color.WHITE);
		arc3_1_5.setStroke(Color.DARKSLATEGRAY);
		arc3_1_5.setStrokeWidth(5);
		arc3_1_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc3_1_5);

		Arc arc3_2_5 = new Arc(265, 165, 5, 5, 270, 90);
		arc3_2_5.setFill(Color.WHITE);
		arc3_2_5.setStroke(Color.BLACK);
		arc3_2_5.setStrokeWidth(1);
		arc3_2_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc3_2_5);


		Arc arc4_1_5 = new Arc(310,75, 5, 5, 0, 90);
		arc4_1_5.setFill(Color.WHITE);
		arc4_1_5.setStroke(Color.BLACK);
		arc4_1_5.setStrokeWidth(1);
		arc4_1_5.setType(ArcType.OPEN);
		pane_5.getChildren().add(arc4_1_5);



		Line vLine1_1_5 = new Line(200, 30, 200, 45);
		vLine1_1_5.setStrokeWidth(5);
		vLine1_1_5.setStroke(Color.DARKSALMON);
		pane_5.getChildren().add(vLine1_1_5);

		Line vLine1_2_5 = new Line(182.5, 42.5, 182.5, 150);
		vLine1_2_5.setStrokeWidth(1);
		vLine1_2_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine1_2_5);

		Line vLine1_3_5 = new Line(182.5, 190, 182.5, 220);
		vLine1_3_5.setStrokeWidth(1);
		vLine1_3_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine1_3_5);

		Line hLine1_4_5 = new Line(182.5, 260, 182.5, 290); //vertical line 4
		hLine1_4_5.setStrokeWidth(1);
		hLine1_4_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine1_4_5);


		Line vLine2_1_5 = new Line(350, 5, 350, 17.5);
		vLine2_1_5.setStrokeWidth(5);
		vLine2_1_5.setStroke(Color.PURPLE);
		pane_5.getChildren().add(vLine2_1_5);

		Line vLine2_2_5 = new Line(350, 57.5, 350, 222.5);
		vLine2_2_5.setStrokeWidth(5);
		vLine2_2_5.setStroke(Color.PURPLE);
		pane_5.getChildren().add(vLine2_2_5);

		Line vLine2_3_5 = new Line(350, 225, 350, 235);
		vLine2_3_5.setStrokeWidth(1);
		vLine2_3_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine2_3_5);


		Line vLine3_1_5 = new Line(270, 32.5, 270, 50);
		vLine3_1_5.setStrokeWidth(5);
		vLine3_1_5.setStroke(Color.DARKSLATEGRAY);
		pane_5.getChildren().add(vLine3_1_5);

		Line vLine3_2_5 = new Line(270, 90, 270, 152.5);
		vLine3_2_5.setStrokeWidth(5);
		vLine3_2_5.setStroke(Color.DARKSLATEGRAY);
		pane_5.getChildren().add(vLine3_2_5);

		Line vLine3_3_5 = new Line(270, 155, 270, 165);
		vLine3_3_5.setStrokeWidth(1);
		vLine3_3_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine3_3_5);


		Line vLine4_1_5 = new Line(297.5, 62.5, 297.5, 77.5);
		vLine4_1_5.setStrokeWidth(5);
		vLine4_1_5.setStroke(Color.SADDLEBROWN);
		pane_5.getChildren().add(vLine4_1_5);

		Line vLine4_2_5 = new Line(315, 75, 315, 290);
		vLine4_2_5.setStrokeWidth(1);
		vLine4_2_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine4_2_5);



		Line hLine1_1_5 = new Line(200, 37.5, 250, 37.5);
		hLine1_1_5.setStrokeWidth(5);
		hLine1_1_5.setStroke(Color.DARKSALMON);
		pane_5.getChildren().add(hLine1_1_5);

		Line hLine1_2_5 = new Line(290, 37.5, 355, 37.5);
		hLine1_2_5.setStrokeWidth(5);
		hLine1_2_5.setStroke(Color.DARKSALMON);
		pane_5.getChildren().add(hLine1_2_5);

		Line hLine1_3_5 = new Line(187.5, 37.5, 197.5, 37.5);
		hLine1_3_5.setStrokeWidth(1);
		hLine1_3_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine1_3_5);




		Line hLine2_1_5 = new Line(202.5, 240, 345, 240);
		hLine2_1_5.setStrokeWidth(1);
		hLine2_1_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine2_1_5);

		Line hLine2_2_5 = new Line(100, 240, 162.5, 240);
		hLine2_2_5.setStrokeWidth(1);
		hLine2_2_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine2_2_5);

		Line hLine2_3_5 = new Line(342.5, 222.5, 357.5, 222.5);
		hLine2_3_5.setStrokeWidth(5);
		hLine2_3_5.setStroke(Color.PURPLE);
		pane_5.getChildren().add(hLine2_3_5);


		Line hLine3_1_5 = new Line(262.5, 152.5, 277.5, 152.5);
		hLine3_1_5.setStrokeWidth(5);
		hLine3_1_5.setStroke(Color.DARKSLATEGRAY);
		pane_5.getChildren().add(hLine3_1_5);

		Line hLine3_2_5 = new Line(202.5, 170, 265, 170);
		hLine3_2_5.setStrokeWidth(1);
		hLine3_2_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine3_2_5);

		Line hLine3_3_5 = new Line(100, 170, 162.5, 170);
		hLine3_3_5.setStrokeWidth(1);
		hLine3_3_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine3_3_5);


		Line hLine4_1_5 = new Line(265, 70, 297.5, 70);
		hLine4_1_5.setStrokeWidth(5);
		hLine4_1_5.setStroke(Color.SADDLEBROWN);
		pane_5.getChildren().add(hLine4_1_5);

		Line hLine4_2_5 = new Line(300, 70, 310, 70);
		hLine4_2_5.setStrokeWidth(1);
		hLine4_2_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine4_2_5);



		Circle c0_1_5 = new Circle (182.5, 170, 20);
		c0_1_5.setFill(Color.WHITE);
		c0_1_5.setStroke(Color.BLACK);
		c0_1_5.setStrokeWidth(3);
		pane_5.getChildren().add(c0_1_5);

		Circle c0_2_5 = new Circle (182.5, 240, 20);
		c0_2_5.setFill(Color.WHITE);
		c0_2_5.setStroke(Color.BLACK);
		c0_2_5.setStrokeWidth(3);
		pane_5.getChildren().add(c0_2_5);



		Line vLine0_1_5 = new Line(182.5, 150, 182.5, 190);
		vLine0_1_5.setStrokeWidth(1);
		vLine0_1_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(vLine0_1_5);

		Line hLine0_4_5 = new Line(162.5, 240, 202.5, 240);
		hLine0_4_5.setStrokeWidth(1);
		hLine0_4_5.setStroke(Color.BLACK);
		pane_5.getChildren().add(hLine0_4_5);



		Circle c1_5 = new Circle (182.5, 310, 20);
		c1_5.setFill(Color.DARKSALMON);
		pane_5.getChildren().add(c1_5);

		Circle c2_5 = new Circle (80, 240, 20);
		c2_5.setFill(Color.PURPLE);
		pane_5.getChildren().add(c2_5);

		Circle c3_5 = new Circle (80, 170, 20);
		c3_5.setFill(Color.DARKSLATEGRAY);
		pane_5.getChildren().add(c3_5);

		Circle c4_5 = new Circle (315, 310, 20);
		c4_5.setFill(Color.SADDLEBROWN);
		pane_5.getChildren().add(c4_5);


		//THIS OUR FINAL STAGE
		Pane pane_final = new Pane();

		Scene scene_final = new Scene(pane_final, 960 , 350);


		Text won = new Text(20, 190, "You have finished all levels!");
		won.setFill(Color.HOTPINK);
		won.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 70));
		pane_final.getChildren().add(won);


		//LEVEL 1 ANIMATIONS
		EventHandler<ActionEvent> eventHandler1_1 = e -> {

			if (vLine1_1_1.getStartY() >= 20 && vLine1_1_1.getEndY() <= 55){
				vLine1_1_1.setStartY(vLine1_1_1.getStartY() - 1);
				vLine1_1_1.setEndY(vLine1_1_1.getEndY() + 1);
			}

			if (hLine1_1_1.getStartX() < hLine1_1_1.getEndX()){
				hLine1_1_1.setEndX(hLine1_1_1.getEndX() - 1.5);
			}
			else
				hLine1_1_1.setVisible(false);

			if(arc1_1_1.getCenterX() - 5 > hLine1_1_1.getStartX() + arc1_1_1.getRadiusX()){
				arc1_1_1.setCenterX(arc1_1_1.getCenterX() - 1.5);
			}

			else if(arc1_1_1.getCenterX()  > hLine1_1_1.getStartX() - arc1_1_1.getRadiusX() &&
					arc1_1_1.getLength() >= 6){
				arc1_1_1.setCenterX(arc1_1_1.getCenterX() - 1.5);
				arc1_1_1.setLength(arc1_1_1.getLength() - 6);
			}
			else
				arc1_1_1.setVisible(false);

			if (hLine1_2_1.getStartX() - 1.5 > hLine1_1_1.getEndX()) {
				hLine1_2_1.setStartX(hLine1_2_1.getStartX() - 1.5);
				hLine1_2_1.setEndX(hLine1_2_1.getEndX() - 1.5);
			}
			else if(hLine1_2_1.getStartX() + 1.5 < hLine1_2_1.getEndX() ){
				hLine1_2_1.setEndX(hLine1_2_1.getEndX() - 1.5);
			}

			//it gets faded first, then disappears
			else{
				vLine1_1_1.setOpacity(vLine1_1_1.getOpacity() - 0.15);
				vLine1_2_1.setOpacity(vLine1_2_1.getOpacity() - 0.15);
				hLine1_2_1.setOpacity(hLine1_2_1.getOpacity() - 0.15);
				hLine1_3_1.setOpacity(hLine1_3_1.getOpacity() - 0.15);
				hLine1_4_1.setOpacity(hLine1_4_1.getOpacity() - 0.15);
				arc1_2_1.setOpacity(arc1_2_1.getOpacity() - 0.15);
				arc1_3_1.setOpacity(arc1_3_1.getOpacity() - 0.15);
				c1_1_1.setOpacity(c1_1_1.getOpacity() - 0.15);
				//the circles will shrink and disappear.
				c1_1_1.setRadius(c1_1_1.getRadius() - 4);
				//short lines disappear and disappear.
				vLine1_1_1.setStartY(vLine1_1_1.getStartY() + 4);
				vLine1_1_1.setEndY(vLine1_1_1.getEndY() - 4);
				//When the circle disappears, everything that belongs to it disappears.
				if(c1_1_1.getOpacity() < 0.15){
					hLine1_2_1.setVisible(false);
					hLine1_3_1.setVisible(false);
					hLine1_4_1.setVisible(false);
					vLine1_1_1.setVisible(false);
					vLine1_2_1.setVisible(false);
					arc1_2_1.setVisible(false);
					arc1_3_1.setVisible(false);
					c1_1_1.setVisible(false);
				}
			}


			//when all circles have disappeared, the next level opens.
			if (c1.isVisible() && !c1_1_1.isVisible() && !c2_1_1.isVisible() ){
				window.setScene(level2);
				window.setTitle("Level 2");
			}

		};



		EventHandler<ActionEvent> eventHandler2_1 = e -> {
			if (hLine2_1_1.getStartX() >= 277.5 && hLine2_1_1.getEndX() <= 312.5){
				hLine2_1_1.setStartX(hLine2_1_1.getStartX() - 1);
				hLine2_1_1.setEndX(hLine2_1_1.getEndX() + 1);
			}

			if (vLine2_1_1.getStartY() < vLine2_1_1.getEndY())
				vLine2_1_1.setStartY(vLine2_1_1.getStartY() + 1.5);
			else {
				vLine2_1_1.setOpacity(vLine2_1_1.getOpacity() - 0.15);
				vLine2_2_1.setOpacity(vLine2_2_1.getOpacity() - 0.15);
				hLine2_1_1.setOpacity(hLine2_1_1.getOpacity() - 0.15);
				c2_1_1.setOpacity(c2_1_1.getOpacity() - 0.15);
				c2_1_1.setRadius(c2_1_1.getRadius() - 4);
				hLine2_1_1.setStartX(hLine2_1_1.getStartX() + 4);
				hLine2_1_1.setEndX(hLine2_1_1.getEndX() - 4);

				if(c2_1_1.getOpacity() < 0.15){
					vLine2_1_1.setVisible(false);
					vLine2_2_1.setVisible(false);
					hLine2_1_1.setVisible(false);
					c2_1_1.setVisible(false);
				}

			}

			if (c1.isVisible() && !c1_1_1.isVisible() && !c2_1_1.isVisible()){
				window.setScene(level2);
				window.setTitle("Level 2");
			}

		};




		EventHandler<ActionEvent> eventHandler1_2 = e -> {
			if (vLine1_1_2.getStartY() >= 82.5 && vLine1_1_2.getEndY() <= 117.5){
				vLine1_1_2.setStartY(vLine1_1_2.getStartY() - 1);
				vLine1_1_2.setEndY(vLine1_1_2.getEndY() + 1);
			}

			if (hLine1_1_2.getStartX() + 2.5 < hLine1_1_2.getEndX())
				hLine1_1_2.setEndX(hLine1_1_2.getEndX() - 1.5);
			else {
				vLine1_1_2.setOpacity(vLine1_1_2.getOpacity() - 0.15);
				vLine1_2_2.setOpacity(vLine1_2_2.getOpacity() - 0.15);
				hLine1_2_2.setOpacity(hLine1_2_2.getOpacity() - 0.15);
				hLine1_1_2.setOpacity(hLine1_1_2.getOpacity() - 0.15);
				arc1_1_2.setOpacity(arc1_1_2.getOpacity() - 0.15);
				c1_2.setOpacity(c1_2.getOpacity() - 0.15);
				c1_2.setRadius(c1_2.getRadius() - 4);
				vLine1_1_2.setStartY(vLine1_1_2.getStartY() + 4);
				vLine1_1_2.setEndY(vLine1_1_2.getEndY() - 4);
				if(c1_2.getOpacity() < 0.15){
					vLine1_1_2.setVisible(false);
					vLine1_2_2.setVisible(false);
					hLine1_1_2.setVisible(false);
					hLine1_2_2.setVisible(false);
					arc1_1_2.setVisible(false);
					c1_2.setVisible(false);
					//all circles of level 1 are not visible at this time.
					//At this point, the if statement at level 1 is still being checked.
					//if we do not destroy c1, it will try to open 2nd level too.
					//we are also saying that we want to open 3rd level.
					//this will cause a compile time error.
					//c1, c2, c3, c4 are stand for this situations.
					//We are converting the previous level's if statement to false.
					c1.setVisible(false);
				}
			}

			if (c2.isVisible() && !c1_2.isVisible() && !c2_2.isVisible() && !c3_2.isVisible() && !c4_2.isVisible()){
				window.setScene(level3);
				window.setTitle("Level 3");
			}

		};


		EventHandler<ActionEvent> eventHandler2_2 = e -> {

			if (hLine2_1_2.getStartX() >= 235 && hLine2_1_2.getEndX() <= 270){
				hLine2_1_2.setStartX(hLine2_1_2.getStartX() - 1);
				hLine2_1_2.setEndX(hLine2_1_2.getEndX() + 1);
			}

			if (vLine2_3_2.getStartY() < vLine2_3_2.getEndY()){
				vLine2_3_2.setStartY(vLine2_3_2.getStartY() + 1.5);
			}

			else
				vLine2_3_2.setVisible(false);

			if(arc2_1_2.getCenterY() + 5 < hLine2_1_2.getStartY() - arc2_1_2.getRadiusY()){
				arc2_1_2.setCenterY(arc2_1_2.getCenterY() + 1.5);
			}

			else if(arc2_1_2.getCenterY() < hLine2_1_2.getStartY() + arc2_1_2.getRadiusY() &&
					arc2_1_2.getLength() >= 6){
				arc2_1_2.setCenterY(arc2_1_2.getCenterY() + 1.5);
				arc2_1_2.setStartAngle(arc2_1_2.getStartAngle() + 6);
				arc2_1_2.setLength(arc2_1_2.getLength() -6);
			}

			else
				arc2_1_2.setVisible(false);

			if(arc2_2_2.getCenterY() + 5 < hLine2_1_2.getStartY() - arc2_2_2.getRadiusY()){
				arc2_2_2.setCenterY(arc2_2_2.getCenterY() + 1.5);
			}

			else if(arc2_2_2.getCenterY() < hLine2_1_2.getStartY() + arc2_2_2.getRadiusY() &&
					arc2_2_2.getLength() >= 6){
				arc2_2_2.setCenterY(arc2_2_2.getCenterY() + 1.5);
				arc2_2_2.setLength(arc2_2_2.getLength() -6);
			}

			else
				arc2_2_2.setVisible(false);


			if (vLine2_2_2.getEndY() + 1.5 < hLine2_1_2.getEndY()) {
				vLine2_2_2.setStartY(vLine2_2_2.getStartY() + 1.5);
				vLine2_2_2.setEndY(vLine2_2_2.getEndY() + 1.5);
			}

			else if(vLine2_2_2.getStartY() < vLine2_2_2.getEndY() ){
				vLine2_2_2.setStartY(vLine2_2_2.getStartY() + 1.5);
			}

			else
				vLine2_2_2.setVisible(false);


			if (vLine2_1_2.getEndY() + 1.5 < hLine2_1_2.getEndY()) {
				vLine2_1_2.setStartY(vLine2_1_2.getStartY() + 1.5);
				vLine2_1_2.setEndY(vLine2_1_2.getEndY() + 1.5);
			}

			else if(vLine2_1_2.getStartY() < vLine2_1_2.getEndY() ){
				vLine2_1_2.setStartY(vLine2_1_2.getStartY() + 1.5);
			}

			else{
				vLine2_1_2.setOpacity(vLine2_1_2.getOpacity() - 0.15);
				vLine2_2_2.setOpacity(vLine2_2_2.getOpacity() - 0.15);
				vLine2_4_2.setOpacity(vLine2_4_2.getOpacity() - 0.15);
				hLine2_1_2.setOpacity(hLine2_1_2.getOpacity() - 0.15);
				c2_2.setOpacity(c2_2.getOpacity() - 0.15);
				c2_2.setRadius(c2_2.getRadius() - 4);
				hLine2_1_2.setStartX(hLine2_1_2.getStartX() + 4);
				hLine2_1_2.setEndX(hLine2_1_2.getEndX() - 4);

				if(c2_2.getOpacity() < 0.15){
					hLine2_1_2.setVisible(false);
					vLine2_1_2.setVisible(false);
					vLine2_2_2.setVisible(false);
					vLine2_4_2.setVisible(false);
					c2_2.setVisible(false);
					c1.setVisible(false);
				}
			}

			if (c2.isVisible() && !c1_2.isVisible() && !c2_2.isVisible() && !c3_2.isVisible() && !c4_2.isVisible()){
				window.setScene(level3);
				window.setTitle("Level 3");
			}

		};




		EventHandler<ActionEvent> eventHandler3_2 = e -> {
			if (hLine3_1_2.getStartX() >= 352.5 && hLine3_1_2.getEndX() <= 387.5){
				hLine3_1_2.setStartX(hLine3_1_2.getStartX() - 1);
				hLine3_1_2.setEndX(hLine3_1_2.getEndX() + 1);
			}

			if (vLine3_1_2.getStartY() < vLine3_1_2.getEndY())
				vLine3_1_2.setStartY(vLine3_1_2.getStartY() + 1.5);

			else {
				vLine3_1_2.setOpacity(vLine3_1_2.getOpacity() - 0.15);
				vLine3_2_2.setOpacity(vLine3_2_2.getOpacity() - 0.15);
				hLine3_1_2.setOpacity(hLine3_1_2.getOpacity() - 0.15);
				c3_2.setOpacity(c3_2.getOpacity() - 0.15);
				c3_2.setRadius(c3_2.getRadius() - 4);
				hLine3_1_2.setStartX(hLine3_1_2.getStartX() + 4);
				hLine3_1_2.setEndX(hLine3_1_2.getEndX() - 4);

				if(c3_2.getOpacity() < 0.15){
					vLine3_1_2.setVisible(false);
					vLine3_2_2.setVisible(false);
					hLine3_1_2.setVisible(false);
					c3_2.setVisible(false);
					c1.setVisible(false);
				}

			}

			if (c2.isVisible() && !c1_2.isVisible() && !c2_2.isVisible() && !c3_2.isVisible() && !c4_2.isVisible()){
				window.setScene(level3);
				window.setTitle("Level 3");
			}

		};


		EventHandler<ActionEvent> eventHandler4_2 = e -> {

			if (vLine4_1_2.getStartY() >= 202.5 && vLine4_1_2.getEndY() <= 237.5){
				vLine4_1_2.setStartY(vLine4_1_2.getStartY() - 1);
				vLine4_1_2.setEndY(vLine4_1_2.getEndY() + 1);
			}

			if (hLine4_2_2.getStartX() < hLine4_2_2.getEndX()){
				hLine4_2_2.setStartX(hLine4_2_2.getStartX() + 1.5);
			}
			else
				hLine4_2_2.setVisible(false);

			if(arc4_1_2.getCenterX() + 5 < vLine4_1_2.getStartX() - arc4_1_2.getRadiusX()){
				arc4_1_2.setCenterX(arc4_1_2.getCenterX() + 1.5);
			}

			else if(arc4_1_2.getCenterX()  < vLine4_1_2.getStartX() + arc4_1_2.getRadiusX() &&
					arc4_1_2.getLength() >= 6){
				arc4_1_2.setCenterX(arc4_1_2.getCenterX() + 1.5);
				arc4_1_2.setStartAngle(arc4_1_2.getStartAngle() + 6);
				arc4_1_2.setLength(arc4_1_2.getLength() - 6);
			}

			else
				arc4_1_2.setVisible(false);

			if (hLine4_1_2.getEndX() + 1.5 < vLine4_1_2.getEndX()) {
				hLine4_1_2.setStartX(hLine4_1_2.getStartX() + 1.5);
				hLine4_1_2.setEndX(hLine4_1_2.getEndX() + 1.5);
			}

			else if(hLine4_1_2.getStartX() < hLine4_1_2.getEndX() ){
				hLine4_1_2.setStartX(hLine4_1_2.getStartX() + 1.5);
			}

			else{
				vLine4_1_2.setOpacity(vLine4_1_2.getOpacity() - 0.15);
				vLine4_2_2.setOpacity(vLine4_2_2.getOpacity() - 0.15);
				hLine4_1_2.setOpacity(hLine4_1_2.getOpacity() - 0.15);
				hLine4_3_2.setOpacity(hLine4_3_2.getOpacity() - 0.15);
				arc4_2_2.setOpacity(arc4_2_2.getOpacity() - 0.15);
				c4_2.setOpacity(c4_2.getOpacity() - 0.15);
				c4_2.setRadius(c4_2.getRadius() - 4);
				vLine4_1_2.setStartY(vLine4_1_2.getStartY() + 4);
				vLine4_1_2.setEndY(vLine4_1_2.getEndY() - 4);

				if(c4_2.getOpacity() < 0.15){
					hLine4_1_2.setVisible(false);
					hLine4_3_2.setVisible(false);
					vLine4_1_2.setVisible(false);
					vLine4_2_2.setVisible(false);
					arc4_2_2.setVisible(false);
					c4_2.setVisible(false);
					c1.setVisible(false);
				}
			}

			if (c2.isVisible() && !c1_2.isVisible() && !c2_2.isVisible() && !c3_2.isVisible() && !c4_2.isVisible()){
				window.setScene(level3);
				window.setTitle("Level 3");
			}

		};



		EventHandler<ActionEvent> eventHandler1_3 = e -> {

			if (vLine1_1_3.getStartY() >= 20 && vLine1_1_3.getEndY() <= 55) {
				vLine1_1_3.setStartY(vLine1_1_3.getStartY() - 1);

				vLine1_1_3.setEndY(vLine1_1_3.getEndY() + 1);
			}
			if (hLine1_1_3.getStartX() < hLine1_1_3.getEndX()) {
				hLine1_1_3.setEndX(hLine1_1_3.getEndX() - 1.5);
			}

			else
				hLine1_1_3.setVisible(false);

			if (hLine1_2_3.getStartX() - 1.5 > hLine1_1_3.getEndX()) {
				hLine1_2_3.setStartX(hLine1_2_3.getStartX() - 1.5);
				hLine1_2_3.setEndX(hLine1_2_3.getEndX() - 1.5);
			}

			else if (hLine1_2_3.getStartX() + 1.5 < hLine1_2_3.getEndX()) {
				hLine1_2_3.setEndX(hLine1_2_3.getEndX() - 1.5);
			}

			else {
				vLine1_1_3.setOpacity(vLine1_1_3.getOpacity() - 0.15);
				vLine1_2_3.setOpacity(vLine1_2_3.getOpacity() - 0.15);
				hLine1_1_3.setOpacity(hLine1_1_3.getOpacity() - 0.15);
				hLine1_2_3.setOpacity(hLine1_2_3.getOpacity() - 0.15);
				hLine1_3_3.setOpacity(hLine1_3_3.getOpacity() - 0.15);
				arc1_2_3.setOpacity(arc1_2_3.getOpacity() - 0.15);
				c1_3.setOpacity(c1_3.getOpacity() - 0.15);
				c1_3.setRadius(c1_3.getRadius() - 4);
				vLine1_1_3.setStartY(vLine1_1_3.getStartY() + 4);
				vLine1_1_3.setEndY(vLine1_1_3.getEndY() - 4);

				if(c1_3.getOpacity() < 0.15){
					arc1_2_3.setVisible(false);
					hLine1_1_3.setVisible(false);
					hLine1_2_3.setVisible(false);
					hLine1_3_3.setVisible(false);
					vLine1_1_3.setVisible(false);
					vLine1_2_3.setVisible(false);
					c1_3.setVisible(false);
					c2.setVisible(false);
				}
			}

			if (arc1_1_3.getCenterX() - 5 > hLine1_1_3.getStartX() + arc1_1_3.getRadiusX()) {
				arc1_1_3.setCenterX(arc1_1_3.getCenterX() - 1.5);
			}

			else if (arc1_1_3.getCenterX() > hLine1_1_3.getStartX() - arc1_1_3.getRadiusX() && arc1_1_3.getLength() >= 7.1) {
				arc1_1_3.setCenterX(arc1_1_3.getCenterX() - 1.5);
				arc1_1_3.setLength(arc1_1_3.getLength() - 6);
			}

			else
				arc1_1_3.setVisible(false);


			if (c3.isVisible() && !c1_3.isVisible() && !c2_3.isVisible() && !c3_3.isVisible()){
				window.setScene(level4);
				window.setTitle("Level 4");
			}

		};

		EventHandler<ActionEvent> eventHandler2_3 = e -> {

			if (vLine2_2_3.getStartY() >= 102.5 && hLine1_3_3.getEndY() <= 137.5) {
				vLine2_2_3.setStartY(vLine2_2_3.getStartY() - 1);
				vLine2_2_3.setEndY(vLine2_2_3.getEndY() + 1);
			}

			if (hLine2_3_3.getStartX() < hLine2_3_3.getEndX()) {
				hLine2_3_3.setEndX(hLine2_3_3.getEndX() - 1.5);
			}

			else {
				vLine2_1_3.setOpacity(vLine2_1_3.getOpacity() - 0.15);
				vLine2_2_3.setOpacity(vLine2_2_3.getOpacity() - 0.15);
				hLine2_1_3.setOpacity(hLine2_1_3.getOpacity() - 0.15);
				hLine2_2_3.setOpacity(hLine2_2_3.getOpacity() - 0.15);
				hLine2_3_3.setOpacity(hLine2_3_3.getOpacity() - 0.15);
				arc2_1_3.setOpacity(arc2_1_3.getOpacity() - 0.15);
				arc2_2_3.setOpacity(arc2_2_3.getOpacity() - 0.15);
				c2_3.setOpacity(c2_3.getOpacity() - 0.15);
				c2_3.setRadius(c2_3.getRadius() - 4);
				vLine2_2_3.setStartY(vLine2_2_3.getStartY() + 4);
				vLine2_2_3.setEndY(vLine2_2_3.getEndY() - 4);

				if(c2_3.getOpacity() < 0.15){
					hLine2_3_3.setVisible(false);
					arc2_1_3.setVisible(false);
					arc2_2_3.setVisible(false);
					c2_3.setVisible(false);
					hLine2_1_3.setVisible(false);
					hLine2_2_3.setVisible(false);
					vLine2_1_3.setVisible(false);
					vLine2_2_3.setVisible(false);
					c2.setVisible(false);
				}

			}

			if (c3.isVisible() && !c1_3.isVisible() && !c2_3.isVisible() && !c3_3.isVisible()){
				window.setScene(level4);
				window.setTitle("Level 4");
			}

		};

		EventHandler<ActionEvent> eventHandler3_3 = e -> {

			if (hLine3_2_3.getStartX() >= 362.5 && hLine3_2_3.getEndX() <= 397.5) {
				hLine3_2_3.setStartX(hLine3_2_3.getStartX() - 1);
				hLine3_2_3.setEndX(hLine3_2_3.getEndX() + 1);
			}

			if (vLine3_2_3.getStartY() < vLine3_2_3.getEndY()) {
				vLine3_2_3.setStartY(vLine3_2_3.getStartY() + 1.5);
			}

			else
				vLine3_2_3.setVisible(false);

			if (vLine3_3_3.getEndY() + 1.5 < vLine3_2_3.getStartY()) {
				vLine3_3_3.setEndY(vLine3_3_3.getEndY() + 1.5);
				vLine3_3_3.setStartY(vLine3_3_3.getStartY() + 1.5);
			}

			else if (vLine3_3_3.getStartY() < vLine3_3_3.getEndY()) {
				vLine3_3_3.setStartY(vLine3_3_3.getStartY() + 1.5);
			}

			else {
				vLine3_1_3.setOpacity(vLine3_1_3.getOpacity() - 0.15);
				vLine3_2_3.setOpacity(vLine3_2_3.getOpacity() - 0.15);
				vLine3_3_3.setOpacity(vLine3_3_3.getOpacity() - 0.15);
				hLine3_1_3.setOpacity(hLine3_1_3.getOpacity() - 0.15);
				hLine3_2_3.setOpacity(hLine3_1_3.getOpacity() - 0.15);
				arc3_1_3.setOpacity(arc3_1_3.getOpacity() - 0.15);
				c3_3.setOpacity(c3_3.getOpacity() - 0.15);
				c3_3.setRadius(c3_3.getRadius() - 4);
				hLine3_2_3.setStartX(hLine3_2_3.getStartX() + 4);
				hLine3_2_3.setEndX(hLine3_2_3.getEndX() - 4);

				if(c3_3.getOpacity() < 0.15){
					arc3_1_3.setVisible(false);
					hLine3_1_3.setVisible(false);
					hLine3_2_3.setVisible(false);
					vLine3_3_3.setVisible(false);
					vLine3_1_3.setVisible(false);
					vLine3_2_3.setVisible(false);
					c3_3.setVisible(false);
					c2.setVisible(false);
				}
			}

			if (arc3_2_3.getCenterY() + 5 < hLine3_2_3.getStartY() - arc3_2_3.getRadiusY()) {
				arc3_2_3.setCenterY(arc3_2_3.getCenterY() + 1.5);
			}

			else if (arc3_2_3.getCenterY() < hLine3_2_3.getStartY() + arc3_2_3.getRadiusY() &&
					arc3_2_3.getLength() >= 6) {
				arc3_2_3.setCenterY(arc3_2_3.getCenterY() + 1.5);
				arc3_2_3.setStartAngle(arc3_2_3.getStartAngle() + 6);
				arc3_2_3.setLength(arc3_2_3.getLength() - 6);
			}
			else
				arc3_2_3.setVisible(false);


			if (c3.isVisible() && !c1_3.isVisible() && !c2_3.isVisible() && !c3_3.isVisible()){
				window.setScene(level4);
				window.setTitle("Level 4");
			}

		};




		EventHandler<ActionEvent> eventHandler1_4 = e -> {
			if (a_4 == false) {
				if (hLine1_3_4.getStartX() >= 358.5 && hLine1_3_4.getEndX() <= 393.5) {
					hLine1_3_4.setStartX(hLine1_3_4.getStartX() - 1);
					hLine1_3_4.setEndX(hLine1_3_4.getEndX() + 1);
				}

				if (vLine1_2_4.getStartY() > vLine1_2_4.getEndY()) {
					vLine1_2_4.setEndY(vLine1_2_4.getEndY() + 1.5);
				}

				else {
					vLine1_1_4.setOpacity(vLine1_1_4.getOpacity() - 0.15);
					vLine1_2_4.setOpacity(vLine1_2_4.getOpacity() - 0.15);
					hLine1_3_4.setOpacity(hLine1_3_4.getOpacity() - 0.15);
					hLine1_2_4.setOpacity(hLine1_2_4.getOpacity() - 0.15);
					hLine1_1_4.setOpacity(hLine1_1_4.getOpacity() - 0.15);
					arc1_1_4.setOpacity(arc1_1_4.getOpacity() - 0.15);
					c1_4.setOpacity(c1_4.getOpacity() - 0.15);
					c1_4.setRadius(c1_4.getRadius() - 4);
					hLine1_3_4.setStartX(hLine1_3_4.getStartX() + 4);
					hLine1_3_4.setEndX(hLine1_3_4.getEndX() - 4);

					if(c1_4.getOpacity() < 0.1){
						vLine1_1_4.setVisible(false);
						vLine1_2_4.setVisible(false);
						arc1_1_4.setVisible(false);
						c1_4.setVisible(false);
						hLine1_1_4.setVisible(false);
						hLine1_2_4.setVisible(false);
						hLine1_3_4.setVisible(false);
						c3.setVisible(false);
					}
				}
			}

			if (!c1_4.isVisible() && !c2_4.isVisible()){
				c1_2_4.setOpacity(c1_2_4.getOpacity() - 0.15);
				vLine2_2_4.setOpacity(vLine2_2_4.getOpacity() - 0.15);
				c1_2_4.setRadius(c1_2_4.getRadius() - 4);

				if(c1_2_4.getOpacity() < 0.1){
					c1_2_4.setVisible(false);
					vLine2_2_4.setVisible(false);
				}
			}

			if (c4.isVisible() && !c1_4.isVisible() && !c2_4.isVisible()){
				window.setScene(level5);
				window.setTitle("Level 5");
			}
		};


		EventHandler<ActionEvent> eventHandler2_4 = e -> {
			if (a_4 == true) {

			if (vLine2_4_4.getStartY() >= 36.5 && vLine2_4_4.getEndY() <= 71.5) {
				vLine2_4_4.setStartY(vLine2_4_4.getStartY() - 1);
				vLine2_4_4.setEndY(vLine2_4_4.getEndY() + 1);
			}

			if (hLine2_2_4.getStartX() < hLine2_2_4.getEndX()) {
				hLine2_2_4.setEndX(hLine2_2_4.getEndX() - 1.5);
			}

			else
				hLine2_2_4.setVisible(false);

			if (hLine2_3_4.getStartX() - 1.5 > hLine2_2_4.getEndX()) {
				hLine2_3_4.setStartX(hLine2_3_4.getStartX() - 1.5);
				hLine2_3_4.setEndX(hLine2_3_4.getEndX() - 1.5);
			}

			else if (hLine2_3_4.getStartX() + 1.5 < hLine2_3_4.getEndX()) {
				hLine2_3_4.setEndX(hLine2_3_4.getEndX() - 1.5);
			}

			else {
				vLine2_1_4.setOpacity(vLine2_1_4.getOpacity() - 0.15);
				vLine2_3_4.setOpacity(vLine2_3_4.getOpacity() - 0.15);
				vLine2_4_4.setOpacity(vLine2_4_4.getOpacity() - 0.15);
				hLine2_1_4.setOpacity(hLine2_1_4.getOpacity() - 0.15);
				hLine2_3_4.setOpacity(hLine2_3_4.getOpacity() - 0.15);
				arc2_1_4.setOpacity(arc2_1_4.getOpacity() - 0.15);
				arc2_1_4.setOpacity(arc2_1_4.getOpacity() - 0.15);
				c2_4.setOpacity(c2_4.getOpacity() - 0.15);
				c2_4.setRadius(c2_4.getRadius() - 4);
				vLine2_4_4.setStartY(vLine2_4_4.getStartY() + 4);
				vLine2_4_4.setEndY(vLine2_4_4.getEndY() - 4);

				if(c2_4.getOpacity() < 0.1){
					arc2_1_4.setVisible(false);
					arc2_2_4.setVisible(false);
					hLine2_1_4.setVisible(false);
					hLine2_3_4.setVisible(false);
					vLine2_1_4.setVisible(false);
					vLine2_3_4.setVisible(false);
					vLine2_4_4.setVisible(false);
					c2_4.setVisible(false);
					c3.setVisible(false);
				}
			}

			if (arc2_2_4.getCenterX() - 5 > hLine2_2_4.getStartX() + arc2_2_4.getRadiusX()) {
				arc2_2_4.setCenterX(arc2_2_4.getCenterX() - 1.5);
			}

			else if (arc2_2_4.getCenterX() > hLine2_2_4.getStartX() - arc2_2_4.getRadiusX() && arc2_2_4.getLength() >= 7.1) {
				arc2_2_4.setCenterX(arc2_2_4.getCenterX() - 1.5);
				arc2_2_4.setLength(arc2_2_4.getLength() - 6);
			}
			else
				arc2_2_4.setVisible(false);
			}

			if (!c1_4.isVisible() && !c2_4.isVisible()){
				c1_2_4.setOpacity(c1_2_4.getOpacity() - 0.15);
				vLine2_2_4.setOpacity(vLine2_2_4.getOpacity() - 0.15);
				c1_2_4.setRadius(c1_2_4.getRadius() - 4);

				if(c1_2_4.getOpacity() < 0.1){
					c1_2_4.setVisible(false);
					vLine2_2_4.setVisible(false);
				}
			}

			if (c4.isVisible() && !c1_4.isVisible() && !c2_4.isVisible()){
				window.setScene(level5);
				window.setTitle("Level 5");
			}
		};



		EventHandler<ActionEvent> eventHandler1_5 = e -> {
			if(a_5 == true && b_5 == false){

				if (vLine1_1_5.getStartY() >= 20 && vLine1_1_5.getEndY() <= 55) {
					vLine1_1_5.setStartY(vLine1_1_5.getStartY() - 1);
					vLine1_1_5.setEndY(vLine1_1_5.getEndY() + 1);
				}

				if (hLine1_1_5.getStartX() < hLine1_1_5.getEndX()) {
					hLine1_1_5.setEndX(hLine1_1_5.getEndX() - 1.5);
				}

				else
					hLine1_1_5.setVisible(false);

				if (hLine1_2_5.getStartX() - 1.5 > hLine1_1_5.getEndX()) {
					hLine1_2_5.setStartX(hLine1_2_5.getStartX() - 1.5);
					hLine1_2_5.setEndX(hLine1_2_5.getEndX() - 1.5);
				}

				else if (hLine1_2_5.getStartX() + 1.5 < hLine1_2_5.getEndX()) {
					hLine1_2_5.setEndX(hLine1_2_5.getEndX() - 1.5);
				}

				else {
					vLine1_1_5.setOpacity(vLine1_1_5.getOpacity() - 0.15);
					vLine1_2_5.setOpacity(vLine1_2_5.getOpacity() - 0.15);
					vLine1_3_5.setOpacity(vLine1_3_5.getOpacity() - 0.15);
					hLine1_1_5.setOpacity(hLine1_1_5.getOpacity() - 0.15);
					hLine1_2_5.setOpacity(hLine1_2_5.getOpacity() - 0.15);
					hLine1_3_5.setOpacity(hLine1_3_5.getOpacity() - 0.15);
					hLine1_4_5.setOpacity(hLine1_4_5.getOpacity() - 0.15);
					arc1_2_5.setOpacity(arc1_2_5.getOpacity() - 0.15);
					c1_5.setOpacity(c1_5.getOpacity() - 0.15);
					c1_5.setRadius(c1_5.getRadius() - 4);
					vLine1_1_5.setStartY(vLine1_1_5.getStartY() + 4);
					vLine1_1_5.setEndY(vLine1_1_5.getEndY() - 4);

					if(c1_5.getOpacity() < 0.15){
						arc1_2_5.setVisible(false);
						hLine1_1_5.setVisible(false);
						hLine1_2_5.setVisible(false);
						hLine1_3_5.setVisible(false);
						hLine1_4_5.setVisible(false);
						vLine1_1_5.setVisible(false);
						vLine1_2_5.setVisible(false);
						vLine1_3_5.setVisible(false);
						c1_5.setVisible(false);
						c4.setVisible(false);
					}
				}

				if (arc1_1_5.getCenterX() - 5 > hLine1_1_5.getStartX() + arc1_1_5.getRadiusX()) {
					arc1_1_5.setCenterX(arc1_1_5.getCenterX() - 1.5);
				}

				else if (arc1_1_5.getCenterX() > hLine1_1_5.getStartX() - arc1_1_5.getRadiusX() && arc1_1_5.getLength() >= 7.1) {
					arc1_1_5.setCenterX(arc1_1_5.getCenterX() - 1.5);
					arc1_1_5.setLength(arc1_1_5.getLength() - 6);
				} else
					arc1_1_5.setVisible(false);


				if (!c3_5.isVisible()  && !c1_5.isVisible()){
					c0_1_5.setOpacity(c0_1_5.getOpacity() - 0.15);
					vLine0_1_5.setOpacity(vLine0_1_5.getOpacity() - 0.15);
					c0_1_5.setRadius(c0_1_5.getRadius() - 4);
					if(c0_1_5.getOpacity() < 0.1){
						c0_1_5.setVisible(false);
						vLine0_1_5.setVisible(false);
					}
				}

				if (!c1_5.isVisible() && !c2_5.isVisible()){

					c0_2_5.setOpacity(c0_2_5.getOpacity() - 0.15);
					hLine0_4_5.setOpacity(hLine0_4_5.getOpacity() - 0.15);
					c0_2_5.setRadius(c0_2_5.getRadius() - 4);

					if(c0_2_5.getOpacity() < 0.1){
						c0_2_5.setVisible(false);
						hLine0_4_5.setVisible(false);
					}
				}
			}

			if (!c1_5.isVisible() && !c2_5.isVisible() && !c3_5.isVisible() && !c4_5.isVisible()){
				window.setScene(scene_final);
				window.setTitle("YOU WON");
			}

		};


		EventHandler<ActionEvent> eventHandler2_5 = e -> {

			if (b_5 == true){

				if (hLine2_3_5.getStartX() >= 332.5 && hLine2_3_5.getEndX() <= 367.5){
					hLine2_3_5.setStartX(hLine2_3_5.getStartX() - 1);
					hLine2_3_5.setEndX(hLine2_3_5.getEndX() + 1);
				}

				if (vLine2_2_5.getStartY() < vLine2_2_5.getEndY()){
					vLine2_2_5.setStartY(vLine2_2_5.getStartY() + 1.5);
				}

				else
					vLine2_2_5.setVisible(false);

				if(arc2_1_5.getCenterY() + 2.5 < hLine2_1_5.getStartY() - 2 * arc2_1_5.getRadiusY()){
					arc2_1_5.setCenterY(arc2_1_5.getCenterY() + 1.5);
				}

				else if(arc2_1_5.getCenterY() < hLine2_1_5.getStartY() + arc2_1_5.getRadiusY() &&
						arc2_1_5.getLength() >= 6){
					arc2_1_5.setCenterY(arc2_1_5.getCenterY() + 1.5);
					arc2_1_5.setStartAngle(arc2_1_5.getStartAngle() + 6);
					arc2_1_5.setLength(arc2_1_5.getLength() -6);
				}

				else
					arc2_1_5.setVisible(false);


				if (vLine2_1_5.getEndY() + 1.5 < hLine2_3_5.getEndY()) {
					vLine2_1_5.setStartY(vLine2_1_5.getStartY() + 1.5);
					vLine2_1_5.setEndY(vLine2_1_5.getEndY() + 1.5);
				}
				else if(vLine2_1_5.getStartY() < vLine2_1_5.getEndY() ){
					vLine2_1_5.setStartY(vLine2_1_5.getStartY() + 1.5);
				}

				else{
					vLine2_1_5.setOpacity(vLine2_1_5.getOpacity() - 0.15);
					vLine2_3_5.setOpacity(vLine2_3_5.getOpacity() - 0.15);
					hLine2_1_5.setOpacity(hLine2_1_5.getOpacity() - 0.15);
					hLine2_2_5.setOpacity(hLine2_2_5.getOpacity() - 0.15);
					hLine2_3_5.setOpacity(hLine2_3_5.getOpacity() - 0.15);
					arc2_2_5.setOpacity(arc2_2_5.getOpacity() - 0.15);
					c2_5.setOpacity(c2_5.getOpacity() - 0.15);
					c2_5.setRadius(c2_5.getRadius() - 4);
					hLine2_3_5.setStartX(hLine2_3_5.getStartX() + 4);
					hLine2_3_5.setEndX(hLine2_3_5.getEndX() - 4);

					if(c2_5.getOpacity() < 0.15){
						hLine2_1_5.setVisible(false);
						hLine2_2_5.setVisible(false);
						hLine2_3_5.setVisible(false);
						vLine2_1_5.setVisible(false);
						vLine2_3_5.setVisible(false);
						arc2_2_5.setVisible(false);
						c2_5.setVisible(false);
						c4.setVisible(false);
					}
				}

				if (!c3_5.isVisible()  && !c1_5.isVisible()){
					c0_1_5.setOpacity(c0_1_5.getOpacity() - 0.15);
					vLine0_1_5.setOpacity(vLine0_1_5.getOpacity() - 0.15);
					c0_1_5.setRadius(c0_1_5.getRadius() - 4);

					if(c0_1_5.getOpacity() < 0.1){
						c0_1_5.setVisible(false);
						vLine0_1_5.setVisible(false);
					}
				}

				if (!c1_5.isVisible() && !c2_5.isVisible()){

					c0_2_5.setOpacity(c0_2_5.getOpacity() - 0.15);
					hLine0_4_5.setOpacity(hLine0_4_5.getOpacity() - 0.15);
					c0_2_5.setRadius(c0_2_5.getRadius() - 4);

					if(c0_2_5.getOpacity() < 0.1){
						c0_2_5.setVisible(false);
						hLine0_4_5.setVisible(false);
					}
				}
			}

			if (!c1_5.isVisible() && !c2_5.isVisible() && !c3_5.isVisible() && !c4_5.isVisible()){
				window.setScene(scene_final);
				window.setTitle("YOU WON");
			}

		};




		EventHandler<ActionEvent> eventHandler3_5 = e -> {

			if ( a_5 == false){

				if (hLine3_1_5.getStartX() >= 252.5 && hLine3_1_5.getEndX() <= 287.5){
					hLine3_1_5.setStartX(hLine3_1_5.getStartX() - 1);
					hLine3_1_5.setEndX(hLine3_1_5.getEndX() + 1);
				}

				if (vLine3_2_5.getStartY() < vLine3_2_5.getEndY()){
					vLine3_2_5.setStartY(vLine3_2_5.getStartY() + 1.5);
				}
				else
					vLine3_2_5.setVisible(false);

				if(arc3_1_5.getCenterY() +5 < hLine3_1_5.getStartY() -  arc3_1_5.getRadiusY()){
					arc3_1_5.setCenterY(arc3_1_5.getCenterY() + 1.5);
				}

				else if(arc3_1_5.getCenterY() < hLine3_1_5.getStartY() + arc3_1_5.getRadiusY() &&
						arc3_1_5.getLength() >= 6){
					arc3_1_5.setCenterY(arc3_1_5.getCenterY() + 1.5);
					arc3_1_5.setLength(arc3_1_5.getLength() -6);
				}

				else
					arc3_1_5.setVisible(false);


				if (vLine3_1_5.getEndY() + 1.5 < hLine3_1_5.getEndY()) {
					vLine3_1_5.setStartY(vLine3_1_5.getStartY() + 1.5);
					vLine3_1_5.setEndY(vLine3_1_5.getEndY() + 1.5);
				}
				else if(vLine3_1_5.getStartY() < vLine3_1_5.getEndY() ){
					vLine3_1_5.setStartY(vLine3_1_5.getStartY() + 1.5);
				}
				else{
					vLine3_1_5.setOpacity(vLine3_1_5.getOpacity() - 0.15);
					vLine3_3_5.setOpacity(vLine3_3_5.getOpacity() - 0.15);
					hLine3_1_5.setOpacity(hLine3_1_5.getOpacity() - 0.15);
					hLine3_2_5.setOpacity(hLine3_2_5.getOpacity() - 0.15);
					hLine3_3_5.setOpacity(hLine3_3_5.getOpacity() - 0.15);
					arc3_2_5.setOpacity(arc3_2_5.getOpacity() - 0.15);
					c3_5.setOpacity(c3_5.getOpacity() - 0.15);
					c3_5.setRadius(c3_5.getRadius() - 4);
					hLine3_1_5.setStartX(hLine3_1_5.getStartX() + 4);
					hLine3_1_5.setEndX(hLine3_1_5.getEndX() - 4);

					if(c3_5.getOpacity() < 0.15){
						hLine3_1_5.setVisible(false);
						hLine3_2_5.setVisible(false);
						hLine3_3_5.setVisible(false);
						vLine3_1_5.setVisible(false);
						vLine3_3_5.setVisible(false);
						arc3_2_5.setVisible(false);
						c3_5.setVisible(false);
						c4.setVisible(false);
					}
				}

				if (!c3_5.isVisible()  && !c1_5.isVisible()){
					c0_1_5.setOpacity(c0_1_5.getOpacity() - 0.15);
					vLine0_1_5.setOpacity(vLine0_1_5.getOpacity() - 0.15);
					c0_1_5.setRadius(c0_1_5.getRadius() - 4);
					if(c0_1_5.getOpacity() < 0.1){
						c0_1_5.setVisible(false);
						vLine0_1_5.setVisible(false);
					}
				}

				if (!c1_5.isVisible() && !c2_5.isVisible()){

					c0_2_5.setOpacity(c0_2_5.getOpacity() - 0.15);
					hLine0_4_5.setOpacity(hLine0_4_5.getOpacity() - 0.15);
					c0_2_5.setRadius(c0_2_5.getRadius() - 4);
					if(c0_2_5.getOpacity() < 0.1){
						c0_2_5.setVisible(false);
						hLine0_4_5.setVisible(false);
					}
				}
			}

			if (!c1_5.isVisible() && !c2_5.isVisible() && !c3_5.isVisible() && !c4_5.isVisible()){
				window.setScene(scene_final);
				window.setTitle("YOU WON");
			}

		};

		EventHandler<ActionEvent> eventHandler4_5 = e -> {
			if (vLine4_1_5.getStartY() >= 52.5 && vLine4_1_5.getEndY() <= 87.5){
				vLine4_1_5.setStartY(vLine4_1_5.getStartY() - 1);
				vLine4_1_5.setEndY(vLine4_1_5.getEndY() + 1);
			}

			if (hLine4_1_5.getStartX() + 2.5 < hLine4_1_5.getEndX())
				hLine4_1_5.setStartX(hLine4_1_5.getStartX() + 1.5);
			else {
				vLine4_1_5.setOpacity(vLine4_1_5.getOpacity() - 0.15);
				vLine4_2_5.setOpacity(vLine4_2_5.getOpacity() - 0.15);
				hLine4_1_5.setOpacity(hLine4_1_5.getOpacity() - 0.15);
				hLine4_2_5.setOpacity(hLine4_2_5.getOpacity() - 0.15);
				arc4_1_5.setOpacity(arc4_1_5.getOpacity() - 0.15);
				c4_5.setOpacity(c4_5.getOpacity() - 0.15);
				c4_5.setRadius(c4_5.getRadius() - 4);
				vLine4_1_5.setStartY(vLine4_1_5.getStartY() + 4);
				vLine4_1_5.setEndY(vLine4_1_5.getEndY() - 4);

				if(c2_5.getOpacity() < 0.15){
					vLine4_1_5.setVisible(false);
					vLine4_2_5.setVisible(false);
					hLine4_1_5.setVisible(false);
					hLine4_2_5.setVisible(false);
					arc4_1_5.setVisible(false);
					c4_5.setVisible(false);
					c4.setVisible(false);
				}

			}

			if (!c3_5.isVisible()  && !c1_5.isVisible()){
				c0_1_5.setOpacity(c0_1_5.getOpacity() - 0.15);
				vLine0_1_5.setOpacity(vLine0_1_5.getOpacity() - 0.15);
				c0_1_5.setRadius(c0_1_5.getRadius() - 4);
				if(c0_1_5.getOpacity() < 0.1){
					c0_1_5.setVisible(false);
					vLine0_1_5.setVisible(false);
				}
			}

			if (!c1_5.isVisible() && !c2_5.isVisible()){

				c0_2_5.setOpacity(c0_2_5.getOpacity() - 0.15);
				hLine0_4_5.setOpacity(hLine0_4_5.getOpacity() - 0.15);
				c0_2_5.setRadius(c0_2_5.getRadius() - 4);
				if(c0_2_5.getOpacity() < 0.1){
					c0_2_5.setVisible(false);
					hLine0_4_5.setVisible(false);
				}
			}

			if (!c1_5.isVisible() && !c2_5.isVisible() && !c3_5.isVisible() && !c4_5.isVisible()){
				window.setScene(scene_final);
				window.setTitle("YOU WON");
			}

		};


		//create animations
		Timeline animation1_1 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler1_1));
		animation1_1.setCycleCount(Timeline.INDEFINITE);

		Timeline animation2_1 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler2_1));
		animation2_1.setCycleCount(Timeline.INDEFINITE);


		Timeline animation1_2 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler1_2));
		animation1_2.setCycleCount(Timeline.INDEFINITE);

		Timeline animation2_2 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler2_2));
		animation2_2.setCycleCount(Timeline.INDEFINITE);

		Timeline animation3_2 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler3_2));
		animation3_2.setCycleCount(Timeline.INDEFINITE);

		Timeline animation4_2 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler4_2));
		animation4_2.setCycleCount(Timeline.INDEFINITE);


		Timeline animation1_3 = new Timeline(new KeyFrame(Duration.millis(20), eventHandler1_3));
		animation1_3.setCycleCount(Timeline.INDEFINITE);

		Timeline animation2_3 = new Timeline(new KeyFrame(Duration.millis(20), eventHandler2_3));
		animation2_3.setCycleCount(Timeline.INDEFINITE);

		Timeline animation3_3 = new Timeline(new KeyFrame(Duration.millis(20), eventHandler3_3));
		animation3_3.setCycleCount(Timeline.INDEFINITE);


		Timeline animation1_4 = new Timeline(new KeyFrame(Duration.millis(20), eventHandler1_4));
		animation1_4.setCycleCount(Timeline.INDEFINITE);

		Timeline animation2_4 = new Timeline(new KeyFrame(Duration.millis(20), eventHandler2_4));
		animation2_4.setCycleCount(Timeline.INDEFINITE);


		Timeline animation1_5 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler1_5));
		animation1_5.setCycleCount(Timeline.INDEFINITE);

		Timeline animation2_5 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler2_5));
		animation2_5.setCycleCount(Timeline.INDEFINITE);


		Timeline animation3_5 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler3_5));
		animation3_5.setCycleCount(Timeline.INDEFINITE);

		Timeline animation4_5 = new Timeline(
				new KeyFrame(Duration.millis(20), eventHandler4_5));
		animation4_5.setCycleCount(Timeline.INDEFINITE);

		//we want the text in the final to blink.
		FadeTransition ft =
				new FadeTransition(Duration.millis(500), won);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();



		//When the circles are pressed, relevant animations will start.
		c1_1_1.setOnMousePressed(e -> animation1_1.play());
		c2_1_1.setOnMousePressed(e -> animation2_1.play());

		c1_2.setOnMousePressed(e -> animation1_2.play());
		c2_2.setOnMousePressed(e -> animation2_2.play());
		c3_2.setOnMousePressed(e -> animation3_2.play());
		c4_2.setOnMousePressed(e -> animation4_2.play());


		c1_3.setOnMousePressed(e -> animation1_3.play());
		c2_3.setOnMousePressed(e -> animation2_3.play());
		c3_3.setOnMousePressed(e -> animation3_3.play());


		c1_4.setOnMousePressed(e -> animation1_4.play());
		c2_4.setOnMousePressed(e -> animation2_4.play());
		c1_2_4.setOnMousePressed(e -> setDirection_4(vLine2_2_4));


		c1_5.setOnMousePressed(e -> animation1_5.play());
		c2_5.setOnMousePressed(e -> animation2_5.play());
		c3_5.setOnMousePressed(e -> animation3_5.play());
		c4_5.setOnMousePressed(e -> animation4_5.play());

		c0_1_5.setOnMousePressed(e -> vsetDirection_5(vLine0_1_5));
		c0_2_5.setOnMousePressed(e -> hsetDirection_5(hLine0_4_5));


		//the following eventHandlers are checking collision situations.
		EventHandler<ActionEvent> eventHandler3_1 = e -> {

			if (vLine2_1_1.getStartY() - 2 <= arc1_1_1.getCenterY() && vLine2_1_1.getStartX() >= arc1_1_1.getCenterX() + 10){

				//initiated motion animations are stopping.
				animation1_1.stop();
				animation2_1.stop();

				//The pane is fading away.
				pane1.setOpacity(pane1.getOpacity() - 0.15);

			}
		};


		Timeline animation3_1 = new Timeline(
					new KeyFrame(Duration.millis(100), eventHandler3_1));
			animation3_1.setCycleCount(Timeline.INDEFINITE);
			animation3_1.play();


		EventHandler<ActionEvent> eventHandler4_1 = e -> {

			//when pane is completely deleted,
			if(pane1.getOpacity() <= 0.15){
				//the above eventHandler which controls collisions is being stopped for a short period of time.
				animation3_1.stop();

				//all the shapes that have moved are brought to their old places.
				vLine1_1_1.setStartY(30);
				vLine1_1_1.setEndY(45);
				hLine1_1_1.setEndX(275);
				arc1_1_1.setCenterX(295);
				arc1_1_1.setLength(180);
				hLine1_2_1.setStartX(315);
				hLine1_2_1.setEndX(365);

				//eventHandler which controls collisions is started again.
				animation3_1.play();
				pane1.setOpacity(1);
			}

			////When the circles are pressed, relevant animations will start again.
			c1_1_1.setOnMousePressed(a -> animation1_1.play());
			c2_1_1.setOnMousePressed(a -> animation2_1.play());

		};

		Timeline animation4_1 = new Timeline(
				new KeyFrame(Duration.millis(50), eventHandler4_1));
		animation4_1.setCycleCount(Timeline.INDEFINITE);
		animation4_1.play();


		EventHandler<ActionEvent> eventHandler5_2 = e -> {

			 if ((hLine1_1_2.getEndY() <= arc2_1_2.getCenterY() - 10 && hLine1_1_2.getEndX() + 2 >= arc2_1_2.getCenterX()) ||
					 (hLine4_1_2.getStartX() - 2 <= arc2_2_2.getCenterX() && hLine4_1_2.getStartY() <= arc2_2_2.getCenterY() - 10) ||
					 (vLine3_1_2.getStartY() - 2 <= arc4_1_2.getCenterY() && vLine3_1_2.getStartX() <= arc4_1_2.getCenterX() - 10)){

				 animation1_2.stop();
				 animation2_2.stop();
				 animation3_2.stop();
				 animation4_2.stop();

				 pane2.setOpacity(pane2.getOpacity() - 0.15);

			}


		 };


		 Timeline animation5_2 = new Timeline(
					new KeyFrame(Duration.millis(100), eventHandler5_2));
			animation5_2.setCycleCount(Timeline.INDEFINITE);
			animation5_2.play();


		EventHandler<ActionEvent> eventHandler6_2 = e -> {

			if(pane2.getOpacity() <= 0.15){
				animation5_2.stop();


				vLine1_1_2.setStartY(92.5);
				vLine1_1_2.setEndY(107.5);
				vLine2_2_2.setStartY(120);
				vLine2_2_2.setEndY(200);
				vLine2_1_2.setStartY(50);
				vLine2_1_2.setEndY(80);
				vLine2_3_2.setStartY(240);
				vLine3_1_2.setStartY(215);
				vLine4_1_2.setStartY(212.5);
				vLine4_1_2.setEndY(227.5);

				hLine1_1_2.setEndX(257.5);
				hLine2_1_2.setStartX(245);
				hLine2_1_2.setEndX(260);
				hLine3_1_2.setStartX(362.5);
				hLine3_1_2.setEndX(377.5);
				hLine4_2_2.setStartX(390);
				hLine4_1_2.setStartX(247.5);
				hLine4_1_2.setEndX(350);

				arc2_1_2.setCenterY(100);
				arc2_1_2.setStartAngle(270);
				arc2_1_2.setLength(180);
				arc2_2_2.setCenterY(220);
				arc2_2_2.setLength(180);
				arc4_1_2.setCenterX(370);
				arc4_1_2.setStartAngle(0);
				arc4_1_2.setLength(180);


				//if we destroy a circle and the shapes that are belong this circle in advance, we must bring them back.
				//we have to make their opacity 1 again because they fade away.
				vLine1_1_2.setOpacity(1);
				vLine1_2_2.setOpacity(1);
				hLine1_2_2.setOpacity(1);
				hLine1_1_2.setOpacity(1);
				arc1_1_2.setOpacity(1);
				c1_2.setOpacity(1);
				//because the circles are shrinking, we have to restore their radius.
				c1_2.setRadius(20);
				vLine2_1_2.setOpacity(1);
				vLine2_2_2.setOpacity(1);
				vLine2_4_2.setOpacity(1);
				hLine2_1_2.setOpacity(1);
				c2_2.setOpacity(1);
				c2_2.setRadius(20);
				vLine3_1_2.setOpacity(1);
				vLine3_2_2.setOpacity(1);
				hLine3_1_2.setOpacity(1);
				c3_2.setOpacity(1);
				c3_2.setRadius(20);
				vLine4_1_2.setOpacity(1);
				vLine4_2_2.setOpacity(1);
				hLine4_1_2.setOpacity(1);
				hLine4_3_2.setOpacity(1);
				arc4_2_2.setOpacity(1);
				c4_2.setOpacity(1);
				c4_2.setRadius(20);


				vLine1_1_2.setVisible(true);
				vLine1_2_2.setVisible(true);
				hLine1_1_2.setVisible(true);
				hLine1_2_2.setVisible(true);
				arc1_1_2.setVisible(true);
				c1_2.setVisible(true);
				hLine2_1_2.setVisible(true);
				vLine2_1_2.setVisible(true);
				vLine2_2_2.setVisible(true);
				vLine2_4_2.setVisible(true);
				c2_2.setVisible(true);
				vLine3_1_2.setVisible(true);
				vLine3_2_2.setVisible(true);
				hLine3_1_2.setVisible(true);
				c3_2.setVisible(true);
				hLine4_1_2.setVisible(true);
				hLine4_3_2.setVisible(true);
				vLine4_1_2.setVisible(true);
				vLine4_2_2.setVisible(true);
				arc4_1_2.setVisible(true);
				arc4_2_2.setVisible(true);
				c4_2.setVisible(true);
				hLine4_2_2.setVisible(true);
				vLine2_3_2.setVisible(true);
				arc2_1_2.setVisible(true);
				arc2_2_2.setVisible(true);
				vLine2_2_2.setVisible(true);



			pane2.setOpacity(1);
			animation5_2.play();
		}

		c1_2.setOnMousePressed(a -> animation1_2.play());
		c2_2.setOnMousePressed(a -> animation2_2.play());
		c3_2.setOnMousePressed(a -> animation3_2.play());
		c4_2.setOnMousePressed(a -> animation4_2.play());


		};

		Timeline animation6_2 = new Timeline(
				new KeyFrame(Duration.millis(50), eventHandler6_2));
		animation6_2.setCycleCount(Timeline.INDEFINITE);
		animation6_2.play();





		EventHandler<ActionEvent> eventHandler4_3 = e -> {

			if ((vLine3_3_3.getStartY() - 5 <= arc1_1_3.getCenterY() && vLine3_3_3.getStartX() >= arc1_1_3.getCenterX() + 10) ||
					(hLine2_3_3.getEndX() + 5 >= arc3_2_3.getCenterX() && hLine2_3_3.getEndY() <= arc3_2_3.getCenterY() - 10)) {

				animation1_3.stop();
				animation2_3.stop();
				animation3_3.stop();

				pane3.setOpacity(pane3.getOpacity() - 0.15);
			}
		};


		Timeline animation4_3 = new Timeline(new KeyFrame(Duration.millis(100), eventHandler4_3));
		animation4_3.setCycleCount(Timeline.INDEFINITE);
		animation4_3.play();

		EventHandler<ActionEvent> eventHandler5_3 = e -> {
			if (pane3.getOpacity() <= 0.15) {

				animation4_3.stop();


				hLine1_1_3.setEndX(360);
				hLine1_2_3.setStartX(400);
				hLine1_2_3.setEndX(450);
				hLine2_3_3.setEndX(385);
				arc1_1_3.setCenterX(380);
				arc1_1_3.setLength(180);
				vLine1_1_3.setStartY(30);
				vLine1_1_3.setEndY(45);
				vLine2_2_3.setStartY(112.5);
				vLine2_2_3.setEndY(127.5);

				hLine3_2_3.setEndX(387.5);
				hLine3_2_3.setStartX(372.5);
				arc3_2_3.setCenterY(120);
				arc1_1_3.setLength(180);
				vLine3_2_3.setStartY(140);
				vLine3_3_3.setEndY(100);
				vLine3_3_3.setStartY(32.5);

				vLine3_1_3.setOpacity(1);
				vLine3_2_3.setOpacity(1);
				vLine3_3_3.setOpacity(1);
				hLine3_1_3.setOpacity(1);
				hLine3_2_3.setOpacity(1);
				arc3_1_3.setOpacity(1);
				c3_3.setOpacity(1);
				c3_3.setRadius(20);
				vLine2_1_3.setOpacity(1);
				vLine2_2_3.setOpacity(1);
				hLine2_1_3.setOpacity(1);
				hLine2_2_3.setOpacity(1);
				hLine2_3_3.setOpacity(1);
				arc2_1_3.setOpacity(1);
				arc2_2_3.setOpacity(1);
				c2_3.setOpacity(1);
				c2_3.setRadius(20);
				vLine1_1_3.setOpacity(1);
				vLine1_2_3.setOpacity(1);
				hLine1_1_3.setOpacity(1);
				hLine1_2_3.setOpacity(1);
				hLine1_3_3.setOpacity(1);
				arc1_2_3.setOpacity(1);
				c1_3.setOpacity(1);
				c1_3.setRadius(20);


				arc3_1_3.setVisible(true);
				hLine3_1_3.setVisible(true);
				hLine3_2_3.setVisible(true);
				vLine3_3_3.setVisible(true);
				vLine3_1_3.setVisible(true);
				vLine3_2_3.setVisible(true);
				c3_3.setVisible(true);
				hLine2_3_3.setVisible(true);
				arc2_1_3.setVisible(true);
				arc2_2_3.setVisible(true);
				c2_3.setVisible(true);
				hLine2_1_3.setVisible(true);
				hLine2_2_3.setVisible(true);
				vLine2_1_3.setVisible(true);
				vLine2_2_3.setVisible(true);
				arc1_2_3.setVisible(true);
				hLine1_1_3.setVisible(true);
				hLine1_2_3.setVisible(true);
				hLine1_3_3.setVisible(true);
				vLine1_1_3.setVisible(true);
				vLine1_2_3.setVisible(true);
				c1_3.setVisible(true);
				arc3_2_3.setVisible(true);
				vLine3_2_3.setVisible(true);
				arc1_1_3.setVisible(true);
				hLine1_1_3.setVisible(true);

				pane3.setOpacity(1);
				animation4_3.play();

			}

			c1_3.setOnMousePressed(a -> animation1_3.play());
			c2_3.setOnMousePressed(a -> animation2_3.play());
			c3_3.setOnMousePressed(a -> animation3_3.play());

		};

		Timeline animation5_3 = new Timeline(new KeyFrame(Duration.millis(50), eventHandler5_3));
		animation5_3.setCycleCount(Timeline.INDEFINITE);
		animation5_3.play();


		EventHandler<ActionEvent> eventHandler3_4 = e -> {

			if (vLine1_2_4.getStartX() >= arc2_2_4.getCenterX() + 10 && vLine1_2_4.getEndY()  - 2 <= arc2_2_4.getCenterY()){

				animation1_4.stop();
				animation2_4.stop();


				pane4.setOpacity(pane4.getOpacity() - 0.15);

			}


		};


		Timeline animation3_4 = new Timeline(
					new KeyFrame(Duration.millis(100), eventHandler3_4));
		animation3_4.setCycleCount(Timeline.INDEFINITE);
		animation3_4.play();


		EventHandler<ActionEvent> eventHandler4_4 = e -> {

			if(pane4.getOpacity() <= 0.15){
				animation3_4.stop();

				hLine1_3_4.setStartX(368.5);
				hLine1_3_4.setEndX(383.5);
				vLine1_2_4.setEndY(50);
				vLine2_4_4.setStartY(46.5);
				vLine2_4_4.setEndY(61.5);
				hLine2_2_4.setEndX(356);
				hLine2_3_4.setStartX(396);
				hLine2_3_4.setEndX(425);
				arc2_2_4.setCenterX(376);
				arc2_2_4.setLength(180);



				pane4.setOpacity(1);
				animation3_4.play();
			}

			c1_4.setOnMousePressed(a -> animation1_4.play());
			c2_4.setOnMousePressed(a -> animation2_4.play());


		};

		Timeline animation4_4 = new Timeline(
				new KeyFrame(Duration.millis(50), eventHandler4_4));
		animation4_4.setCycleCount(Timeline.INDEFINITE);
		animation4_4.play();


		EventHandler<ActionEvent> eventHandler5_5 = e -> {

			if ((vLine3_1_5.getStartY() - 5 <= arc1_1_5.getCenterY()  && vLine3_1_5.getStartX() >= arc1_1_5.getCenterX() + 10) ||
					(hLine1_2_5.getEndX() + 5 >= arc2_1_5.getCenterX()  && hLine1_2_5.getStartY() <= arc2_1_5.getCenterY() - 10) ||
					(hLine4_1_5.getStartX() - 5 <= arc3_1_5.getCenterX()  && hLine4_1_5.getStartY() <= arc3_1_5.getCenterY() - 10)) {

				animation1_5.stop();
				animation2_5.stop();
				animation3_5.stop();
				animation4_5.stop();

				pane_5.setOpacity(pane_5.getOpacity() - 0.15);
			}
		};

		Timeline animation5_5 = new Timeline(new KeyFrame(Duration.millis(100), eventHandler5_5));
		animation5_5.setCycleCount(Timeline.INDEFINITE);
		animation5_5.play();


		EventHandler<ActionEvent> eventHandler6_5 = e -> {
			if (pane_5.getOpacity() <= 0.15) {

				animation5_5.stop();

				a_5 = true;
				b_5 = true;

				vLine1_1_5.setStartY(30);
				vLine1_1_5.setEndY(45);
				vLine2_1_5.setStartY(5);
				vLine2_1_5.setEndY(17.5);
				vLine2_2_5.setStartY(57.5);
				vLine3_1_5.setStartY(32.5);
				vLine3_1_5.setEndY(50);
				vLine3_2_5.setStartY(90);
				vLine4_1_5.setStartY(62.5);
				vLine4_1_5.setEndY(77.5);

				hLine1_1_5.setEndX(250);
				hLine1_2_5.setStartX(290);
				hLine1_2_5.setEndX(355);
				hLine2_3_5.setStartX(342.5);
				hLine2_3_5.setEndX(357.5);
				hLine3_1_5.setStartX(262.5);
				hLine3_1_5.setEndX(277.5);
				hLine4_1_5.setStartX(265);

				arc1_1_5.setCenterX(270);
				arc1_1_5.setLength(180);
				arc2_1_5.setCenterY(37.5);
				arc2_1_5.setLength(180);
				arc3_1_5.setCenterY(70);
				arc3_1_5.setLength(180);

				vLine0_1_5.setStartX(182.5);
				vLine0_1_5.setEndX(182.5);
				vLine0_1_5.setStartY(150);
				vLine0_1_5.setEndY(190);

				hLine0_4_5.setStartX(162.5);
				hLine0_4_5.setEndX(202.5);
				hLine0_4_5.setStartY(240);
				hLine0_4_5.setEndY(240);


				arc1_2_5.setVisible(true);
				hLine1_1_5.setVisible(true);
				hLine1_2_5.setVisible(true);
				hLine1_3_5.setVisible(true);
				hLine1_4_5.setVisible(true);
				vLine1_1_5.setVisible(true);
				vLine1_2_5.setVisible(true);
				vLine1_3_5.setVisible(true);
				c1_5.setVisible(true);
				hLine2_1_5.setVisible(true);
				hLine2_2_5.setVisible(true);
				hLine2_3_5.setVisible(true);
				vLine2_1_5.setVisible(true);
				vLine2_3_5.setVisible(true);
				arc2_2_5.setVisible(true);
				c2_5.setVisible(true);
				hLine3_1_5.setVisible(true);
				hLine3_2_5.setVisible(true);
				hLine3_3_5.setVisible(true);
				vLine3_1_5.setVisible(true);
				vLine3_3_5.setVisible(true);
				arc3_2_5.setVisible(true);
				c3_5.setVisible(true);
				vLine4_1_5.setVisible(true);
				vLine4_2_5.setVisible(true);
				hLine4_1_5.setVisible(true);
				hLine4_2_5.setVisible(true);
				arc4_1_5.setVisible(true);
				c4_5.setVisible(true);
				arc3_1_5.setVisible(true);
				vLine3_2_5.setVisible(true);
				arc2_1_5.setVisible(true);
				vLine2_2_5.setVisible(true);
				c0_2_5.setVisible(true);
				hLine0_4_5.setVisible(true);
				c0_1_5.setVisible(true);
				vLine0_1_5.setVisible(true);
				arc1_1_5.setVisible(true);
				hLine1_1_5.setVisible(true);

				c0_1_5.setOpacity(1);
				vLine0_1_5.setOpacity(1);
				c0_1_5.setRadius(20);
				c0_2_5.setOpacity(1);
				hLine0_4_5.setOpacity(1);
				c0_2_5.setRadius(20);
				vLine1_1_5.setOpacity(1);
				vLine1_2_5.setOpacity(1);
				vLine1_3_5.setOpacity(1);
				hLine1_1_5.setOpacity(1);
				hLine1_2_5.setOpacity(1);
				hLine1_3_5.setOpacity(1);
				hLine1_4_5.setOpacity(1);
				arc1_2_5.setOpacity(1);
				c1_5.setOpacity(1);
				c1_5.setRadius(20);
				vLine2_1_5.setOpacity(1);
				vLine2_3_5.setOpacity(1);
				hLine2_1_5.setOpacity(1);
				hLine2_2_5.setOpacity(1);
				hLine2_3_5.setOpacity(1);
				arc2_2_5.setOpacity(1);
				c2_5.setOpacity(1);
				c2_5.setRadius(20);
				vLine3_1_5.setOpacity(1);
				vLine3_3_5.setOpacity(1);
				hLine3_1_5.setOpacity(1);
				hLine3_2_5.setOpacity(1);
				hLine3_3_5.setOpacity(1);
				arc3_2_5.setOpacity(1);
				c3_5.setOpacity(1);
				c3_5.setRadius(20);
				vLine4_1_5.setOpacity(1);
				vLine4_2_5.setOpacity(1);
				hLine4_1_5.setOpacity(1);
				hLine4_2_5.setOpacity(1);
				arc4_1_5.setOpacity(1);
				c4_5.setOpacity(1);
				c4_5.setRadius(20);

				pane_5.setOpacity(1);
				animation5_5.play();

			}

			c1.setOnMousePressed(a -> animation1_5.play());
			c2.setOnMousePressed(a -> animation2_5.play());
			c3.setOnMousePressed(a -> animation3_5.play());
			c4.setOnMousePressed(a -> animation4_5.play());

			c0_1_5.setOnMousePressed(a -> vsetDirection_5(vLine0_1_5));
			c0_2_5.setOnMousePressed(a -> hsetDirection_5(hLine0_4_5));
		};

		Timeline animation6_5 = new Timeline(new KeyFrame(Duration.millis(50), eventHandler6_5));
		animation6_5.setCycleCount(Timeline.INDEFINITE);
		animation6_5.play();




	}
}

