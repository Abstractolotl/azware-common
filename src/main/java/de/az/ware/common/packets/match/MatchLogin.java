package de.az.ware.common.packets.match;

import de.az.ware.connection.packet.Packet;
import de.az.ware.connection.packet.RequestPacket;

import java.util.UUID;

public abstract class MatchLogin {

    public enum Status {
        OK,
        MATCH_NOT_FOUND
    }

    public static class Request implements Packet {

        private UUID matchtoken;

        public Request(UUID matchtoken) {
            this.matchtoken = matchtoken;
        }

        public Request() {
        }

        public UUID getMatchtoken() {
            return matchtoken;
        }

        public void setMatchtoken(UUID matchtoken) {
            this.matchtoken = matchtoken;
        }
    }

    public static class Response implements Packet {

        private Status status;

        public Response() {
        }

        public Response(Status status) {
            this.status = status;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

    }

}
