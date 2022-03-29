package citylife;

import javafx.animation.FillTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.TransferHandler;

public class UrbanLife extends Application{
	private static Stage primaryStage;

	private static boolean FIRST_KEY_PRESSED = true;
	@Override // Override the start method in the Application class
	public void start(Stage arg0)  throws Exception{
		primaryStage = arg0;
		initGUI();
		//		Scene scene = new Scene(pane, 600, 600);
		arg0.setTitle("UrbanLife"); // Set the stage title
		//		arg0.setResizable(false);
		arg0.sizeToScene(); // Place the scene in the stage
		arg0.show(); // Display the stage
		//		
	}

	public static void initGUI() {
		Pane pane = new Pane();

		//clock
		Circle clock= new Circle();
		clock.setCenterX(235);
		clock.setCenterY(140);
		clock.setRadius(30);
		clock.setFill(Color.WHITE);
		clock.setStroke(Color.GREY);
		
		//minute hand
		Rectangle min = new Rectangle(234,120,3,20);
		min.setFill(Color.BLACK);
		
		//second hand
		Rectangle sec = new Rectangle(234,140,15,2);
		sec.setFill(Color.BLACK);
		PathTransition hs = new PathTransition();
		hs.setDuration(Duration.millis(4000));
		hs.setPath(min);
		hs.setNode(sec);
		hs.setCycleCount(Timeline.INDEFINITE);
		
		
		//rectangle as background
		Rectangle bg = new Rectangle(600,600);
		FillTransition background = new FillTransition(Duration.seconds(8), bg, Color.rgb(214, 239, 253), Color.rgb(35, 35, 35));
		background.setDuration(Duration.seconds(8));
		background.setCycleCount(TranslateTransition.INDEFINITE);
		background.setAutoReverse(true);
		background.play();


		// Create a circle and set its properties for drawing sun
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(30);
		FillTransition moon = new FillTransition(Duration.seconds(8), circle, Color.YELLOW, Color.GREY);
		moon.setCycleCount(TranslateTransition.INDEFINITE);
		moon.setAutoReverse(true);
		moon.play();

		//create rectangle for building
		Rectangle rectangle2 = new Rectangle(100, 200, 140, 250);
		FillTransition darken = new FillTransition(Duration.seconds(8), rectangle2, Color.rgb(219, 108, 255), Color.rgb(70, 50, 70));
		darken.setCycleCount(TranslateTransition.INDEFINITE);
		darken.setAutoReverse(true);
		darken.play();

		Rectangle rectangle1 = new Rectangle(200, 100, 70, 350);
		FillTransition dark = new FillTransition(Duration.seconds(8), rectangle1, Color.rgb(94, 160, 244), Color.rgb(26, 58, 67));
		dark.setCycleCount(TranslateTransition.INDEFINITE);
		dark.setAutoReverse(true);
		dark.play();

		Rectangle atap = new Rectangle(210,70,50,30);
		FillTransition dark1 = new FillTransition(Duration.seconds(8), atap, Color.rgb(94, 160, 244), Color.rgb(26, 58, 67));
		dark1.setCycleCount(TranslateTransition.INDEFINITE);
		dark1.setAutoReverse(true);
		dark1.play();

		Rectangle ataps = new Rectangle(215,50,40,20);
		FillTransition dark2 = new FillTransition(Duration.seconds(8), ataps, Color.rgb(94, 160, 244), Color.rgb(26, 58, 67));
		dark2.setCycleCount(TranslateTransition.INDEFINITE);
		dark2.setAutoReverse(true);
		dark2.play();

		Rectangle rectangle3 = new Rectangle(250, 150, 100, 300);
		FillTransition dark3 = new FillTransition(Duration.seconds(8), rectangle3, Color.rgb(205, 86, 59), Color.rgb(81, 52, 30));
		dark3.setCycleCount(TranslateTransition.INDEFINITE);
		dark3.setAutoReverse(true);
		dark3.play();

		Rectangle rectangle4 = new Rectangle(25, 160, 72, 290);
		FillTransition dark4 = new FillTransition(Duration.seconds(8), rectangle4, Color.rgb(242, 166, 95), Color.rgb(122, 94, 38));
		dark4.setCycleCount(TranslateTransition.INDEFINITE);
		dark4.setAutoReverse(true);
		dark4.play();

		Polygon roof = new Polygon();
		roof.getPoints().addAll(new Double[]{        
				25.0, 160.0, 
				97.0, 160.0, 
				60.0, 140.0,
		});

		FillTransition dark5 = new FillTransition(Duration.seconds(8), roof, Color.rgb(242, 166, 95), Color.rgb(122, 94, 38));
		dark5.setCycleCount(TranslateTransition.INDEFINITE);
		dark5.setAutoReverse(true);
		dark5.play();

		//window
		Rectangle w1=new Rectangle(200,250,10,20);
		FillTransition a = new FillTransition(Duration.seconds(8), w1, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		a.setCycleCount(TranslateTransition.INDEFINITE);
		a.setAutoReverse(true);
		w1.setStroke(Color.GREY);
		a.play();


		//window2
		Rectangle w2=new Rectangle(130,250,10,20);
		FillTransition b = new FillTransition(Duration.seconds(8), w2, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		b.setCycleCount(TranslateTransition.INDEFINITE);
		b.setAutoReverse(true);
		w2.setStroke(Color.GREY);
		b.play();


		//window3
		Rectangle w3=new Rectangle(130,300,10,20);
		FillTransition c = new FillTransition(Duration.seconds(8), w3, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		c.setCycleCount(TranslateTransition.INDEFINITE);
		c.setAutoReverse(true);
		w3.setStroke(Color.GREY);
		c.play();


		//window4
		Rectangle w4=new Rectangle(200,300,10,20);
		FillTransition d = new FillTransition(Duration.seconds(8), w4, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		d.setCycleCount(TranslateTransition.INDEFINITE);
		d.setAutoReverse(true);
		w4.setStroke(Color.GREY);
		d.play();


		//window5
		Rectangle w5=new Rectangle(130,350,10,20);
		FillTransition f = new FillTransition(Duration.seconds(8), w5, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		f.setCycleCount(TranslateTransition.INDEFINITE);
		f.setAutoReverse(true);
		w5.setStroke(Color.GREY);
		f.play();


		//window6
		Rectangle w6=new Rectangle(200,350,10,20);
		FillTransition g = new FillTransition(Duration.seconds(8), w6, Color.rgb(242, 242, 242), Color.rgb(255, 253, 231));
		g.setCycleCount(TranslateTransition.INDEFINITE);
		g.setAutoReverse(true);
		w6.setStroke(Color.GREY);
		g.play();


		//window1 on left building
		Rectangle wl=new Rectangle(30,200,15,30);
		FillTransition h = new FillTransition(Duration.seconds(8), wl, Color.rgb(242, 242, 242), Color.rgb(255, 217, 152));
		h.setCycleCount(TranslateTransition.INDEFINITE);
		h.setAutoReverse(true);
		wl.setStroke(Color.GREY);
		h.play();


		//window2 on left building
		Rectangle wl2=new Rectangle(70,250,15,30);
		FillTransition i = new FillTransition(Duration.seconds(8), wl2, Color.rgb(242, 242, 242), Color.rgb(255, 217, 152));
		i.setCycleCount(TranslateTransition.INDEFINITE);
		i.setAutoReverse(true);
		wl2.setStroke(Color.GREY);
		i.play();


		//window3 on left building
		Rectangle wl3=new Rectangle(30,300,15,30);
		FillTransition j = new FillTransition(Duration.seconds(8), wl3, Color.rgb(242, 242, 242), Color.rgb(255, 217, 152));
		j.setCycleCount(TranslateTransition.INDEFINITE);
		j.setAutoReverse(true);
		wl3.setStroke(Color.GREY);
		j.play();


		//window4 on left building
		Rectangle wl4=new Rectangle(70,350,15,30);
		FillTransition k = new FillTransition(Duration.seconds(8), wl4, Color.rgb(242, 242, 242), Color.rgb(255, 217, 152));
		k.setCycleCount(TranslateTransition.INDEFINITE);
		k.setAutoReverse(true);
		wl4.setStroke(Color.GREY);
		k.play();

		//window far right building
		Rectangle wl5=new Rectangle(320,170,22,265);
		FillTransition l = new FillTransition(Duration.seconds(8), wl5, Color.rgb(159, 251, 255), Color.rgb(255, 250, 226));
		l.setCycleCount(TranslateTransition.INDEFINITE);
		l.setAutoReverse(true);
		wl5.setStroke(Color.GREY);
		l.play();

		//window far right building
		Rectangle wl6=new Rectangle(290,170,22,265);
		FillTransition m = new FillTransition(Duration.seconds(8), wl6, Color.rgb(159, 251, 255), Color.rgb(255, 250, 226));
		m.setCycleCount(TranslateTransition.INDEFINITE);
		m.setAutoReverse(true);
		wl6.setStroke(Color.GREY);
		m.play();

		//window far right building
		Rectangle wl7=new Rectangle(260,170,22,265);
		FillTransition n = new FillTransition(Duration.seconds(8), wl7, Color.rgb(159, 251, 255), Color.rgb(255, 250, 226));
		n.setCycleCount(TranslateTransition.INDEFINITE);
		n.setAutoReverse(true);
		wl7.setStroke(Color.GREY);
		n.play();


		//Road
		Rectangle road1 = new Rectangle(0, 480, 600, 35);
		road1.setFill(Color.BLACK);
		road1.setStroke(Color.WHITE);

		Rectangle road2 = new Rectangle(0, 550, 600, 35);
		road2.setFill(Color.BLACK);
		road2.setStroke(Color.WHITE);

		//road lamps for land 1
		Rectangle roadlamp = new Rectangle(10, 495, 20, 5);
		roadlamp.setFill(Color.WHITE);
		Rectangle roadlamp2 = new Rectangle(100, 495, 20, 5);
		roadlamp2.setFill(Color.WHITE);
		Rectangle roadlamp3 = new Rectangle(200, 495, 20, 5);
		roadlamp3.setFill(Color.WHITE);
		Rectangle roadlamp4 = new Rectangle(300, 495, 20, 5);
		roadlamp4.setFill(Color.WHITE);
		Rectangle roadlamp5 = new Rectangle(400, 495, 20, 5);
		roadlamp5.setFill(Color.WHITE);
		Rectangle roadlamp6 = new Rectangle(500, 495, 20, 5);
		roadlamp6.setFill(Color.WHITE);

		//road lamps for land 2
		Rectangle roadlamplan2 = new Rectangle(10, 565, 20, 5);
		roadlamplan2.setFill(Color.WHITE);
		Rectangle roadlamplan3 = new Rectangle(100, 565, 20, 5);
		roadlamplan3.setFill(Color.WHITE);
		Rectangle roadlamplan4 = new Rectangle(200, 565, 20, 5);
		roadlamplan4.setFill(Color.WHITE);
		Rectangle roadlamplan5 = new Rectangle(300, 565, 20, 5);
		roadlamplan5.setFill(Color.WHITE);
		Rectangle roadlamplan6 = new Rectangle(400, 565, 20, 5);
		roadlamplan6.setFill(Color.WHITE);
		Rectangle roadlamplan7 = new Rectangle(500, 565, 20, 5);
		roadlamplan7.setFill(Color.WHITE);


		//create car
		Rectangle car=new Rectangle(330,430,100,60);//<y,x,w,l>
		car.setFill(Color.rgb(166, 56, 64));
		car.setStroke(Color.BLACK);

		//red car back tire
		Circle btire = new Circle();
		btire.setCenterX(400);
		btire.setCenterY(490);
		btire.setRadius(10);
		btire.setStroke(Color.BLACK); // Set circle stroke colour
		btire.setFill(Color.GREY);

		//red car front tire
		Circle ftire = new Circle();
		ftire.setCenterX(358);
		ftire.setCenterY(490);
		ftire.setRadius(10);
		ftire.setStroke(Color.BLACK); // Set circle stroke colour
		ftire.setFill(Color.GREY);

		//transition for sun
		TranslateTransition s = new TranslateTransition();
		s.setNode(circle);
		s.setDuration(Duration.seconds(9));
		s.setCycleCount(TranslateTransition.INDEFINITE);
		s.setByX(-40);
		s.setByY(200);
		s.setAutoReverse(true);
		s.play();


		//red ftire
		TranslateTransition t = new TranslateTransition();
		t.setNode(ftire);
		t.setDuration(Duration.seconds(8));
		t.setCycleCount(TranslateTransition.INDEFINITE);
		t.setByX(-431);
		t.setByY(0);
		t.setAutoReverse(true);


		//red ftire
		TranslateTransition bt = new TranslateTransition();
		bt.setNode(btire);
		bt.setDuration(Duration.seconds(8));
		bt.setCycleCount(TranslateTransition.INDEFINITE);
		bt.setByX(-431);
		bt.setByY(0);
		bt.setAutoReverse(true);

		//car1
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(car);
		translate.setDuration(Duration.seconds(8));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(-431);
		translate.setByY(0);
		translate.setAutoReverse(true);

		//second car
		Rectangle car2=new Rectangle(0,500,100,60);//<y,x,w,l>
		car2.setFill(Color.rgb(137, 213, 109));
		car2.setStroke(Color.BLACK);

		//second ftire
		Circle ftire2 = new Circle();
		ftire2.setCenterX(20);
		ftire2.setCenterY(560);
		ftire2.setRadius(10);
		ftire2.setStroke(Color.BLACK); // Set circle stroke colour
		ftire2.setFill(Color.GREY);

		//second btire
		Circle btire2 = new Circle();
		btire2.setCenterX(75);
		btire2.setCenterY(560);
		btire2.setRadius(10);
		btire2.setStroke(Color.BLACK); // Set circle stroke colour
		btire2.setFill(Color.GREY);

		//green ftire2
		TranslateTransition ft2 = new TranslateTransition();
		ft2.setNode(ftire2);
		ft2.setDuration(Duration.seconds(5));
		ft2.setCycleCount(TranslateTransition.INDEFINITE);
		ft2.setByX(650);
		ft2.setByY(0);
		ft2.setAutoReverse(true);

		//green btire2
		TranslateTransition bt2 = new TranslateTransition();
		bt2.setNode(btire2);
		bt2.setDuration(Duration.seconds(5));
		bt2.setCycleCount(TranslateTransition.INDEFINITE);
		bt2.setByX(650);
		bt2.setByY(0);
		bt2.setAutoReverse(true);

		//car2
		TranslateTransition translate2 = new TranslateTransition();
		translate2.setNode(car2);
		translate2.setDuration(Duration.seconds(5));
		translate2.setCycleCount(TranslateTransition.INDEFINITE);
		translate2.setByX(650);
		translate2.setByY(0);
		translate2.setAutoReverse(true);


		//Tree
		Rectangle tree=new Rectangle(450, 250, 37, 200);//<y,x,w,l>
		FillTransition treedark = new FillTransition(Duration.seconds(8), tree, Color.CHOCOLATE, Color.rgb(57, 45, 37));
		treedark.setCycleCount(TranslateTransition.INDEFINITE);
		treedark.setAutoReverse(true);
		treedark.play();

		Circle crown = new Circle();
		crown.setCenterX(465);
		crown.setCenterY(210);
		crown.setRadius(60); 
		crown.setFill(Color.GREEN);
		FillTransition crowndark = new FillTransition(Duration.seconds(8), crown, Color.GREEN, Color.rgb(37, 57, 48));
		crowndark.setCycleCount(TranslateTransition.INDEFINITE);
		crowndark.setAutoReverse(true);
		crowndark.play();

		Circle crown2 = new Circle();
		crown2.setCenterX(420);
		crown2.setCenterY(230);
		crown2.setRadius(40); 
		crown2.setFill(Color.GREEN);
		FillTransition crown2dark = new FillTransition(Duration.seconds(8), crown2, Color.GREEN, Color.rgb(37, 57, 48));
		crown2dark.setCycleCount(TranslateTransition.INDEFINITE);
		crown2dark.setAutoReverse(true);
		crown2dark.play();

		Circle crown3 = new Circle();
		crown3.setCenterX(519);
		crown3.setCenterY(230);
		crown3.setRadius(40);
		crown3.setFill(Color.GREEN);
		FillTransition crown3dark = new FillTransition(Duration.seconds(8), crown3, Color.GREEN, Color.rgb(37, 57, 48));
		crown3dark.setCycleCount(TranslateTransition.INDEFINITE);
		crown3dark.setAutoReverse(true);
		crown3dark.play();


		//Road Lamp
		Rectangle lamp =new Rectangle(570, 100, 8, 350);
		lamp.setFill(Color.DIMGRAY);
		lamp.setStroke(Color.BLACK);

		Rectangle stand = new Rectangle(560, 445, 30, 10);
		stand.setFill(Color.DIMGRAY);
		stand.setStroke(Color.BLACK);

		Circle bulb = new Circle();
		bulb.setCenterX(574);
		bulb.setCenterY(115);
		bulb.setRadius(20);
		bulb.setFill(Color.YELLOW);
		bulb.setStroke(Color.BLACK);
		FillTransition bulbdark = new FillTransition(Duration.millis(400), bulb, Color.rgb(235, 235, 235), Color.YELLOW);
		bulbdark.setCycleCount(TranslateTransition.INDEFINITE);
		bulbdark.setAutoReverse(true);
		
		
		bulb.setOnMousePressed(e -> bulbdark.pause());
		bulb.setOnMouseReleased(e -> bulbdark.play());
		
		
		//animation 
		circle.setOnMousePressed(e ->s.pause());
		circle.setOnMouseReleased(e ->s.play());
		
		
		Label helpLabel = new Label("Hold left click to stop the sun from moving. Click on lamp and see what happens. Use the hold/ released spacebar to move the cars");
		helpLabel.setFont(Font.font(15));
		helpLabel.setTextFill(Color.WHITE);
		helpLabel.setWrapText(true);
		helpLabel.setTextAlignment(TextAlignment.CENTER);
		helpLabel.setPrefWidth(600);

		//label background
		Rectangle labelbackground = new Rectangle(0,0,600,45);
		labelbackground.setFill(Color.BLACK);

		//place rectangle in pane
		pane.getChildren().addAll(bg,circle,rectangle1, rectangle2,
				clock,min,sec,
				rectangle3,rectangle4,w1,w2,w3,w4,w5,w6,road1,road2,roadlamp,roadlamp2,roadlamp3,roadlamp4,roadlamp5,roadlamp6,
				roadlamplan2,roadlamplan3,roadlamplan4,roadlamplan5,roadlamplan6,roadlamplan7,
				wl,wl2,wl3,wl4,wl5,wl6,wl7,car,car2,btire,ftire,ftire2,
				btire2,labelbackground,helpLabel,tree, crown, crown2, crown3,lamp, bulb, stand,roof,atap,ataps);

		Scene scene = new Scene(pane);
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					t.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				t.play();
				FIRST_KEY_PRESSED = true;
			}
		});

		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					bt.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				bt.play();
				FIRST_KEY_PRESSED = true;
			}
		});


		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					translate.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				translate.play();
				FIRST_KEY_PRESSED = true;
			}
		});

		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					ft2.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				ft2.play();
				FIRST_KEY_PRESSED = true;
			}
		});

		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					bt2.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				bt2.play();
				FIRST_KEY_PRESSED = true;
			}
		});

		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				if(FIRST_KEY_PRESSED) {
					translate2.pause();
					FIRST_KEY_PRESSED = true;
				}
			}
		});
		scene.addEventFilter(KeyEvent.KEY_RELEASED, e ->{
			if(e.getCode() == KeyCode.SPACE) {
				translate2.play();
				FIRST_KEY_PRESSED = true;
			}
		});

		primaryStage.setScene(scene);



		//bind
		//circle.centerXProperty().bind(pane.widthProperty().divide(4));
		//rectangle3.xProperty().bind(pane.widthProperty().divide(2));
		//rectangle3.yProperty().bind(pane.heightProperty().divide(4));

	}

	// Create a scene and place it in the stage

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	//	public void keyPressed(KeyEvent evt) {
	//		    int key = evt.getCode();
	//		    if ( key == KeyEvent.VK_SPACE){
	//		        translate2.setSpeed(0);
	//	
	//		    }

	public static void main(String[] args) {
		Application.launch(args);
	}
}