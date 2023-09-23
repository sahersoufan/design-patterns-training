package patterns.behavioralPatterns.chainOfResponsipilty;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component{

    protected List<Component> componentList = new ArrayList<>();

    public void add(Component component){
        component.container = this;
        componentList.add(component);
    }




}
