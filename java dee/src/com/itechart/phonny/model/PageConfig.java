package com.itechart.phonny.model;

public class PageConfig {

    private boolean hasNext;

    private boolean hasPrevious;

    public PageConfig() {

        super();
    }

    public boolean isHasNext() {

        return this.hasNext;
    }

    public void setHasNext(final boolean hasNext) {

        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {

        return this.hasPrevious;
    }

    public void setHasPrevious(final boolean hasPrevious) {

        this.hasPrevious = hasPrevious;
    }
}
