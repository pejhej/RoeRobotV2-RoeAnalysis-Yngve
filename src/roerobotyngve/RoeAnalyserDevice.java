/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roerobotyngve;

import java.util.ArrayList;

/**
 *
 * @author Yngve
 */
public class RoeAnalyserDevice {

    
    
    
    /**
     * Move mathod used for moving the end-effector to a spesific X,Y,Z coodinat
     *
     * @param coordinat in a global coordiunat system.
     */
    public void move(Coordinate coordinat) {
        //TODO: what necessary form moving the end-effector to a spesific coordinat. 
    }

    /**
     * Open tray will open a tray with a spesific number.
     *
     * @param trayNumber is the number of the tray wanted to open.
     * @return False if the tray number do not exsist.
     */
    public boolean openTray(int trayNumber) {
        // TODO: Fill method
        // Generate the Move cmd for moving to the tray(nr) openging coordinate.
        // Send cmd. 
        // Check enum for status. 
        // Generate a Lock cmd used for trigg the Lock machanism to close. 
        // Send cmd. 
        // Check enum for status. 
        // Generate the Move cmd for opening the tray completely open
        // Send cmd. 
        // Check enum for status. 
        // Generate a Lock cmd used for trigg the Lock machanism to open.
        // Send cmd. 
        return true;
    }

    /**
     * Close Tray will close a tray with a spesific number.
     *
     * @param trayNumber is the nuber of the tray wanted to close
     * @return False if the tray number do not exist.
     */
    public boolean closeTray(int trayNumber) {
        // TODO: Fill method
        // Generate the Move cmd for moving to the tray(nr) closing coordinate. 
        // Send cmd. 
        // Check enum for status. 
        // Generate a Lock cmd used for trigg the Lock machanism to close. 
        // Send cmd. 
        // Check enum for status. 
        // Generate the Move cmd for closing the tray completely open
        // Send cmd. 
        // heck enum for status. 
        // Generate a Lock cmd used for trigg the Lock machanism to open.
        // Send cmd. 
        return true;
    }

    /**
     * Removes roe from all the coordinates given in the Arraylist.
     *
     * @param coordinates Arraylist of coordinates to be removed from.
     */
    public void removeRoe(ArrayList<Coordinate> coordinates) {
        // TODO: Fill method
        // 1. Generate a move cmd to the first coordinat.
        // 2. send cmd. 
        // 3. Remove Coordinate form arrayList. 
        // 4. Generate pickUpRoe cmd for removing the roe. 
        // 5. Send cmd.
        // 6. redo form point 1. to the arrayList is empty. 

    }

    /**
     * Calibrate will send a calibration command.
     */
    public void calibrate() {
        // TODO: Fill method
        // Generate a Calibrate End Positions cmd
        // Send cmd 
        // Wait for correct enum status. 
        // Generate find number of trays in rack cmd. 
        // Send cmd. 
        // Wait for correct enum status. 
    }

    /**
     *
     * @return
     */
    public int getNumberOfTrays() {
        // TODO: Fill method
        // Generate cmd for requesting nr of trays in rack from arduino.         
        return 3; // TODO: Return number of trays in rack. 
    }

    /**
     * Take a picture at e spesefic frame number.
     *
     * @param framNumber
     */
    public void takePicture(int framNumber) {
        // TODO: Fill method
    }

    /**
     *
     */
    public void toggleLight() {
        // TODO: Fill method
        //Toggle light
    }

}