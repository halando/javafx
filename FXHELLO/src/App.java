import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App  extends Application {
    public static void main(String[] args) throws Exception {
       launch(args);
    }
        @Override
        public void start(Stage stage){
            StackPane stackPane = new StackPane();
            Scene scene = new Scene(stackPane,400,300);
            stage.setScene(scene);
            stage.show();

        }
    }

