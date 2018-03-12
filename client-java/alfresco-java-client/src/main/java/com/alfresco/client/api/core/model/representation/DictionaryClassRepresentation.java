/*
 *   Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *   This file is part of Alfresco Java Client.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.alfresco.client.api.core.model.representation;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by kbryd on 6/1/2018.
 */
public class DictionaryClassRepresentation {
    @SerializedName("name")
    private String name;

    @SerializedName("isAspect")
    private String isAspect;

    @SerializedName("isContainer")
    private String isContainer;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("parent")
    private ClassTypeRepresentation parentType;

    @SerializedName("defaultAspects")
    private Map<String, ClassTypeRepresentation> defaultAspects;

    @SerializedName("properties")
    private Map<String, ClassPropertiesRepresentation> properties;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsAspect() {
        return isAspect;
    }

    public void setIsAspect(String isAspect) {
        this.isAspect = isAspect;
    }

    public String getIsContainer() {
        return isContainer;
    }

    public void setIsContainer(String isContainer) {
        this.isContainer = isContainer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClassTypeRepresentation getParentType() {
        return parentType;
    }

    public void setParentType(ClassTypeRepresentation parentType) {
        this.parentType = parentType;
    }

    public Map<String, ClassTypeRepresentation> getDefaultAspects() {
        return defaultAspects;
    }

    public void setDefaultAspects(Map<String, ClassTypeRepresentation> defaultAspects) {
        this.defaultAspects = defaultAspects;
    }

    public Map<String, ClassPropertiesRepresentation> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, ClassPropertiesRepresentation> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DictionaryClassRepresentation{" +
                "   name: '" + name + '\'' +
                "   isAspect: '" + isAspect + '\'' +
                "   isContainer: '" + isContainer + '\'' +
                "   title: '" + title + '\'' +
                "   description: '" + description + '\'' +
                "   parentType: '" + parentType +
                '}';
    }
}
