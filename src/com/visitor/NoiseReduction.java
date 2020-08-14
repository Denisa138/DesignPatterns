package com.visitor;

public class NoiseReduction extends AudioFilter{
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("apply noise reduction on a factSegment.");
    }

    @Override
    public void filter(FormatSegment formatsegment) {
        System.out.println("apply noise reduction on formatSegment.");
    }
}
