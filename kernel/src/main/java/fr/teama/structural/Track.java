package fr.teama.structural;

import fr.teama.generator.Visitable;
import fr.teama.generator.Visitor;
import fr.teama.structural.enums.InstrumentEnum;

import javax.sound.midi.Instrument;
import java.util.List;

public class Track implements Visitable {
    private InstrumentEnum instrument;
    private List<Bar> bars;

    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public List<Bar> getBars() {
        return bars;
    }

    public void setBars(List<Bar> bars) {
        this.bars = bars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Track{" +
                "bars=" + bars +
                ", instrument=" + instrument +
                '}';
    }

}