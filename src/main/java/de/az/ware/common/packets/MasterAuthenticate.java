package de.az.ware.common.packets;

import de.az.ware.connection.packet.Packet;

public abstract class MasterAuthenticate {

    public enum Status {
        OK,
        INVALID_TOKEN,
        ERROR
    }

    public static class Request implements Packet {
        private String authToken;

        public Request(String authToken) {
            this.authToken = authToken;
        }

        public Request() {
        }

        public String getAuthToken() {
            return authToken;
        }

        public void setAuthToken(String authToken) {
            this.authToken = authToken;
        }
    }

    public static class Response implements Packet {
        private Status status;

        public Response(Status status) {
            this.status = status;
        }

        public Response() {
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }
    }

}
