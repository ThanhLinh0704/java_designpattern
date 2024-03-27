/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatternabstract;

/**
 *
 * @author laptop lenovo
 */
public class BakeryTest {

    public static void main(String[] args) {
        BakeryFactory europeanFactory = new EuropeanBakeryFactory();
        Cake europeanBread = europeanFactory.createBread();
        europeanBread.bake();
        

//        europeanFactory = new AsianBakeryFactory();
//        Cake bread = europeanFactory.createPastry();
//        bread.bake();
        
        
        BakeryFactory asianFactory = new AsianBakeryFactory();
        Cake asianPastry = asianFactory.createPastry();
        asianPastry.bake();
    }


}
