package com.guy.class23b_andb_4;

public class Fresh extends Property {

    protected String logo = "";
    protected String contractor = "";
    protected String extra = "";


    public Fresh() {
        super();
    }

    public String getLogo() {
        return logo;
    }

    public Fresh setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getContractor() {
        return contractor;
    }

    public Fresh setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public Fresh setExtra(String extra) {
        this.extra = extra;
        return this;
    }
}
