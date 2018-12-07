package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 14:18
 */
public class Distinct {

    public static void main(String[] args) {
        /**
         * distinct 是去重操作.
         */
        Observable.fromArray(1, 2, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 6)
            .distinct()
            .subscribe(System.out::println);
    }
}
