package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 16:46
 */
public class Debounce {
    public static void main(String[] args) {

        /**
         *
         * 1 ---- 2 - 3 4 5 ----*
         *
         * 最后一个必出.
         * debounce: 小于等于某值的间隔的忽略掉.
         *
         */
        Observable.create(emitter -> {
            emitter.onNext(1);
            Thread.sleep(400);
            emitter.onNext(2);
            Thread.sleep(100);
            emitter.onNext(3);
            Thread.sleep(40);
            emitter.onNext(4);
            Thread.sleep(60);
            emitter.onNext(5);
            Thread.sleep(40);
            emitter.onComplete();
        }).debounce(100, TimeUnit.MILLISECONDS)
            .subscribe(System.out::println);
    }
}
