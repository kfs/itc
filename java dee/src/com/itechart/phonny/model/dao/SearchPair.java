package com.itechart.phonny.model.dao;

public class SearchPair {

    private SearchAttribute attribute;

    private Object          value;

    public SearchPair() {

        super();
    }

    public SearchAttribute getAttribute() {

        return this.attribute;
    }

    public void setAttribute(final SearchAttribute attribute) {

        this.attribute = attribute;
    }

    public Object getValue() {

        return this.value;
    }

    public void setValue(final Object value) {

        this.value = value;
    }

}
