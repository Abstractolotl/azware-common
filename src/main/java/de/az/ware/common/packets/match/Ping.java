package de.az.ware.common.packets.match;

import de.az.ware.connection.packet.RequestPacket;
import de.az.ware.connection.packet.ResponsePacket;

import java.util.UUID;

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

        public Response(UUID requestID, String message) {
            super(requestID);
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
