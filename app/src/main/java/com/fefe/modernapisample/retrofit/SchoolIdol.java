package com.fefe.modernapisample.retrofit;

/**
 * Created by fefe on 2017/01/17.
 */

public class SchoolIdol {
    private String japanese_name;
    private int age;
    private String birthday;
    private String blood;
    private int height;
    private String measurements;
    private String favorite_food;
    private String least_favorite_food;
    private SchoolIdolCv cv;
    private String official_url;
    private String chibi_small;

    public String getJapanese_name() {
        return japanese_name;
    }

    public void setJapanese_name(String japanese_name) {
        this.japanese_name = japanese_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    public String getFavorite_food() {
        return favorite_food;
    }

    public void setFavorite_food(String favorite_food) {
        this.favorite_food = favorite_food;
    }

    public String getLeast_favorite_food() {
        return least_favorite_food;
    }

    public void setLeast_favorite_food(String least_favorite_food) {
        this.least_favorite_food = least_favorite_food;
    }

    public SchoolIdolCv getCv() {
        return cv;
    }

    public void setCv(SchoolIdolCv cv) {
        this.cv = cv;
    }

    public String getOfficial_url() {
        return official_url;
    }

    public void setOfficial_url(String official_url) {
        this.official_url = official_url;
    }

    public String getChibi_small() {
        return chibi_small;
    }

    public void setChibi_small(String chibi_small) {
        this.chibi_small = chibi_small;
    }
}