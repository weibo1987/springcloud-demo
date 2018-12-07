package me.tony.demo.rxjava2.demo;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

import java.util.Random;

/**
 * 输入描述.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 16:08
 */
public class Single {

    public static void main(String[] args) {
        io.reactivex.Single.just(new Random().nextInt())
            .subscribe(new SingleObserver<Integer>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onSuccess(Integer integer) {
                    System.out.println(integer + "--------- received success !");
                }

                @Override
                public void onError(Throwable e) {

                }
            });
    }
}
