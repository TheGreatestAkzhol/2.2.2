package web.model;

public class Car {
    private int id;
    private String series;
    private int age;

    public Car(int id, String series, int age) {
        this.id = id;
        this.series = series;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
