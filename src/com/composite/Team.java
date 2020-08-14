package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Team extends Component{
    private List<Component> members = new ArrayList<>();

    public void add(Component member){ members.add(member); }

    @Override
    public void deploy() {
       for (Component member:members){
           member.deploy();
       }
    }
}
