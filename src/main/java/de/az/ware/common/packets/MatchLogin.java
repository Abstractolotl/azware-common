package de.az.ware.common.packets;

import de.az.ware.connection.packet.Packet;
import de.az.ware.connection.packet.RequestPacket;

import java.util.UUID;

public abstract class MatchLogin {

    public static class Request extends RequestPacket {

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


}
