package CommonClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaneData implements Serializable{
    private static final long serialVersionUID = 6529685098267757690L;

    List<PlaneVar> PlaneVarList = new ArrayList<>();
    private String ID;
    private String PlaneName;
    private PlaneVar aileron;
    private PlaneVar elevator;
    private PlaneVar rudder;
    private PlaneVar flaps;
    private PlaneVar longitude;
    private PlaneVar latitude;
    private PlaneVar airSpeed_kt;
    private PlaneVar vertSpeed;
    private PlaneVar throttle_0;
    private PlaneVar throttle_1;
    private PlaneVar altitude; // height
    private PlaneVar pitchDeg;
    private PlaneVar rollDeg;
    private PlaneVar heading;
    private PlaneVar turnCoordinator; // didnt find

    public String getPlaneName() {
        return PlaneName;
    }

    public PlaneVar getAileron() {
        return aileron;
    }

    public PlaneVar getElevator() {
        return elevator;
    }

    public PlaneVar getRudder() {
        return rudder;
    }

    public PlaneVar getFlaps() {
        return flaps;
    }

    public PlaneVar getLongitude() {
        return longitude;
    }

    public PlaneVar getLatitude() {
        return latitude;
    }

    public PlaneVar getAirSpeed_kt() {
        return airSpeed_kt;
    }

    public PlaneVar getVertSpeed() {
        return vertSpeed;
    }

    public PlaneVar getThrottle_0() {
        return throttle_0;
    }

    public PlaneVar getThrottle_1() {
        return throttle_1;
    }

    public PlaneVar getAltitude() {
        return altitude;
    }

    public PlaneVar getPitchDeg() {
        return pitchDeg;
    }

    public PlaneVar getRollDeg() {
        return rollDeg;
    }

    public PlaneVar getHeading() {
        return heading;
    }

    public PlaneVar getTurnCoordinator() {
        return turnCoordinator;
    }
    public List<PlaneVar> getAllVars() {
        return PlaneVarList;
    }

    public String getId() {
        return ID;
    }
    public PlaneData() {
    }

    public void Print(){
        System.out.println(
                "aileron:"+this.aileron.value +",elevator:" + this.elevator.value +",rudder:" + this.rudder.value+",longitude-deg:" + this.longitude.value+",latitude-deg:" + this.latitude.value
                        +",airspeed-kt:" + this.airSpeed_kt.value+",vertical-speed-fps:" + this.vertSpeed.value+",throttle_0:" + this.throttle_0.value+",throttle_1:" + this.throttle_1.value
                        +",altitude-ft:" + this.altitude.value +",pitch-deg:" + this.pitchDeg.value+",roll-deg:" + this.rollDeg.value
                        +",heading-deg:" + this.heading.value+",side-slip-deg:" + this.turnCoordinator.value);
    }


    public void setPlaneVarList(List<PlaneVar> planeVarList) {
        PlaneVarList = planeVarList;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPlaneName(String planeName) {
        PlaneName = planeName;
    }

    public void setAileron(PlaneVar aileron) {
        this.aileron = aileron;
        PlaneVarList.add(aileron);
    }

    public void setElevator(PlaneVar elevator) {
        this.elevator = elevator;
        PlaneVarList.add(elevator);

    }

    public void setRudder(PlaneVar rudder) {
        this.rudder = rudder;
        PlaneVarList.add(rudder);

    }

    public void setFlaps(PlaneVar flaps) {
        this.flaps = flaps;
        PlaneVarList.add(flaps);
    }

    public void setLongitude(PlaneVar longitude) {
        this.longitude = longitude;
        PlaneVarList.add(longitude);
    }

    public void setLatitude(PlaneVar latitude) {
        this.latitude = latitude;
        PlaneVarList.add(latitude);
    }

    public void setAirSpeed_kt(PlaneVar airSpeed_kt) {
        this.airSpeed_kt = airSpeed_kt;
        PlaneVarList.add(airSpeed_kt);
    }

    public void setVertSpeed(PlaneVar vertSpeed) {
        this.vertSpeed = vertSpeed;
        PlaneVarList.add(vertSpeed);
    }

    public void setThrottle_0(PlaneVar throttle_0) {
        this.throttle_0 = throttle_0;
        PlaneVarList.add(throttle_0);
    }

    public void setThrottle_1(PlaneVar throttle_1) {
        this.throttle_1 = throttle_1;
        PlaneVarList.add(throttle_1);

    }

    public void setAltitude(PlaneVar altitude) {
        this.altitude = altitude;
        PlaneVarList.add(altitude);
    }

    public void setPitchDeg(PlaneVar pitchDeg) {
        this.pitchDeg = pitchDeg;
        PlaneVarList.add(pitchDeg);
    }

    public void setRollDeg(PlaneVar rollDeg) {
        this.rollDeg = rollDeg;
        PlaneVarList.add(rollDeg);
    }

    public void setHeading(PlaneVar heading) {
        this.heading = heading;
        PlaneVarList.add(heading);
    }

    public void setTurnCoordinator(PlaneVar turnCoordinator) {
        this.turnCoordinator = turnCoordinator;
        PlaneVarList.add(turnCoordinator);
    }

    public List<PlaneVar> getPlaneVarList() {
        return PlaneVarList;
    }

    public String getID() {
        return ID;
    }

    public String getPlaneName() {
        return PlaneName;
    }
}