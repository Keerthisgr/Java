package com.xworkz.tabapp.tab;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Tab {
        private String model;
        private double price;
        private int modelId;

        public Tab() {
            System.out.println("Default constructor");
        }
        @Override
        public String toString(){
            return "Tab(Model: "+this.model+","+" Price: "+this.price+")";
        }
        @Override
        public int hashCode(){
            return modelId;
        }
        @Override
        public boolean equals(Object obj){
            Tab tab = (Tab) obj;
            if(this.hashCode()==tab.hashCode()&&this.price==tab.price&&this.model==tab.model)
                return true;
            return false;
        }
    }


