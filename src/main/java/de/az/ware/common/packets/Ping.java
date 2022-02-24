package de.az.ware.common.packets;

import de.az.ware.connection.packet.Packet;

public class Ping {

    public static class Request implements Packet {

        private String message;


        public Request() {
        }

        public Request(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    public static class Response implements Packet {

        private String message;


        public Response() {
        }

        public Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

}
