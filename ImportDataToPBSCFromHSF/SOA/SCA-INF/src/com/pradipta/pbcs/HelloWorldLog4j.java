package com.pradipta.pbcs;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class HelloWorldLog4j {

    public static void main(String[] args) throws InterruptedException {

        FileAppender fileAppender = new FileAppender();
        fileAppender.setName("FileLogger");
        fileAppender.setFile("D:\\WorkSpace\\Oil_N_Gas_ISA_Workspace\\mylog.log");
        fileAppender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
        fileAppender.setThreshold(Level.DEBUG);
        fileAppender.setAppend(true);
        fileAppender.activateOptions();


        Logger logger;

        logger = Logger.getLogger(HelloWorldLog4j.class);
        logger.addAppender(fileAppender);
        logger.setLevel(Level.INFO);

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + "PRADIPTA");
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + "PRADIPTA");
        }

        logger.warn("This is warn : " + "PRADIPTA");
        logger.error("This is error : " + "PRADIPTA");
        logger.fatal("This is fatal : " + "PRADIPTA");
        
        Thread.sleep(20000);
        
        System.out.println(logger.getAdditivity());
        System.out.println(logger.getAllAppenders());
        
        logger = Logger.getLogger(HelloWorldLog4j.class);
        logger.addAppender(fileAppender);
        
        logger = Logger.getLogger(HelloWorldLog4j.class);
        logger.addAppender(fileAppender);

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + "PRADIPTA2");
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + "PRADIPTA2");
        }

        logger.warn("This is warn : " + "PRADIPTA2");
        logger.error("This is error : " + "PRADIPTA2");
        logger.fatal("This is fatal : " + "PRADIPTA2");
        
        
    }
}
