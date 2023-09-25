package com.aastha.drivingapp.model;

public class Alert {
    private int alertId;

    private String timestamp;

    private boolean isOverspeeding;

    private String vehicleId;

    // highway, residential, commercial, city_center.
    private String locationType;

    public int getAlertId() {
        return alertId;
    }

    public void setAlertId(int alertId) {
        this.alertId = alertId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isOverspeeding() {
        return isOverspeeding;
    }

    public void setOverspeeding(boolean overspeeding) {
        isOverspeeding = overspeeding;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
