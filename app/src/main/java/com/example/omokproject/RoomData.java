package com.example.omokproject;

import android.widget.Button;

public class RoomData {

    private String portnumber;
    private String ipnumber;

    private Button btnentergame;

    public RoomData(String portnumber, String ipnumber ,Button btnentergame) {
        this.portnumber = portnumber;
        this.ipnumber= ipnumber;
        this.btnentergame = btnentergame;
    }



    public String getPortnumber() {
        return portnumber;
    }

    public String getIpnumber() {
        return ipnumber;
    }

    public Button getBtnentergame() {
        return btnentergame;
    }

    public void setPortnumber(String portnumber) {
        this.portnumber = portnumber;
    }

    public void setIpnumber(String ipnumber) {
        this.ipnumber = ipnumber;
    }

    public void setBtnentergame(Button btnentergame) {
        this.btnentergame = btnentergame;
    }

}
