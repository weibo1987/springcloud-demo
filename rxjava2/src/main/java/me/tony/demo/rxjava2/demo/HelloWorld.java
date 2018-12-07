package me.tony.demo.rxjava2.demo;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 这是rxjava2的hello world 样例.
 *
 * @author : weibo
 * @version : v1.0
 * @since : 2018/12/7 11:01
 */
public class HelloWorld {

    public static void main(String[] args) {

        /**
         * 概念：
         * 1. Observable ： 事件源
         * 2. observableEmitter : 事件发射器
         * 3. onNext 发射事件
         * 4. subscribe 订阅会触发 ObservableOnSubscribe 的 subscribe 方法
         * 5. Observer 观察者，接收者。 disposable 取消订阅. onnext 对标 emitter的onnext 一个接收一个发送
         */


        Observable.create((ObservableOnSubscribe<String>) observableEmitter -> {
            System.out.println("start to send event ...");
            observableEmitter.onNext("hello world rxjava2!");
            observableEmitter.onNext("hello world rxjava3!");
            observableEmitter.onNext("hello world rxjava4!");
            observableEmitter.onNext("hello world rxjava4!");
            observableEmitter.onNext("hello world rxjava4!");
            observableEmitter.onNext("hello world rxjava4!");

            observableEmitter.onComplete();

        }).subscribe(new Observer<String>() {


            Disposable disposable;


            @Override
            public void onSubscribe(Disposable disposable) {
                this.disposable = disposable;
            }

            @Override
            public void onNext(String s) {
                System.out.println(disposable.isDisposed() + "--------");
                System.out.println("on next : " + s);

                if (s.contains("rxjava3")) {
                    disposable.dispose();
                }

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println(" Received complete !");
            }
        });
    }

}
