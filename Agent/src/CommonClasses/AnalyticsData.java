package CommonClasses;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AnalyticsData implements Serializable {
    private static final long serialVersionUID = 8468838128889418316L;
    private String StartLongitude;
    private String StartLatitude;
    private String EndLongitude;
    private String EndLatitude;
    private String startTime;
    private String endTime;
    private String maxAltitude;
    private String maxSpeed;
    private String miles;
    private boolean state = true;

    public AnalyticsData(String analytics){
        String[] dataMembers = analytics.split(" ");
        this.setStartLongitude(dataMembers[0].split(":")[1]);
        this.setStartLatitude((dataMembers[1].split(":")[1]));
        this.setEndLongitude((dataMembers[2].split(":")[1]));
        this.setEndLatitude((dataMembers[3].split(":")[1]));
        this.setStartTime((dataMembers[4].split(":")[1]) + " " +  dataMembers[5]);
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String time = currentTime.format(timeFormatter);
        System.out.println("end time is: "+time);
//        this.setEndTime((dataMembers[4].split(":")[1]) + " " + dataMembers[7]);
        this.setEndTime(time);
        this.setMaxAltitude((dataMembers[8].split(":")[1]));
        this.setMaxSpeed((dataMembers[9].split(":")[1]));
        double mi = Double.parseDouble((dataMembers[10].split(":")[1]));
        this.setMiles((String.format("%.3f", mi)));
    }

    public String getStartLongitude() {
        return StartLongitude;
    }

    public void setStartLongitude(String startLongitude) {
        StartLongitude = startLongitude;
    }

    public String getStartLatitude() {
        return StartLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        StartLatitude = startLatitude;
    }

    public String getEndLongitude() {
        return EndLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        EndLongitude = endLongitude;
    }

    public String getEndLatitude() {
        return EndLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        EndLatitude = endLatitude;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(String maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


    public void print(){
        System.out.println("StartLongitude:" +StartLongitude +" StartLatitude:" + StartLatitude + " EndLongitude:" + EndLongitude + " EndLatitude:" +EndLatitude + " startTime:" + startTime + " endTime:" + endTime + " maxAltitude:" + maxAltitude + " maxSpeed:" +maxSpeed + " miles:" + miles);
    }
}
