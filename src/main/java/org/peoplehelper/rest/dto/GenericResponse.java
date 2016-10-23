package org.peoplehelper.rest.dto;

public class GenericResponse {

    private boolean success;

    public GenericResponse() {}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
