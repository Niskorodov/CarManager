package com.company;

public interface Serviceable {
    public abstract boolean IsReadyToService();
    public int getDistanceOnService();
    public void addDistance(int additionalDistance);
    public void addDistance(double additionalDistance);
}
