package patterns.structuralPatterns.proxy;

public class CashedYoutubeClass implements ThirdPartyYoutubeLib{

    private ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();
    private String additionalInfo = "additional";

    public CashedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public String listVideos() {
        return service.listVideos() +" "+ additionalInfo;
    }

    @Override
    public void getVideos() {

    }
}
