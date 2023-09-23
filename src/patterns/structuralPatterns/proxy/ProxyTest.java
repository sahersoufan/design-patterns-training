package patterns.structuralPatterns.proxy;

public class ProxyTest {
    public static void test(){
        ThirdPartyYoutubeClass y1 = new ThirdPartyYoutubeClass();
        CashedYoutubeClass c1 = new CashedYoutubeClass(y1);

        System.out.println(y1.listVideos());
        System.out.println(c1.listVideos());
    }
}
