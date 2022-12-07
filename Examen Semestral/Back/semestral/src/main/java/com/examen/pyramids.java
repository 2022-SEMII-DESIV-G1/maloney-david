package com.examen;

import java.util.ArrayList;
import java.util.Arrays;

public class pyramids {
    ArrayList<pyramid> lstPyramid= new ArrayList<>();

    public  ArrayList<pyramid> getPyramid() {
        return lstPyramid;
    }

    public  void getPyramidtestt() {
        for (pyramid p :lstPyramid) {
            System.out.println("i - " +  Arrays.toString(p.myPiramid));
        }
    }
    public  pyramid getPyramidbyId() {
       System.out.println(Arrays.toString(lstPyramid.get(0).myPiramid));
        return lstPyramid.get(0);
    }

    public  void addPyramid(String[] pyr) {
        pyramid p = new pyramid();
        p.myPiramid = pyr;
        lstPyramid.add(p);
    }
}
