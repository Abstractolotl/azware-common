package de.az.ware.common.packets.request;

import de.az.ware.common.model.MatchType;
import de.az.ware.connection.packet.Packet;
import de.az.ware.connection.packet.RequestPacket;
import de.az.ware.connection.packet.ResponsePacket;

import java.util.UUID;

public abstract class MatchCreation {

    public enum Status {
        OK,
        FULL_CAPACITY,
        ERROR
    }

    public static class Request extends RequestPacket {

        private MatchType matchType;
        private UUID[] playerMatchTokens;

        public Request(MatchType matchType, UUID[] playerMatchTokens) {
            this.matchType = matchType;
            this.playerMatchTokens = playerMatchTokens;
        }

        public Request() {
        }

        public MatchType getMatchType() {
            return matchType;
        }

        public void setMatchType(MatchType matchType) {
            this.matchType = matchType;
        }

        public UUID[] getPlayerMatchTokens() {
            return playerMatchTokens;
        }

        public void setPlayerMatchTokens(UUID[] playerMatchTokens) {
            this.playerMatchTokens = playerMatchTokens;
        }
    }

    public static class Response extends ResponsePacket {

        private Status status;
        private UUID matchID;

        public Response() {
        }

        public Response(Status status, UUID matchID) {
            this.status = status;
            this.matchID = matchID;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public UUID getMatchID() {
            return matchID;
        }

        public void setMatchID(UUID matchID) {
            this.matchID = matchID;
        }

    }

}
