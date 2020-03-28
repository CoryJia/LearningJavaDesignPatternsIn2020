package creatationalpattern.ch04simplefatory.sample01;

import creatationalpattern.ch04simplefatory.XMLUtil;

public class TvClient {
    public static void main(String[] args) throws Exception {
        TV tv;

        String brandName = XMLUtil.getType("TVconfig.xml");
        tv = TVFactory.productTV(brandName);
        tv.play();
    }
}
