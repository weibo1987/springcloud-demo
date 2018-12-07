package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 15:08
 */
public class Timer {
    public static void main(String[] args) {


        /**
         *
         *  Returns an Observable that emits {@code 0L} after a specified delay, and then completes.
         *
         *  可以看出 经过timer之后, Observable 转换为一个只发送 0L 的被观察源.
         *
         */

        System.out.println(LocalDateTime.now());
        Observable.just(1, 2, 3)
            .timer(2, TimeUnit.SECONDS)
            .subscribe(s -> {
                System.out.println(s + "--------" + LocalDateTime.now());
            });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
