package patterns.structuralPatterns.proxy;

public class CashedYoutubeClass implements ThirdPartyYoutubeLib{

    ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();

    @Override
    public void listVideos() {

    }

    @Override
    public void getVideos() {

    }
}
