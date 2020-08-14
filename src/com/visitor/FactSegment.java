package com.visitor;

public class FactSegment extends Segment{
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.filter(this);
    }
}
