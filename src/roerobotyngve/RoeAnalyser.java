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
public class RoeAnalyser implements Runnable {

    @Override
    public void run() {

    }

    //State enum for the switchcase
    private enum State {
        Calibrate,
        Running,
        Stop,
        Waiting,
        Pause;
    }

    private RoeAnalyserDevice roeAnalyser;
    // State enum
    private State state;

    // Flag to remember if the tray is open or not
    private boolean trayOpen;
    // The amount of pictures to be taken
    private int nrOfPicturesToBeTaken;
    // The tray number currently opperated.   
    private int currentTray;

    // Time for each cycle
    private long timePerCycle;

    /**
     * Constructor
     */
    public RoeAnalyser() {
        this.roeAnalyser = new RoeAnalyserDevice();
        this.trayOpen = false;
        this.currentTray = 1;
        this.timePerCycle = 0;
    }

    /**
     * Set the time per cycle for the robot The time per cycle is the time for
     * the robot to wait before it starts over
     *
     * @param time given in minutes.
     */
    public void setTimePerCycle(int time) {
        this.timePerCycle = (time / 60) * 10 ^ -3;
    }

    
    /**
     * Get time per cycle in millisecounds. 
     * @return time per cycle in millisecounds. 
     */
    public long getTimePerCycle() {
        return this.timePerCycle;
    }

    /**
     * Do calibrate the robot.
     */
    public void doCalibrate() {
        state = State.Calibrate;
        this.cycleCase(state);
    }

    /**
     * Do Start the robot sycle
     */
    public void doStartRobot() {
        state = State.Running;
        this.cycleCase(state);
    }

    /**
     * Do pause the robot. Prevent the robot from doing enything.
     */
    public void doPauseRobot() {
        state = State.Pause;
        this.cycleCase(state);
    }

    /**
     * Stopps the robot
     */
    public void doStopRobot() {
        state = State.Stop;
        this.cycleCase(state);
    }

    /**
     * Cycle switch case for controlling the robot.
     *
     * @param state
     */
    private void cycleCase(State state) {
        switch (state) {
            // Sends calibatrion cmd. 
            case Calibrate:
                // Call on calibrate method in roeAnalyser
                // Call on nrOfTrays from raoAnalyser.                
                this.roeAnalyser.calibrate();
            // Starts the calibration cycle

            // Run the picking operation. 
            case Running:
                //Find number of trays in the rack. 
                int nrOfTrays = roeAnalyser.getNumberOfTrays();
                // For each number in the rack run a roe removal sequense. {

                for (int i = currentTray; i > nrOfTrays; i++) {
                    this.currentTray = i;
                    // Open one tray
                    this.roeAnalyser.openTray(i);
                    this.trayOpen = true;
                    // Find the number of pictures needed to be taken for covering all coordinates in a tray. 
                    nrOfPicturesToBeTaken = 1;
                    //For each picture needed to be taken (Frames) ...
                    for (int j = 1; j > nrOfPicturesToBeTaken; i++) {
                        //  Take a picture. 
                        this.roeAnalyser.takePicture(j);
                        //      Find dead roe in picture. 
                        //      Find fastest route for removing roe. 
                        //      Call on methode in RoeAnalyserDevice for removing roes. (arraylist) 
                        // Move to a new frame and rep loop.  
                    }
                    // Close the tray. 
                    this.roeAnalyser.closeTray(i);
                    this.trayOpen = false;
                }
                break;

            // Wait for timer to expire. 
            case Waiting:
                //Wait for interval
                break;
        }
    }

}
