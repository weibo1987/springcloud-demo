package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 15:47
 */
public class Interval {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        /**
         *  三个参数 分别是 第一次延迟多少单位，间隔单位， 单位量纲
         *
         *  Returns an Observable that emits a {@code 0L} after the {@code initialDelay} and ever increasing numbers
         *  after each {@code period} of time thereafter.
         *
         *  类比timer操作. 转换为从0计数的发射器，带间隔延迟.
         */

        Disposable disposable = Observable.just(1, 2, 3, 4).interval(3, 2, TimeUnit.SECONDS)
            .subscribe(
                s -> {
                    System.out.println(s + "-------" + LocalDateTime.now());
                });

        try {
            Thread.sleep(10000);
            disposable.dispose();
            System.out.println("--------- 取消订阅 -------- ");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
