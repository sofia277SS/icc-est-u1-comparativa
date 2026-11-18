public class Results {
    private String name;
    private long duration;
    private String sample;
    
    public Results(String name, long duration, String sample) {
        this.name = name;
        this.duration = duration;
        this.sample = sample;
    }

    public String getName() {
        return name;
    }

    public long getDuration() {
        return duration;
    }

    public String getSample() {
        return sample;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Override 
    public String toString() {
        return "Results -> " +
                "name: '" + name + '\'' +
                ", duration: " + duration +
                ", duration en segundos: " + (duration / 1000000000.0) +
                ", sample: '" + sample + '\''
                ;
    }
    
}
