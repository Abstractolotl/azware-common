package de.az.ware.common.model;

import java.util.UUID;

public class MatchInformation {

    private UUID matchToken;
    private MatchType matchType;
    private String matchServerAdress;

    public MatchInformation(UUID matchToken, MatchType matchType, String matchServerAdress) {
        this.matchToken = matchToken;
        this.matchType = matchType;
        this.matchServerAdress = matchServerAdress;
    }

    public MatchInformation(){

    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public String getMatchServerAdress() {
        return matchServerAdress;
    }

    public void setMatchServerAdress(String matchServerAdress) {
        this.matchServerAdress = matchServerAdress;
    }

    public UUID getMatchToken() {
        return matchToken;
    }

    public void setMatchToken(UUID matchToken) {
        this.matchToken = matchToken;
    }

}
