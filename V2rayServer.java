package com.abdelvpn.app;

public class V2rayServer {

    public String name;
    public String address;
    public int port;
    public String uuid;
    public String network;
    public String path;

    public V2rayServer(String name,String address,int port,String uuid,String network,String path){
        this.name = name;
        this.address = address;
        this.port = port;
        this.uuid = uuid;
        this.network = network;
        this.path = path;
    }
}
