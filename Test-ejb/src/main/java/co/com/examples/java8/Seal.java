/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * IMUTABLE OBJECT
 * 
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public final class Seal {

    private final String name;
    private final List<String> friends;

    public Seal(String name, List<String> friends) {
        this.name = name;
        this.friends = new ArrayList<>();
        if (friends != null) {
            friends.forEach((friend) -> {
                this.friends.add(friend);
            });
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        List<String> copy = new ArrayList<>();
        friends.forEach((friend) -> {
            copy.add(friend);
        });
        return copy;
    }
}
