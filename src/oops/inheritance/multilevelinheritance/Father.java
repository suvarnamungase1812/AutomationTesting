package oops.inheritance.multilevelinheritance;

public class Father extends GrandFather{
    public void bike()
    {
        System.out.println("bike");
    }
    public void bunglow()
    {
        System.out.println("bunglow");
    }

    public static void main(String[] args) {
        Father father=new Father();

            father.farm();
            father.tractor();
        }
    }

