package Controller;

import Model.Booking;
import Model.Tour;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class ThankYouController {

    @FXML
    private Label tourName;

    @FXML
    private Label tourLength;

    @FXML
    private Label tourSeats;

    @FXML
    private Label customerName;

    @FXML
    private Label tourDate;

    @FXML
    private Label customerEmail;

    @FXML
    private Label customerPhone;

    @FXML
    private Label tourBooking;


    public void initData(Booking booking, Tour tour) {

        tourBooking.setText(String.valueOf(booking.getBookingId()));
        customerName.setText(booking.getFullName());
        customerEmail.setText(booking.getEmail());
        customerPhone.setText(booking.getPhone());
        tourName.setText(tour.getName());
        tourDate.setText(tour.getDate());
        tourLength.setText(tour.getDuration() + " hours");
        tourSeats.setText(booking.getSeats() + " seats");
    }

    @FXML
    void backButtonHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("./View/searchTours.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
