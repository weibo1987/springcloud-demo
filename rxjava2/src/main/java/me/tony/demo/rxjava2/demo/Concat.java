package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 13:49
 */
public class Concat {
    public static void main(String[] args) {

        Observable.concat(Observable.just(1, 2, 3), Observable.just(4, 5, 6))
            .subscribe(integer -> System.out.println(integer));

        System.out.println("----------------------------");
        Observable.concat(Observable.just(1, 2, 3), Observable.just(4, 5, 6), Observable.just(4, 5, 6))
            .subscribe(integer -> System.out.println(integer));

        System.out.println("----------------------------");

        Observable.concat(Observable.just(1, 2, 3), Observable.just("A", "B", "C"), Observable.just(false, true, false))
            .subscribe(integer -> System.out.println(integer));


        /**
         * concat : 多个发射器连接成一个发射器，然后发射.
         */


    }
}
