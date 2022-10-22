package com.example.omokproject;

public class RoomData {

    private String portnumber;
    private String ipnumber;

    public RoomData(String portnumber, String ipnumber) {
        this.portnumber = portnumber;
        this.ipnumber= ipnumber;
    }



    public String getPortnumber() {
        return portnumber;
    }

    public String getIpnumber() {
        return ipnumber;
    }

    public void setPortnumber(String portnumber) {
        this.portnumber = portnumber;
    }

    public void setIpnumber(String ipnumber) {
        this.ipnumber = ipnumber;
    }



}
