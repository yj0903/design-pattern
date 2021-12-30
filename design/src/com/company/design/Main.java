// observer pattern
// 이벤트 리스너 구현할 때 쓰이는 디자인패턴

package com.company.design;

import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;

public class Main {
    public static void main(String[] args) {

        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event){
                System.out.println(event);
            }
        });

        button.click("메시지 전달, 클릭 1");
        button.click("메시지 전달, 클릭 2");
        button.click("메시지 전달, 클릭 3");
        button.click("메시지 전달, 클릭 4");


    }
}




// decorator pattern

//package com.company.design;
//
//import com.company.design.decorator.*;
//
//public class Main {
//    public static void main(String[] args) {
//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3 model
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//
//
//        // a4 model
//        ICar audi4 = new A4(audi, "A3");
//        audi4.showPrice();
//
//
//        // a5 model
//        ICar audi5 = new A5(audi, "A3");
//        audi5.showPrice();
//    }
//}






// proxy design pattern

//package com.company.design;
//
//import com.company.design.aop.AopBrowser;
//import com.company.design.proxy.Browser;
//import com.company.design.proxy.BrowserProxy;
//import com.company.design.proxy.IBrowser;
//
//import java.util.concurrent.atomic.AtomicLong;
//
//public class Main {
//    public static void main(String[] args) {
////        Browser browser = new Browser("www.naver.com");
////        // main에는 default constructor 필요가 없잖아...
////        browser.show();
////        browser.show();
////        browser.show();
////        browser.show();
//
////        BrowserProxy browserProxy = new BrowserProxy("www.naver.com");
////        browserProxy.show();
////        browserProxy.show();
////        browserProxy.show();
////        browserProxy.show();
//
//
//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//        IBrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//                });
//
//        aopBrowser.show();
//        System.out.println("loading time: "+end.get());
//
//        aopBrowser.show();
//        System.out.println("loading time: "+end.get());
//    }
//}





// Adapter design pattern

//package com.company.design;
//import com.company.design.adapter.*;
//public class Main {
//    public static void main(String[] args) {
//        // 110V 헤어드라이기
//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        // 220V 청소기
//        Cleaner cleaner = new Cleaner();
//        // connect(cleaner); // 맞지 않음. 220V를 110V로 변환해주는 어댑터 필요함.
//        SocketAdapter socketAdapter1 = new SocketAdapter(cleaner);
//        connect(socketAdapter1);
//
//        // 220V 에어컨
//        AirConditioner airConditioner = new AirConditioner();
//        SocketAdapter socketAdapter2 = new SocketAdapter(airConditioner);
//        connect(socketAdapter2);
//    }
//    // 220V -> 110V 변환기
//    public static void connect(Electronic110V electronic110V){
//        electronic110V.powerOn();
//    }
//}






// singleton Main

//package com.company.design;
//import com.company.design.singleton.AClazz;
//import com.company.design.singleton.BClazz;
//import com.company.design.singleton.SocketClient;
//public class Main {
//    public static void main(String[] args) {
//        AClazz aClazz  = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient aClient = aClazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));
//    }
//}
