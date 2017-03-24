/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenwebapp;

import java.lang.String;

/**
 *
 * @author artasda
 */
public class DebugMe {
    public static void main( String args[] )
    {
        while (true)
        {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            String s = "start debug";
            System.out.println(s);
        }
    }
}
