package citylife;
//
//import javafx.animation.FillTransition;
//import javafx.animation.PathTransition;
//import javafx.animation.Timeline;
//import javafx.animation.TranslateTransition;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.KeyCode;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.TextAlignment;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//
//public class UrbanLife extends Application{
//	@Override // Override the start method in the Application class
//	public void start(Stage primaryStage) {
//
//		// Create a circle and set its properties for drawing sun
//		Circle circle = new Circle();
//		circle.setCenterX(100);
//		circle.setCenterY(100);
//		circle.setRadius(30);
//		circle.setStroke(Color.BLACK); // Set circle stroke colour
//		circle.setFill(Color.YELLOW);
//
//
//		//create rectangle for building2
//		Rectangle rectangle2 = new Rectangle(100, 200, 140, 250);
//		rectangle2.setFill(Color.rgb(209, 213, 145));
//		rectangle2.setStroke(Color.BLACK);
//		//create rectangle for building
//		Rectangle rectangle1 = new Rectangle(200, 100, 70, 350);
//		rectangle1.setFill(Color.rgb(203, 205, 186));
//		rectangle1.setStroke(Color.BLACK);
//		//create rectangle for building
//		Rectangle rectangle3 = new Rectangle(250, 150, 100, 300);
//		rectangle3.setFill(Color.rgb(227, 231, 167));
//		rectangle3.setStroke(Color.BLACK);
//		//create rectangle for building
//		Rectangle rectangle4 = new Rectangle(25, 160, 72, 290);
//		rectangle4.setFill(Color.rgb(170, 173, 121));
//		rectangle4.setStroke(Color.BLACK);
//
//		//window
//		Rectangle w1=new Rectangle(200,250,10,20);
//		FillTransition a = new FillTransition(Duration.seconds(6), w1, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		a.setCycleCount(TranslateTransition.INDEFINITE);
//		a.setAutoReverse(true);
//		a.play();
//		w1.setStroke(Color.BLACK);
//
//		//window2
//		Rectangle w2=new Rectangle(130,250,10,20);
//		FillTransition b = new FillTransition(Duration.seconds(6), w2, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		b.setCycleCount(TranslateTransition.INDEFINITE);
//		b.setAutoReverse(true);
//		b.play();
//		w2.setStroke(Color.BLACK);
//
//		//window3
//		Rectangle w3=new Rectangle(130,300,10,20);
//		FillTransition c = new FillTransition(Duration.seconds(6), w3, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		c.setCycleCount(TranslateTransition.INDEFINITE);
//		c.setAutoReverse(true);
//		c.play();
//
//		w3.setStroke(Color.BLACK);
//		//window4
//		Rectangle w4=new Rectangle(200,300,10,20);
//		FillTransition d = new FillTransition(Duration.seconds(6), w4, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		d.setCycleCount(TranslateTransition.INDEFINITE);
//		d.setAutoReverse(true);
//		d.play();
//		w4.setStroke(Color.BLACK);
//
//		//window5
//		Rectangle w5=new Rectangle(130,350,10,20);
//		FillTransition f = new FillTransition(Duration.seconds(6), w5, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		f.setCycleCount(TranslateTransition.INDEFINITE);
//		f.setAutoReverse(true);
//		f.play();
//		w5.setStroke(Color.BLACK);
//
//		//window6
//		Rectangle w6=new Rectangle(200,350,10,20);
//		FillTransition g = new FillTransition(Duration.seconds(6), w6, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
//		g.setCycleCount(TranslateTransition.INDEFINITE);
//		g.setAutoReverse(true);
//		g.play();
//		w6.setStroke(Color.BLACK);
//
//
//
//
//
//		//create car
//		Rectangle car=new Rectangle(330,430,100,60);//<y,x,w,l>
//		car.setFill(Color.rgb(166, 56, 64));
//		car.setStroke(Color.BLACK);
//
//		//red car back tire
//		Circle btire = new Circle();
//		btire.setCenterX(400);
//		btire.setCenterY(490);
//		btire.setRadius(10);
//		btire.setStroke(Color.BLACK); // Set circle stroke colour
//		btire.setFill(Color.GREY);
//
//		//red car front tire
//		Circle ftire = new Circle();
//		ftire.setCenterX(358);
//		ftire.setCenterY(490);
//		ftire.setRadius(10);
//		ftire.setStroke(Color.BLACK); // Set circle stroke colour
//		ftire.setFill(Color.GREY);
//
//		//transition for sun
//		TranslateTransition s = new TranslateTransition();
//		s.setNode(circle);
//		s.setDuration(Duration.seconds(6));
//		s.setCycleCount(TranslateTransition.INDEFINITE);
//		s.setByX(-40);
//		s.setByY(200);
//		s.setAutoReverse(true);
//		s.play();
//
//
//		//red ftire
//		TranslateTransition t = new TranslateTransition();
//		t.setNode(ftire);
//		t.setDuration(Duration.seconds(20));
//		t.setCycleCount(TranslateTransition.INDEFINITE);
//		t.setByX(-431);
//		t.setByY(0);
//		t.setAutoReverse(true);
//		t.play();
//
//
//		//red ftire
//		TranslateTransition bt = new TranslateTransition();
//		bt.setNode(btire);
//		bt.setDuration(Duration.seconds(20));
//		bt.setCycleCount(TranslateTransition.INDEFINITE);
//		bt.setByX(-431);
//		bt.setByY(0);
//		bt.setAutoReverse(true);
//		bt.play();
//
//		//car1
//		TranslateTransition translate = new TranslateTransition();
//		translate.setNode(car);
//		translate.setDuration(Duration.seconds(20));
//		translate.setCycleCount(TranslateTransition.INDEFINITE);
//		translate.setByX(-431);
//		translate.setByY(0);
//		translate.setAutoReverse(true);
//		translate.play();
//
//		//second car
//		Rectangle car2=new Rectangle(0,500,100,60);//<y,x,w,l>
//		car2.setFill(Color.rgb(137, 213, 109));
//		car2.setStroke(Color.BLACK);
//
//		//second ftire
//		Circle ftire2 = new Circle();
//		ftire2.setCenterX(20);
//		ftire2.setCenterY(560);
//		ftire2.setRadius(10);
//		ftire2.setStroke(Color.BLACK); // Set circle stroke colour
//		ftire2.setFill(Color.GREY);
//
//		//second btire
//		Circle btire2 = new Circle();
//		btire2.setCenterX(75);
//		btire2.setCenterY(560);
//		btire2.setRadius(10);
//		btire2.setStroke(Color.BLACK); // Set circle stroke colour
//		btire2.setFill(Color.GREY);
//
//		//green ftire2
//		TranslateTransition ft2 = new TranslateTransition();
//		ft2.setNode(ftire2);
//		ft2.setDuration(Duration.seconds(5));
//		ft2.setCycleCount(TranslateTransition.INDEFINITE);
//		ft2.setByX(650);
//		ft2.setByY(0);
//		ft2.setAutoReverse(true);
//		ft2.play();
//
//
//		//green btire2
//		TranslateTransition bt2 = new TranslateTransition();
//		bt2.setNode(btire2);
//		bt2.setDuration(Duration.seconds(5));
//		bt2.setCycleCount(TranslateTransition.INDEFINITE);
//		bt2.setByX(650);
//		bt2.setByY(0);
//		bt2.setAutoReverse(true);
//		bt2.play();
//
//		//car2
//		TranslateTransition translate2 = new TranslateTransition();
//		translate2.setNode(car2);
//		translate2.setDuration(Duration.seconds(5));
//		translate2.setCycleCount(TranslateTransition.INDEFINITE);
//		translate2.setByX(650);
//		translate2.setByY(0);
//		translate2.setAutoReverse(true);
//		translate2.play();
//		
//
//		//animation 
//		circle.setOnMousePressed(e ->s.pause());
//		circle.setOnMouseReleased(e ->s.play());
//
//		Label helpLabel = new Label("Hold left click to stop the sun from moving");
//		helpLabel.setFont(Font.font(20));
//		helpLabel.setTextFill(Color.BLACK);
//		helpLabel.setWrapText(true);
//		helpLabel.setTextAlignment(TextAlignment.CENTER);
//		helpLabel.setPrefWidth(600);
//
//		// Create a pane to hold the sun 
//		Pane pane = new Pane();
//		pane.setStyle("-fx-background-color: rgba(12, 128, 255, 0.17)");
//
//		//place rectangle in pane
//		pane.getChildren().addAll(circle,rectangle1, rectangle2,
//				rectangle3,rectangle4,w1,w2,w3,w4,w5,w6,car,car2,btire,ftire,ftire2,btire2,helpLabel);
//
//
//		//bind
//		//circle.centerXProperty().bind(pane.widthProperty().divide(2));
//		//rectangle.widthProperty().bind(pane.widthProperty().subtract(50));
//
//		// Create a scene and place it in the stage
//		Scene scene = new Scene(pane, 600, 600);
//		primaryStage.setTitle("UrbanLife"); // Set the stage title
//		primaryStage.setScene(scene); // Place the scene in the stage
//		primaryStage.show(); // Display the stage
//	}
//
//	/**
//	 * The main method is only needed for the IDE with limited
//	 * JavaFX support. Not needed for running from the command line.
//	 */
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
//
//
//
//
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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.TransferHandler;


public class UrbanLife extends Application{
	private static Stage primaryStage;
	//	Pane pane = new Pane();

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
		//			 rootPane.setAlignment(Pos.TOP_CENTER);
		//			 rootPane.setBackground(new Background(new BackgroundFill(Color.BLACK,
		//			null, null)));
		pane.setStyle("-fx-background-color: rgba(12, 128, 255, 0.17)");

		// Create a circle and set its properties for drawing sun
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(30);
		circle.setStroke(Color.BLACK); // Set circle stroke colour
		circle.setFill(Color.YELLOW);


		//create rectangle for building2
		Rectangle rectangle2 = new Rectangle(100, 200, 140, 250);
		rectangle2.setFill(Color.rgb(209, 213, 145));
		rectangle2.setStroke(Color.BLACK);
		//create rectangle for building
		Rectangle rectangle1 = new Rectangle(200, 100, 70, 350);
		rectangle1.setFill(Color.rgb(203, 205, 186));
		rectangle1.setStroke(Color.BLACK);
		//create rectangle for building
		Rectangle rectangle3 = new Rectangle(250, 150, 100, 300);
		rectangle3.setFill(Color.rgb(227, 231, 167));
		rectangle3.setStroke(Color.BLACK);
		//create rectangle for building
		Rectangle rectangle4 = new Rectangle(25, 160, 72, 290);
		rectangle4.setFill(Color.rgb(170, 173, 121));
		rectangle4.setStroke(Color.BLACK);

		//window
		Rectangle w1=new Rectangle(200,250,10,20);
		FillTransition a = new FillTransition(Duration.seconds(6), w1, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		a.setCycleCount(TranslateTransition.INDEFINITE);
		a.setAutoReverse(true);
		a.play();
		w1.setStroke(Color.BLACK);

		//window2
		Rectangle w2=new Rectangle(130,250,10,20);
		FillTransition b = new FillTransition(Duration.seconds(6), w2, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		b.setCycleCount(TranslateTransition.INDEFINITE);
		b.setAutoReverse(true);
		b.play();
		w2.setStroke(Color.BLACK);

		//window3
		Rectangle w3=new Rectangle(130,300,10,20);
		FillTransition c = new FillTransition(Duration.seconds(6), w3, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		c.setCycleCount(TranslateTransition.INDEFINITE);
		c.setAutoReverse(true);
		c.play();

		w3.setStroke(Color.BLACK);
		//window4
		Rectangle w4=new Rectangle(200,300,10,20);
		FillTransition d = new FillTransition(Duration.seconds(6), w4, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		d.setCycleCount(TranslateTransition.INDEFINITE);
		d.setAutoReverse(true);
		d.play();
		w4.setStroke(Color.BLACK);

		//window5
		Rectangle w5=new Rectangle(130,350,10,20);
		FillTransition f = new FillTransition(Duration.seconds(6), w5, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		f.setCycleCount(TranslateTransition.INDEFINITE);
		f.setAutoReverse(true);
		f.play();
		w5.setStroke(Color.BLACK);

		//window6
		Rectangle w6=new Rectangle(200,350,10,20);
		FillTransition g = new FillTransition(Duration.seconds(6), w6, Color.rgb(98, 98, 98), Color.rgb(255, 210, 49));
		g.setCycleCount(TranslateTransition.INDEFINITE);
		g.setAutoReverse(true);
		g.play();
		w6.setStroke(Color.BLACK);


		//Road
		Rectangle road1 = new Rectangle(0, 480, 600, 35);
		road1.setFill(Color.BLACK);
		road1.setStroke(Color.WHITE);

		Rectangle road2 = new Rectangle(0, 550, 600, 35);
		road2.setFill(Color.BLACK);
		road2.setStroke(Color.WHITE);



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
		s.setDuration(Duration.seconds(6));
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
		//		t.play();


		//red ftire
		TranslateTransition bt = new TranslateTransition();
		bt.setNode(btire);
		bt.setDuration(Duration.seconds(8));
		bt.setCycleCount(TranslateTransition.INDEFINITE);
		bt.setByX(-431);
		bt.setByY(0);
		bt.setAutoReverse(true);
		//		bt.play();

		//car1
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(car);
		translate.setDuration(Duration.seconds(8));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(-431);
		translate.setByY(0);
		translate.setAutoReverse(true);
		//		translate.play();

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
		//		ft2.play();


		//green btire2
		TranslateTransition bt2 = new TranslateTransition();
		bt2.setNode(btire2);
		bt2.setDuration(Duration.seconds(5));
		bt2.setCycleCount(TranslateTransition.INDEFINITE);
		bt2.setByX(650);
		bt2.setByY(0);
		bt2.setAutoReverse(true);
		//		bt2.play();


		//car2
		TranslateTransition translate2 = new TranslateTransition();
		translate2.setNode(car2);
		translate2.setDuration(Duration.seconds(5));
		translate2.setCycleCount(TranslateTransition.INDEFINITE);
		translate2.setByX(650);
		translate2.setByY(0);
		translate2.setAutoReverse(true);
		//		translate2.play();
		//		Scene scene2 = new Scene(pane);

		//Tree
		Rectangle tree=new Rectangle(450, 250, 37, 200);//<y,x,w,l>
		tree.setFill(Color.CHOCOLATE);
		tree.setStroke(Color.BLACK);
		Circle crown = new Circle();
		crown.setCenterX(465);
		crown.setCenterY(210);
		crown.setRadius(60);
		crown.setStroke(Color.GREEN); 
		crown.setFill(Color.GREEN);

		Circle crown2 = new Circle();
		crown2.setCenterX(420);
		crown2.setCenterY(230);
		crown2.setRadius(40);
		crown2.setStroke(Color.GREEN); 
		crown2.setFill(Color.GREEN);

		Circle crown3 = new Circle();
		crown3.setCenterX(519);
		crown3.setCenterY(230);
		crown3.setRadius(40);
		crown3.setStroke(Color.GREEN); 
		crown3.setFill(Color.GREEN);
		

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
		bulb.setStroke(Color.BLACK); 
		bulb.setFill(Color.YELLOW);

		TranslateTransition translamp = new TranslateTransition();
		translamp.setNode(lamp);
		translamp.setDuration(Duration.seconds(5));
		translamp.setByX(570);
		translamp.setByY(-570);
		translamp.setAutoReverse(true);
		translamp.play();


		//animation 
		circle.setOnMousePressed(e ->s.pause());
		circle.setOnMouseReleased(e ->s.play());



		Label helpLabel = new Label("Hold left click to stop the sun from moving");
		helpLabel.setFont(Font.font(20));
		helpLabel.setTextFill(Color.BLACK);
		helpLabel.setWrapText(true);
		helpLabel.setTextAlignment(TextAlignment.CENTER);
		helpLabel.setPrefWidth(600);

		// Create a pane to hold the sun 


		//place rectangle in pane
		pane.getChildren().addAll(circle,rectangle1, rectangle2,
				rectangle3,rectangle4,w1,w2,w3,w4,w5,w6,road1, road2,car,car2,btire,ftire,ftire2,btire2,helpLabel,tree, crown, crown2, crown3, lamp, bulb, stand);

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