package de.az.ware.common.packets;

import de.az.ware.common.model.MatchType;
import de.az.ware.connection.packet.Packet;

import java.util.UUID;

public class MatchCreation {

    public enum Status {
        OK,
        FULL_CAPACITY,
        ERROR
    }

    public static class Request implements Packet {

        private UUID matchID;
        private MatchType matchType;
        private String[] playerMatchTokens;

        public Request(MatchType matchType, String[] playerMatchTokens, UUID matchID) {
            this.matchType = matchType;
            this.playerMatchTokens = playerMatchTokens;
            this.matchID = matchID;
        }

        public Request() {
        }

        public UUID getMatchID() {
            return matchID;
        }

        public void setMatchID(UUID matchID) {
            this.matchID = matchID;
        }

        public MatchType getMatchType() {
            return matchType;
        }

        public void setMatchType(MatchType matchType) {
            this.matchType = matchType;
        }

        public String[] getPlayerMatchTokens() {
            return playerMatchTokens;
        }

        public void setPlayerMatchTokens(String[] playerMatchTokens) {
            this.playerMatchTokens = playerMatchTokens;
        }
    }

    public static class Response implements Packet {

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
