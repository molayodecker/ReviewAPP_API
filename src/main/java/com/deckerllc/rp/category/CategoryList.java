package com.deckerllc.rp.category;

/**
 * Created by molayodecker on 16/10/2017.
 */

//TODO CHANGE LIST TO ARRAYS
public enum CategoryList {
    RESTAURANT("EPO"), HOTEL("GOLDEN-TULIP"), HOSPITAL("RIDGE"), BANK("BARCLAYS"),
    INSURANCE("METROPOLITAN"), RADIO("JOY FM"), BEACH("LA BEACH"), APARTMENT("AIRPORT HILLS"),
    UNIVERSITY("LEGON"), MALL("ACCRA MALL"), CINEMA("SILVER BIRD"), AUTO_DEALER("RANA MOTORS"),
    WASHING_BAY("SHELL WASHING"), GAS_STATION("TOTAL");
    private String lists;
    private CategoryList(String list){ this.lists = list;}
    public static CategoryList findByList(String bylists){
        for(CategoryList list: CategoryList.values()){
            if(list.lists.equalsIgnoreCase(bylists)){
                    return list;
            }
        }
        return null;
    }
}
