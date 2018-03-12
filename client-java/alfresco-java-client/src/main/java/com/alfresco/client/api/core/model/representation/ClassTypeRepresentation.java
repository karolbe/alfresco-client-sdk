package com.alfresco.client.api.core.model.representation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kbryd on 6/1/2018.
 */
public class ClassTypeRepresentation {

    @SerializedName("name")
    public String name;

    @SerializedName("title")
    public String title;

    @SerializedName("url")
    public String url;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "class ClassTypeRepresentation {" +
                "   name: \"" + name + '\"' +
                "   title: \"" + title + '\"' +
                "   url: \"" + url + '\"' +
                '}';
    }
}
