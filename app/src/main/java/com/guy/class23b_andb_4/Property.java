package com.guy.class23b_andb_4;

public abstract class Property {

    protected String image = "";
    protected String desc = "";
    protected String location = "";
    protected long price = 0;

    public Property() {
    }

    public String getImage() {
        return image;
    }

    public Property setImage(String image) {
        this.image = image;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Property setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Property setLocation(String location) {
        this.location = location;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public Property setPrice(long price) {
        this.price = price;
        return this;
    }
}
