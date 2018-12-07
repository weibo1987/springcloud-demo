package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

import java.util.stream.Collectors;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 14:26
 */
public class Buffer {

    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
            .buffer(3, 2)
            .subscribe(
                integers -> System.out.println(integers.stream().map(s -> s + "")
                    .collect(Collectors.joining("-"))));
    }
}
