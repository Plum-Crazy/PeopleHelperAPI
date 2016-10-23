package org.peoplehelper.rest.dto;

public class DeductRoomsRequest {

    private long providerId;
    private int roomCount;

    public DeductRoomsRequest() {}

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }
}
