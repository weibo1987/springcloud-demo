package me.tony.demo.rxjava2.demo;

import io.reactivex.Flowable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 16:04
 */
public class Take {
    public static void main(String[] args) {

        /**
         * take: 至多接收多少个参数
         */
        Flowable.fromArray(1, 2, 213, 12312, 12312312)
            .take(4)
            .subscribe(System.out::println);

        System.out.println("------------------------------ ");

        Flowable.fromArray(1, 2, 213, 12312, 12312312)
            .take(40)
            .subscribe(System.out::println);
    }
}
