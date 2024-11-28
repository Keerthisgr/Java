package com.xworkz.templeapp.temple;

public abstract class Temple implements TempleGuidelines{

    @Override
    public void removeShoes() {
        System.out.println("Remove Shoes");
    }

    @Override
    public void bowDown() {
        System.out.println("Bow Down");
    }

    @Override
    public void showRespect() {
        System.out.println("Show respect");
    }

    @Override
    public void donate() {
        System.out.println("Donate");
    }

    @Override
    public void bringAnOffering() {
        System.out.println("Bring an offering");
    }

    @Override
    public void ringTheBell() {
        System.out.println("Ring the bell");
    }

    @Override
    public void dressModesty() {
        System.out.println("Dress Modesty");
    }

    @Override
    public void cameraNotAllowed() {
        System.out.println("Camera not allowed");
    }
}
