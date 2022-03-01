package de.az.ware.common.packets.request;

import de.az.ware.connection.packet.RequestPacket;
import de.az.ware.connection.packet.ResponsePacket;

public abstract class Ping {

    public static class Request extends RequestPacket {

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

    public static class Response extends ResponsePacket {

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
