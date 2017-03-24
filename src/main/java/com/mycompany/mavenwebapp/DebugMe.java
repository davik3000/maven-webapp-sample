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

    private static final Logger logger = LoggerFactory.getLogger(DebugMe.class);

    public static void main(String args[]) {
        logger.debug("Started...");
        boolean loop = true;
        while (loop) {
            try {
                Thread.sleep(5000);

                String s = "Slept for 5 sec...";
                logger.debug(s);
            } catch (Exception e) {
            }
        }
        logger.debug("Out of the loop. Ending...");
    }
}
