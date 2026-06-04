import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AnimeVaultInterface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox layout = new VBox();
        layout.getChildren().addAll(
                new Label("Anime-Vault"),
                new Button("Validé")
        );

        Scene fenetre = new Scene(layout , 1000 , 1000);

        primaryStage.setTitle("Anime-Vault");
        primaryStage.setScene(fenetre);
        primaryStage.show();
    }
}
