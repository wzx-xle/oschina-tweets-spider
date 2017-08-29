package ren.wxyz.spider.oschina.tweets;

import lombok.extern.slf4j.Slf4j;

/**
 * 启动类
 *
 * @author wxyz 2017-08-29_19:28
 */
@Slf4j
public class App {

    static {
        log.info("start app");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> log.info("stop app") ));
    }

    /**
     * 启动方法
     *
     * @author wxyz 2017-08-29_19:28
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
