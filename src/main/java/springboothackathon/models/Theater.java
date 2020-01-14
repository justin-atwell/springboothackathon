package springboothackathon.models;

public class Theater {
    private int id;
    private String name;
    private float latitude;
    private float longitude;

    public Theater(int _id, String _name, float _latitude, float _longitude){
        this.id = _id;
        this.name = _name;
        this.latitude = _latitude;
        this.longitude = _longitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
}
