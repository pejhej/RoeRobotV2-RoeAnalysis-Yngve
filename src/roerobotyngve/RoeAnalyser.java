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
public class RoeAnalyser{
    
    private RoeAnalyserDevice roeAnalyser;
    private TrayRegiser trayRegister; 
    
    
    public void startCycle(){
        this.roeAnalyser = new RoeAnalyserDevice();
        this.trayRegister = new TrayRegiser();
    }
    
    private void cycleCase(String state){
        switch(state.toLowerCase()){
            // Sends calibatrion cmd. 
            case "calibrate": 
                // Call on calibrate method in roeAnalyser
                // Call on nrOfTrays from raoAnalyser.                
                this.roeAnalyser.calibrate();
            // Starts the calibration cycle
                
            case "startCycle": 
                //Find number of trays in the rack. 
                int nrOfTrays = this.trayRegister.getNumberOfTrays();
                // Find the number of pictures needed to be taken for covering all coordinates in a tray. 
                int nrOfPucturesToBeTaken; 
                // For each number in the rack run a roe removal sequense. 
                for (int i = 0; i >= nrOfTrays; i++){
                    // Open one tray. 
                    this.roeAnalyser.openTray(i);
                    //For each picture needed to be taken (Frames) ...
                    //--->  Take a picture. 
                    //      Find dead roe in picture. 
                    //      Find rastest route for removing roe. 
                    //      Call on methode in RoeAnalyserDevice for removing roes. (arraylist) 
                    // Move to a new frame and rep loop. 
                    
                    
                }
                
                
        }
    }

    
}
