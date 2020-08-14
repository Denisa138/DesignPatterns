package com.visitor;

public class FormatSegment extends Segment{
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.filter(this);
    }
}
