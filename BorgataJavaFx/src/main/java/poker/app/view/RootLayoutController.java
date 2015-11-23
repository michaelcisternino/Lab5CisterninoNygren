package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import poker.app.MainApp;
import enums.eGame;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    private Menu mnuGame;
    
    @FXML
    private ToggleGroup tglGames;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		 
		CheckMenuItem item1 = new CheckMenuItem("Five Card Stud");
        item1.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.FiveStud);              
            }            
          });
		
		
		mnuGame.getItems().add(item1);
		
		
		CheckMenuItem item2 = new CheckMenuItem("Five Stud One Joker");
        item2.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.FiveStudOneJoker);              
            }            
          });
        
        mnuGame.getItems().add(item2);
        
        CheckMenuItem item3 = new CheckMenuItem("Five Stud Two Jokers");
        item3.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.FiveStudTwoJoker);              
            }            
          });
        
        mnuGame.getItems().add(item3);
		
		
		CheckMenuItem item4 = new CheckMenuItem("Texas Hold 'Em");
        item4.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.TexasHoldEm);              
            }            
          });
		
		
		mnuGame.getItems().add(item4);
		
		CheckMenuItem item5 = new CheckMenuItem("Omaha");
        item5.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.Omaha);              
            }            
          });
		
		
		mnuGame.getItems().add(item5);
		
		CheckMenuItem item6 = new CheckMenuItem("Seven Card Draw");
        item6.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.SevenDraw);              
            }            
          });
		
		
		mnuGame.getItems().add(item6);
		
		CheckMenuItem item7 = new CheckMenuItem("Deuces Wild");
        item7.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.DeucesWild);              
            }            
          });
		
		
		mnuGame.getItems().add(item7);
		
		CheckMenuItem item8 = new CheckMenuItem("Aces and Eights");
        item8.selectedProperty().addListener(new ChangeListener<Object>(){
            @Override
            public void changed(ObservableValue<?> arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(eGame.AcesAndEights);              
            }            
          });
		
		
		mnuGame.getItems().add(item8);
	}
		
		
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Creates an empty address book.
     */
    @FXML
    private void handleNew() {
    }

    /**
     * Opens a FileChooser to let the user select an address book to load.
     */
    @FXML
    private void handleOpen() {
    }

    /**
     * Saves the file to the person file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Bert Gibbons");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowBirthdayStatistics() {
    }


	public ToggleGroup getTglGames() {
		return tglGames;
	}


	public void setTglGames(ToggleGroup tglGames) {
		this.tglGames = tglGames;
	}




}