package com.ankita.OOPs;

public class  BOX {
    double l;
    double w;
    double h;
    BOX(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    // cube
    BOX(double size){
        this.l=size;
        this.w=size;
        this.h=size;
    }
    BOX(double l, double w, double h){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    BOX(BOX old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Box is running ");
    }

}
