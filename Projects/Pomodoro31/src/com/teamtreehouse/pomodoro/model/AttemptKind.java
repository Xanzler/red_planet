package com.teamtreehouse.pomodoro.model;

/**
 * Created by DIZ on 11.05.2017.
 */
public enum AttemptKind {
    FOCUS (5, "Focus time"),
    BREAK (5 * 60, "Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String DisplayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = DisplayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
