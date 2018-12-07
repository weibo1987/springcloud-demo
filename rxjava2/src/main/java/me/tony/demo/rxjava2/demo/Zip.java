package me.tony.demo.rxjava2.demo;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 13:39
 */
public class Zip {
    public static void main(String[] args) {

        Observable observable1 = Observable.create(emitter -> {
            emitter.onNext("A");
            emitter.onNext("B");
            emitter.onNext("C");
        });
        Observable observable2 = Observable.create(emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
            emitter.onNext(4);
            emitter.onNext(5);
        });


        /**
         * zip 专用于合并事件，该合并不是连接（连接操作符后面会说），
         * 而是两两配对，也就意味着，最终配对出的 Observable 发射事件数目只和少的那个相同。
         */

        Observable.zip(observable1, observable2, (s, integer) -> s + "---" + integer)
            .subscribe(System.out::println);

    }

}
