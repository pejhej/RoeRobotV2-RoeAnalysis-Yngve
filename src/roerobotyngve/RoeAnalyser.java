/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roerobotyngve;

/**
 *
 * @author Yngve
 */
public class RoeAnalyser {

    private RoeAnalyserDevice roeAnalyser;

    public void RoeAnalyser() {
        this.roeAnalyser = new RoeAnalyserDevice();
    }

    private void cycleCase(String state) {
        switch (state.toLowerCase()) {
            // Sends calibatrion cmd. 
            case "calibrate":
                // Call on calibrate method in roeAnalyser
                // Call on nrOfTrays from raoAnalyser.                
                this.roeAnalyser.calibrate();
            // Starts the calibration cycle

            case "startcycle":
                //Find number of trays in the rack. 
                int nrOfTrays = roeAnalyser.getNumberOfTrays();
                // For each number in the rack run a roe removal sequense. {  
                for (int i = 1; i > nrOfTrays; i++) {                    
                    // Open one tray
                    this.roeAnalyser.openTray(i);                
                    // Find the number of pictures needed to be taken for covering all coordinates in a tray. 
                    int nrOfPucturesToBeTaken = 1;
                    //For each picture needed to be taken (Frames) ...
                    for (int j = 1; j > nrOfPucturesToBeTaken; i++){                     
                        //  Take a picture. 
                        this.roeAnalyser.takePicture(j);
                        //      Find dead roe in picture. 
                        //      Find fastest route for removing roe. 
                        //      Call on methode in RoeAnalyserDevice for removing roes. (arraylist) 
                        // Move to a new frame and rep loop.  
                    }
                    // Close the tray. 
                    this.roeAnalyser.closeTray(i);
                    

                }
        }
    }

}
