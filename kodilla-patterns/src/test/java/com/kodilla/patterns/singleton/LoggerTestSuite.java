package com.kodilla.patterns.singleton;

import com.kodilla.patterns.singletone.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void startLogging() {
        Logger.getInstance().log("firstLog");
        Logger.getInstance().log("secondLog");
        Logger.getInstance().log("thirdLog");
        Logger.getInstance().log("fourthLog");
        Logger.getInstance().log("fifthLog");
    }

    @Test
    public void getLastLogTest() {
        // given

        // when
        String lastLog = Logger.getInstance().getLastLog();

        // then
        Assert.assertEquals("fifthLog", lastLog);
    }
}
