package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 13:59
 */
public class FlatMap {
    public static void main(String[] args) {
        Observable.just(1, 2, 3).flatMap(integer -> {
            List<String> list = new ArrayList<>();
            IntStream.range(1, 5).forEach(n -> list.add("my num is : " + integer));
            return Observable.fromIterable(list).delay(1, TimeUnit.MILLISECONDS);
        }).subscribe(System.out::println);
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
