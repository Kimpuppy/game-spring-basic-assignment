package com.gamebasic.runcard.dto;

import lombok.Getter;

@Getter
public class DeckCount {
    private final Long gameId;
    private final Long count;

    public DeckCount(Long gameId, Long count) {
        this.gameId = gameId;
        this.count = count;
    }
}
