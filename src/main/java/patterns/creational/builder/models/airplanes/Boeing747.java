package patterns.creational.builder.models.airplanes;

import patterns.creational.builder.models.parts.Boeing747Bathroom;

public class Boeing747 extends Aircraft {

    private Boeing747Bathroom boeing747Bathroom;

    public Boeing747Bathroom getBoeing747Bathroom() {
        return boeing747Bathroom;
    }

    public void setBoeing747Bathroom(Boeing747Bathroom boeing747Bathroom) {
        this.boeing747Bathroom = boeing747Bathroom;
    }

}
