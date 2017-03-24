/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenwebapp;

import java.lang.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author
 */
public class DebugMe {
    private static Logger log = LoggerFactory.getLogger(DebugMe.class);
    
    public static void main( String args[] )
    {
        while (true)
        {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            String s = "start debug";
            log.debug(s);
        }
    }
}
