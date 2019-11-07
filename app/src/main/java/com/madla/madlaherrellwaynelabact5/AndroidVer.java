package com.madla.madlaherrellwaynelabact5;

public class AndroidVer {
    int logo;
    String name, ver, api, date;

    public AndroidVer(int logo, String name, String ver, String api, String date){
        this.logo = logo;
        this.name = name;
        this.ver = ver;
        this.api = api;
        this.date = date;
    }

    public int getLogo(){
        return logo;
    }
    public String getName(){
        return name;
    }
    public String getVer(){
        return ver;
    }
    public String getApi(){
        return api;
    }
    public String getDate(){
        return date;
    }
}
