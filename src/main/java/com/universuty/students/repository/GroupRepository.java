package com.universuty.students.repository;

import com.universuty.students.entity.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public List<Group> findGroups() {
        return groups;
    }

    public Group findById(Integer id) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getId().equals(id)) {
                return groups.get(i);
            }
        }
        return null;
    }

    public void createGroup(Group group) {
        Random r = new Random();
        Integer id = r.nextInt();
        group.setId(id);
        groups.add(group);
    }

    public void groupUpdate(Group group) {
        for (int i = 0; i < groups.size(); i++)
            if(groups.get(i).getId().equals(group.getId())){
                groups.get(i).setCourse(group.getCourse());
                groups.get(i).setDirection(group.getDirection());
                groups.get(i).setNumber(group.getNumber());
                return;
            }
    }
    public void groupDelete(Integer id){
        for (int i = 0; i < groups.size(); i++){
            if(groups.get(i).getId().equals(id)){
                groups.remove(i);
                return;
            }
        }
    }

}
