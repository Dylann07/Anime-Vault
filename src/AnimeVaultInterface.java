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
    public void start(Stage stage) {
        VBox layout = new VBox();
        layout.getChildren().addAll(
                new Label("Anime-Vault"),
                new Button("Validé")
        );

        Scene fenetre = new Scene(layout , 500 , 500);

        stage.setTitle("Anime-Vault");
        stage.setScene(fenetre);
        stage.show();
    }
}
