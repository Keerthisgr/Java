package com.xworkz.tabapp.tab;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Tab {
        private String model;
        private double price;

        public Tab() {
            System.out.println("Default constructor");
        }
        public String toString(){
            return "Tab(Model: "+this.model+","+" Price: "+this.price+")";
        }
    }


