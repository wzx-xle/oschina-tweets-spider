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
        shutdownHook();
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

    /**
     * 应用关闭事件处理
     */
    private static void shutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                log.info("stop app");
            }
        });
    }
}
