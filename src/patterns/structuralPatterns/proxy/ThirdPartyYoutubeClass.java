package patterns.structuralPatterns.proxy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{



    @Override
    public String listVideos() {
        return "List of Videos";
    }

    @Override
    public void getVideos() {

    }
}
