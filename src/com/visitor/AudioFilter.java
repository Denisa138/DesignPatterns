package com.visitor;

public abstract class AudioFilter {
    public abstract void filter(FactSegment factSegment);
    public abstract void filter(FormatSegment formatsegment);
}
