package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 16:03
 */
public class Skip {

    public static void main(String[] args) {
        /**
         * skip: 跳过几个元素之后 生成新的被观察源.
         */
        Observable.just(1, 2, 3123, 4123123, 5)
            .skip(3)
            .subscribe(System.out::println);
    }
}
