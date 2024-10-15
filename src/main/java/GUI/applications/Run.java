package GUI.applications;

import GUI.controllers.Main_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Run extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Font font = Font.loadFont(getClass().getResource("/fonts/LeagueSpartan.ttf").toExternalForm(), 10);

        System.out.println(font);

        FXMLLoader fxmlLoader = new FXMLLoader(Run.class.getResource("/view/KhungGiaoDien.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Trang chủ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}