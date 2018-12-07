package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 15:57
 */
public class DoOnNext {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
            .doOnNext(integer -> System.out.println("doOnNext:  保存到数据库成功 -> " + integer))
            .doAfterNext(integer -> System.out.println("doAfterNext :  保存到缓存成功 ->" + integer))
            .subscribe(integer -> System.out.println("subscribe.onNext :  ->" + integer));
    }
}
