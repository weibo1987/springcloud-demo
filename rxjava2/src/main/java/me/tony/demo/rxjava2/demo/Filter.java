package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 14:20
 */
public class Filter {
    public static void main(String[] args) {


        /**
         * Filter: 过滤器操作
         */
        Observable.fromArray(1, 2, 3, 4, 5, 67, 213, 32131, 432423, 5345435)
            .filter(arg -> arg > 100)
            .subscribe(System.out::println);
    }
}
